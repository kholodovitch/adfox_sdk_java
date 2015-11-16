package com.github.kholodovitch.adfox;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.http.client.ClientProtocolException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.interfaces.ILoadFromXml;

public class ActionAccountList implements IActionAccountList {

	private ApiClient apiClient;

	public ActionAccountList(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public List<Advertiser> advertiser() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException, InstantiationException, IllegalAccessException {
		return s(Advertiser.class);
	}

	public List<Banner> banner() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException, InstantiationException, IllegalAccessException {
		return s(Banner.class);
	}

	public List<BannerPlacements> bannerPlacements(long bannerId) throws XPathExpressionException, ClientProtocolException, UnsupportedOperationException, IOException, SAXException, ParserConfigurationException, AdFoxResultException, InstantiationException, IllegalAccessException {
		return s(BannerPlacements.class);
	}

	public List<Campaign> campaign() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException, InstantiationException, IllegalAccessException {
		return s(Campaign.class);
	}

	private <T extends ILoadFromXml> List<T> s(Class<T> c) throws ClientProtocolException, IOException, SAXException, ParserConfigurationException, XPathExpressionException, AdFoxResultException, InstantiationException, IllegalAccessException {
		Element resultElement = apiClient.callApi("account", "list", "banner");
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
	}

}
