package com.github.kholodovitch.adfox;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.github.kholodovitch.adfox.exceptions.AdFoxCallException;
import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.exceptions.AdFoxParsingException;
import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;
import com.github.kholodovitch.adfox.interfaces.IApiClient;
import com.github.kholodovitch.adfox.interfaces.ILoadFromXml;
import com.github.kholodovitch.adfox.interfaces.IObjectAccount;
import com.github.kholodovitch.adfox.interfaces.IObjectPlacement;

public class ApiClient implements IApiClient {

	private IObjectAccount account = new ObjectAccount(this);
	private IObjectPlacement placement = new ObjectPlacement(this);

	private String login;
	private String passSha256;

	public ApiClient(String login, String passSha256) {
		this.login = login;
		this.passSha256 = passSha256;
	}

	public IObjectAccount account() {
		return account;
	}

	public IObjectPlacement placement() {
		return placement;
	}

	Element callApiRaw(String object, String action, String actionObject, String... additional) throws ClientProtocolException, IOException, UnsupportedOperationException, SAXException, ParserConfigurationException, XPathExpressionException,
			AdFoxResultException {
		String uri = "https://login.adfox.ru/API.php?loginAccount=" + login + "&loginPassword=" + passSha256;
		if (object != null)
			uri += "&object=" + object;
		if (action != null)
			uri += "&action=" + action;
		if (actionObject != null)
			uri += "&actionObject=" + actionObject;
		if (additional != null && additional.length > 0) {
			for (int i = 0; i < additional.length; i++)
				uri += "&" + additional[i];
		}

		HttpClientBuilder builder = HttpClientBuilder.create();
		CloseableHttpClient httpclient = builder.build();
		HttpGet httpget = new HttpGet(uri);
		HttpResponse response = httpclient.execute(httpget);
		HttpEntity entity = response.getEntity();

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(entity.getContent());

		XPath xPath = XPathFactory.newInstance().newXPath();
		NodeList nodes = (NodeList) xPath.evaluate("/response/status/code", doc, XPathConstants.NODESET);
		if (nodes != null && nodes.getLength() > 0) {
			int resultCode = Integer.parseInt(nodes.item(0).getTextContent());
			if (resultCode != 0) {
				Node errorNode = (Node)xPath.evaluate("/response/status/error", doc, XPathConstants.NODE);
				throw new AdFoxResultException("Can't result status code = " + resultCode + " (" + errorNode.getTextContent() + ")");
			}
		} else {
			throw new AdFoxResultException("Can't find result status code");
		}

		return (Element) doc.getDocumentElement();
	}

	Element callApi(String object, String action, String actionObject, String... additional) throws ClientProtocolException, IOException, UnsupportedOperationException, SAXException, ParserConfigurationException, XPathExpressionException, AdFoxResultException {
		XPath xPath = XPathFactory.newInstance().newXPath();
		Object resultElement = xPath.evaluate("/response/result", callApiRaw(object, action, actionObject, additional), XPathConstants.NODE);
		return (Element) resultElement;
	}

	<T extends ILoadFromXml> List<T> loadList(Class<T> c, String object, String action, String actionObject, String... additional) throws AdFoxException {
		Element resultElement;
		try {
			resultElement = callApi(object, action, actionObject, additional);
		} catch (AdFoxException e) {
			throw e;
		} catch (Throwable e) {
			throw new AdFoxCallException(e);
		}

		try {
			Node rowsElement = resultElement.getElementsByTagName("rows").item(0);
			int rowsCount = Integer.parseInt(rowsElement.getTextContent());

			XPath xPath = XPathFactory.newInstance().newXPath();
			NodeList nodes = (NodeList) xPath.evaluate("data/*[starts-with(local-name(), 'row')]", resultElement, XPathConstants.NODESET);

			@SuppressWarnings("unchecked")
			T[] result = (T[]) Array.newInstance(c, rowsCount);

			for (int i = 0; i < nodes.getLength(); i++) {
				Element item = (Element) nodes.item(i);
				int rowIndex = Integer.parseInt(item.getNodeName().substring(3));
				result[rowIndex] = c.newInstance();
				result[rowIndex].load(item);
			}
			return Arrays.asList(result);
		} catch (Throwable e) {
			throw new AdFoxParsingException(e);
		}
	}

	<T extends ILoadFromXml> T loadItem(Class<T> c, String object, String action, String actionObject, String... additional) throws AdFoxException {
		Element resultElement;
		try {
			resultElement = callApi(object, action, actionObject, additional);
		} catch (AdFoxException e) {
			throw e;
		} catch (Throwable e) {
			throw new AdFoxCallException(e);
		}

		try {
			T item = c.newInstance();
			item.load(resultElement);
			return item;
		} catch (Throwable e) {
			throw new AdFoxParsingException(e);
		}
	}

	int addItem(String object, String actionObject, String... additional) throws AdFoxException {
		Element resultElement;
		try {
			resultElement = callApiRaw(object, "add", actionObject, additional);
		} catch (AdFoxException e) {
			throw e;
		} catch (Throwable e) {
			throw new AdFoxCallException(e);
		}

		try {
			XPath xPath = XPathFactory.newInstance().newXPath();
			Node node = (Node) xPath.evaluate("/response/status/ID", resultElement, XPathConstants.NODE);
			return Integer.parseInt(node.getTextContent());
		} catch (Throwable e) {
			throw new AdFoxParsingException(e);
		}
	}
}
