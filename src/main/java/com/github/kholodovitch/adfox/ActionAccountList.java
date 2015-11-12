package com.github.kholodovitch.adfox;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.http.client.ClientProtocolException;
import org.xml.sax.SAXException;

import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;

public class ActionAccountList implements IActionAccountList {

	private ApiClient apiClient;

	public ActionAccountList(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public List<Banner> banner() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException {
		apiClient.callApi("account", "list", "banner");
		return null;
	}

	public BannerPlacements bannerPlacements(long bannerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
