package com.github.kholodovitch.adfox.objects;

import org.w3c.dom.Element;

public class BannerPlacements extends BaseObject {
	private String sectionID;
	private String isSectionOn;
	private String websiteName;
	private String sectionName;
	private int placeID;
	private String placeName;
	private String isPlaceOn;
	private String isWebsiteOn;
	private String websiteID;

	public void load(Element item) {
		sectionID = getStringContent(item, "sectionID");
		isSectionOn = getStringContent(item, "isSectionOn");
		websiteName = getStringContent(item, "websiteName");
		sectionName = getStringContent(item, "sectionName");
		placeID = getIntContent(item, "placeID");
		placeName = getStringContent(item, "placeName");
		isPlaceOn = getStringContent(item, "isPlaceOn");
		isWebsiteOn = getStringContent(item, "isWebsiteOn");
		websiteID = getStringContent(item, "websiteID");
	}

	public String getSectionID() {
		return sectionID;
	}

	public void setSectionID(String sectionID) {
		this.sectionID = sectionID;
	}

	public String getIsSectionOn() {
		return isSectionOn;
	}

	public void setIsSectionOn(String isSectionOn) {
		this.isSectionOn = isSectionOn;
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public int getPlaceID() {
		return placeID;
	}

	public void setPlaceID(int placeID) {
		this.placeID = placeID;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getIsPlaceOn() {
		return isPlaceOn;
	}

	public void setIsPlaceOn(String isPlaceOn) {
		this.isPlaceOn = isPlaceOn;
	}

	public String getIsWebsiteOn() {
		return isWebsiteOn;
	}

	public void setIsWebsiteOn(String isWebsiteOn) {
		this.isWebsiteOn = isWebsiteOn;
	}

	public String getWebsiteID() {
		return websiteID;
	}

	public void setWebsiteID(String websiteID) {
		this.websiteID = websiteID;
	}
}
