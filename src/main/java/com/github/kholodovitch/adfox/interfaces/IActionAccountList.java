package com.github.kholodovitch.adfox.interfaces;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.apache.http.client.ClientProtocolException;
import org.xml.sax.SAXException;

import com.github.kholodovitch.adfox.Banner;
import com.github.kholodovitch.adfox.BannerPlacements;
import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;

public interface IActionAccountList {
	List<Banner> banner() throws ClientProtocolException, UnsupportedOperationException, XPathExpressionException, IOException, SAXException, ParserConfigurationException, AdFoxResultException;

	BannerPlacements bannerPlacements(long bannerId);
}
