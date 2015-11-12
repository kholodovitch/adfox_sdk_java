package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

public class Banner extends BaseObject {
	private String ID;
	private String name;
	private String campaignID;
	private String campaignName;
	private String campaignDateStart;
	private String campaignDateEnd;
	private String bannerTypeID;
	private String bannerTypeName;
	private String status;
	private String isUnplaced;
	private String priority;
	private String impressions;
	private String impressionsToday;
	private String impressionsHour;
	private String clicks;
	private String clicksToday;
	private String clicksHour;
	private String targetingProfileID;
	private String targetingProfileName;
	private String isEvents;
	private String templateID;
	private String templateName;
	private String imageURL;
	private String hitURL;
	private String impressionCode;
	private String maxImpressions;
	private String maxImpressionsPerDay;
	private String maxImpressionsPerHour;
	private String maxClicks;
	private String maxClicksPerDay;
	private String maxClicksPerHour;
	private String dateStart;
	private String dateEnd;
	private String dateAdded;

	public Banner() {
	}

	public Banner(Element item) {
		ID = getStringContent(item, "ID");
		name = getStringContent(item, "name");
		campaignID = getStringContent(item, "campaignID");
		campaignName = getStringContent(item, "campaignName");
		campaignDateStart = getStringContent(item, "campaignDateStart");
		campaignDateEnd = getStringContent(item, "campaignDateEnd");
		bannerTypeID = getStringContent(item, "bannerTypeID");
		bannerTypeName = getStringContent(item, "bannerTypeName");
		status = getStringContent(item, "status");
		isUnplaced = getStringContent(item, "isUnplaced");
		priority = getStringContent(item, "priority");
		impressions = getStringContent(item, "impressions");
		impressionsToday = getStringContent(item, "impressionsToday");
		impressionsHour = getStringContent(item, "impressionsHour");
		clicks = getStringContent(item, "clicks");
		clicksToday = getStringContent(item, "clicksToday");
		clicksHour = getStringContent(item, "clicksHour");
		targetingProfileID = getStringContent(item, "targetingProfileID");
		targetingProfileName = getStringContent(item, "targetingProfileName");
		isEvents = getStringContent(item, "isEvents");
		templateID = getStringContent(item, "templateID");
		templateName = getStringContent(item, "templateName");
		imageURL = getStringContent(item, "imageURL");
		hitURL = getStringContent(item, "hitURL");
		impressionCode = getStringContent(item, "impressionCode");
		maxImpressions = getStringContent(item, "maxImpressions");
		maxImpressionsPerDay = getStringContent(item, "maxImpressionsPerDay");
		maxImpressionsPerHour = getStringContent(item, "maxImpressionsPerHour");
		maxClicks = getStringContent(item, "maxClicks");
		maxClicksPerDay = getStringContent(item, "maxClicksPerDay");
		maxClicksPerHour = getStringContent(item, "maxClicksPerHour");
		dateStart = getStringContent(item, "dateStart");
		dateEnd = getStringContent(item, "dateEnd");
		dateAdded = getStringContent(item, "dateAdded");
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCampaignID() {
		return campaignID;
	}

	public void setCampaignID(String campaignID) {
		this.campaignID = campaignID;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDateStart() {
		return campaignDateStart;
	}

	public void setCampaignDateStart(String campaignDateStart) {
		this.campaignDateStart = campaignDateStart;
	}

	public String getCampaignDateEnd() {
		return campaignDateEnd;
	}

	public void setCampaignDateEnd(String campaignDateEnd) {
		this.campaignDateEnd = campaignDateEnd;
	}

	public String getBannerTypeID() {
		return bannerTypeID;
	}

	public void setBannerTypeID(String bannerTypeID) {
		this.bannerTypeID = bannerTypeID;
	}

	public String getBannerTypeName() {
		return bannerTypeName;
	}

	public void setBannerTypeName(String bannerTypeName) {
		this.bannerTypeName = bannerTypeName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsUnplaced() {
		return isUnplaced;
	}

	public void setIsUnplaced(String isUnplaced) {
		this.isUnplaced = isUnplaced;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getImpressions() {
		return impressions;
	}

	public void setImpressions(String impressions) {
		this.impressions = impressions;
	}

	public String getImpressionsToday() {
		return impressionsToday;
	}

	public void setImpressionsToday(String impressionsToday) {
		this.impressionsToday = impressionsToday;
	}

	public String getImpressionsHour() {
		return impressionsHour;
	}

	public void setImpressionsHour(String impressionsHour) {
		this.impressionsHour = impressionsHour;
	}

	public String getClicks() {
		return clicks;
	}

	public void setClicks(String clicks) {
		this.clicks = clicks;
	}

	public String getClicksToday() {
		return clicksToday;
	}

	public void setClicksToday(String clicksToday) {
		this.clicksToday = clicksToday;
	}

	public String getClicksHour() {
		return clicksHour;
	}

	public void setClicksHour(String clicksHour) {
		this.clicksHour = clicksHour;
	}

	public String getTargetingProfileID() {
		return targetingProfileID;
	}

	public void setTargetingProfileID(String targetingProfileID) {
		this.targetingProfileID = targetingProfileID;
	}

	public String getTargetingProfileName() {
		return targetingProfileName;
	}

	public void setTargetingProfileName(String targetingProfileName) {
		this.targetingProfileName = targetingProfileName;
	}

	public String getIsEvents() {
		return isEvents;
	}

	public void setIsEvents(String isEvents) {
		this.isEvents = isEvents;
	}

	public String getTemplateID() {
		return templateID;
	}

	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getHitURL() {
		return hitURL;
	}

	public void setHitURL(String hitURL) {
		this.hitURL = hitURL;
	}

	public String getImpressionCode() {
		return impressionCode;
	}

	public void setImpressionCode(String impressionCode) {
		this.impressionCode = impressionCode;
	}

	public String getMaxImpressions() {
		return maxImpressions;
	}

	public void setMaxImpressions(String maxImpressions) {
		this.maxImpressions = maxImpressions;
	}

	public String getMaxImpressionsPerDay() {
		return maxImpressionsPerDay;
	}

	public void setMaxImpressionsPerDay(String maxImpressionsPerDay) {
		this.maxImpressionsPerDay = maxImpressionsPerDay;
	}

	public String getMaxImpressionsPerHour() {
		return maxImpressionsPerHour;
	}

	public void setMaxImpressionsPerHour(String maxImpressionsPerHour) {
		this.maxImpressionsPerHour = maxImpressionsPerHour;
	}

	public String getMaxClicks() {
		return maxClicks;
	}

	public void setMaxClicks(String maxClicks) {
		this.maxClicks = maxClicks;
	}

	public String getMaxClicksPerDay() {
		return maxClicksPerDay;
	}

	public void setMaxClicksPerDay(String maxClicksPerDay) {
		this.maxClicksPerDay = maxClicksPerDay;
	}

	public String getMaxClicksPerHour() {
		return maxClicksPerHour;
	}

	public void setMaxClicksPerHour(String maxClicksPerHour) {
		this.maxClicksPerHour = maxClicksPerHour;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
}
