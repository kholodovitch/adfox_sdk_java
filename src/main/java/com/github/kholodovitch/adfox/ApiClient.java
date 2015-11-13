package com.github.kholodovitch.adfox;

import java.io.IOException;

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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;
import com.github.kholodovitch.adfox.interfaces.IApiClient;
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

	Element callApi(String object, String action, String actionObject, String... additional) throws ClientProtocolException, IOException, UnsupportedOperationException, SAXException, ParserConfigurationException, XPathExpressionException, AdFoxResultException {
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
				throw new AdFoxResultException("Can't result status code = " + resultCode);
			}
		} else {
			throw new AdFoxResultException("Can't find result status code");
		}

		Object resultElement = xPath.evaluate("/response/result", doc.getDocumentElement(), XPathConstants.NODE);
		return (Element) resultElement;
	}

}
