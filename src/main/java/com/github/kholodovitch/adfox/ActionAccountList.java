package com.github.kholodovitch.adfox;

import java.io.IOException;
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

public class ActionAccountList implements IActionAccountList {

	private ApiClient apiClient;

	public ActionAccountList(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public List<Banner> banner() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException {
		Element resultElement = apiClient.callApi("account", "list", "banner");
		Node rowsElement = resultElement.getElementsByTagName("rows").item(0);
		int rowsCount = Integer.parseInt(rowsElement.getTextContent());

		XPath xPath = XPathFactory.newInstance().newXPath();
		NodeList nodes = (NodeList) xPath.evaluate("data/*[starts-with(local-name(), 'row')]", resultElement, XPathConstants.NODESET);

		Banner[] result = new Banner[rowsCount];
		for (int i = 0; i < nodes.getLength(); i++) {
			Element item = (Element) nodes.item(i);
			int rowIndex = Integer.parseInt(item.getNodeName().substring(3));
			result[rowIndex] = new Banner(item);
		}
		return Arrays.asList(result);
	}

	public List<BannerPlacements> bannerPlacements(long bannerId) {
		Element resultElement = apiClient.callApi("account", "list", "banner", "bannerID=" + Long.toString(bannerId));
		Node rowsElement = resultElement.getElementsByTagName("rows").item(0);
		int rowsCount = Integer.parseInt(rowsElement.getTextContent());

		XPath xPath = XPathFactory.newInstance().newXPath();
		NodeList nodes = (NodeList) xPath.evaluate("data/*[starts-with(local-name(), 'row')]", resultElement, XPathConstants.NODESET);

		BannerPlacements[] result = new BannerPlacements[rowsCount];
		for (int i = 0; i < nodes.getLength(); i++) {
			Element item = (Element) nodes.item(i);
			int rowIndex = Integer.parseInt(item.getNodeName().substring(3));
			result[rowIndex] = new BannerPlacements(item);
		}
		return Arrays.asList(result);
	}

}
