package com.github.kholodovitch.adfox.objects;

import org.w3c.dom.Element;

public class WebSite extends BaseObject {
	private String template;
	private String loadsToday;
	private String adNetworkID;
	private String categoryID;
	private String adNetworkName;
	private String isReferrerByURL;
	private String dateAdded;
	private String CTRToday;
	private String webmasterAccount;
	private String impressionsToday;
	private String clicksToday;
	private String isActive;
	private String categoryName;
	private String name;
	private String impressionsDefaultToday;
	private String isBannersExchange;
	private int ID;
	private String templateTypeID;
	private String URL;
	private String webmasterID;

	public void load(Element item) {
		template = getStringContent(item, "template");
		loadsToday = getStringContent(item, "loadsToday");
		adNetworkID = getStringContent(item, "adNetworkID");
		categoryID = getStringContent(item, "categoryID");
		adNetworkName = getStringContent(item, "adNetworkName");
		isReferrerByURL = getStringContent(item, "isReferrerByURL");
		dateAdded = getStringContent(item, "dateAdded");
		CTRToday = getStringContent(item, "CTRToday");
		webmasterAccount = getStringContent(item, "webmasterAccount");
		impressionsToday = getStringContent(item, "impressionsToday");
		clicksToday = getStringContent(item, "clicksToday");
		isActive = getStringContent(item, "isActive");
		categoryName = getStringContent(item, "categoryName");
		name = getStringContent(item, "name");
		impressionsDefaultToday = getStringContent(item, "impressionsDefaultToday");
		isBannersExchange = getStringContent(item, "isBannersExchange");
		ID = getIntContent(item, "ID");
		templateTypeID = getStringContent(item, "templateTypeID");
		URL = getStringContent(item, "URL");
		webmasterID = getStringContent(item, "webmasterID");
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getLoadsToday() {
		return loadsToday;
	}

	public void setLoadsToday(String loadsToday) {
		this.loadsToday = loadsToday;
	}

	public String getAdNetworkID() {
		return adNetworkID;
	}

	public void setAdNetworkID(String adNetworkID) {
		this.adNetworkID = adNetworkID;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getAdNetworkName() {
		return adNetworkName;
	}

	public void setAdNetworkName(String adNetworkName) {
		this.adNetworkName = adNetworkName;
	}

	public String getIsReferrerByURL() {
		return isReferrerByURL;
	}

	public void setIsReferrerByURL(String isReferrerByURL) {
		this.isReferrerByURL = isReferrerByURL;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getCTRToday() {
		return CTRToday;
	}

	public void setCTRToday(String CTRToday) {
		this.CTRToday = CTRToday;
	}

	public String getWebmasterAccount() {
		return webmasterAccount;
	}

	public void setWebmasterAccount(String webmasterAccount) {
		this.webmasterAccount = webmasterAccount;
	}

	public String getImpressionsToday() {
		return impressionsToday;
	}

	public void setImpressionsToday(String impressionsToday) {
		this.impressionsToday = impressionsToday;
	}

	public String getClicksToday() {
		return clicksToday;
	}

	public void setClicksToday(String clicksToday) {
		this.clicksToday = clicksToday;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImpressionsDefaultToday() {
		return impressionsDefaultToday;
	}

	public void setImpressionsDefaultToday(String impressionsDefaultToday) {
		this.impressionsDefaultToday = impressionsDefaultToday;
	}

	public String getIsBannersExchange() {
		return isBannersExchange;
	}

	public void setIsBannersExchange(String isBannersExchange) {
		this.isBannersExchange = isBannersExchange;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getTemplateTypeID() {
		return templateTypeID;
	}

	public void setTemplateTypeID(String templateTypeID) {
		this.templateTypeID = templateTypeID;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	public String getWebmasterID() {
		return webmasterID;
	}

	public void setWebmasterID(String webmasterID) {
		this.webmasterID = webmasterID;
	}

}
