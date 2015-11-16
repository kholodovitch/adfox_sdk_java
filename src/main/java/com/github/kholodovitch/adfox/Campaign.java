package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

import com.github.kholodovitch.adfox.interfaces.ILoadFromXml;

public class Campaign extends BaseObject {
	private String maxImpressionsPerHour;
	private String clicksPerHour;
	private String type;
	private String assistantAccount;
	private String impressionsSmoothTypeID;
	private String tracingPointsType;
	private String advertiserAccount;
	private String level;
	private String priority;
	private String ID;
	private String itemQty;
	private String isTrafficSmooth;
	private String impressionsAll;
	private String advertiserID;
	private String maxClicks;
	private String status;
	private String pricingTypeID;
	private String maxClicksPerHour;
	private String outerMarkID;
	private String dateStart;
	private String impressionsPerHour;
	private String dateFinished;
	private String bannerSequence;
	private String impressionsMethodID;
	private String maxClicksPerDay;
	private String superCampaignName;
	private String paymentMethodID;
	private String assistantID;
	private String scenarioPeriodID;
	private String dateAdded;
	private String dateEnd;
	private String pricingModel;
	private String impressionsToday;
	private String itemCost;
	private String name;
	private String additionalAssistantAccounts;
	private String mainPointID;
	private String superCampaignID;
	private String targetingProfileID;
	private String maxImpressions;
	private String clicksSmoothTypeID;
	private String maxImpressionsPerDay;
	private String additionalAssistantIDs;
	private String clicksAll;
	private String additionalAdvertiserIDs;
	private String clicksToday;
	private String sequence;
	private String isSession;
	private String additionalAdvertiserAccounts;
	private String pricingModelID;

	public void load(Element item) {
		maxImpressionsPerHour = getStringContent(item, "maxImpressionsPerHour");
		clicksPerHour = getStringContent(item, "clicksPerHour");
		type = getStringContent(item, "type");
		assistantAccount = getStringContent(item, "assistantAccount");
		impressionsSmoothTypeID = getStringContent(item, "impressionsSmoothTypeID");
		tracingPointsType = getStringContent(item, "tracingPointsType");
		advertiserAccount = getStringContent(item, "advertiserAccount");
		level = getStringContent(item, "level");
		priority = getStringContent(item, "priority");
		ID = getStringContent(item, "ID");
		itemQty = getStringContent(item, "itemQty");
		isTrafficSmooth = getStringContent(item, "isTrafficSmooth");
		impressionsAll = getStringContent(item, "impressionsAll");
		advertiserID = getStringContent(item, "advertiserID");
		maxClicks = getStringContent(item, "maxClicks");
		status = getStringContent(item, "status");
		pricingTypeID = getStringContent(item, "pricingTypeID");
		maxClicksPerHour = getStringContent(item, "maxClicksPerHour");
		outerMarkID = getStringContent(item, "outerMarkID");
		dateStart = getStringContent(item, "dateStart");
		impressionsPerHour = getStringContent(item, "impressionsPerHour");
		dateFinished = getStringContent(item, "dateFinished");
		bannerSequence = getStringContent(item, "bannerSequence");
		impressionsMethodID = getStringContent(item, "impressionsMethodID");
		maxClicksPerDay = getStringContent(item, "maxClicksPerDay");
		superCampaignName = getStringContent(item, "superCampaignName");
		paymentMethodID = getStringContent(item, "paymentMethodID");
		assistantID = getStringContent(item, "assistantID");
		scenarioPeriodID = getStringContent(item, "scenarioPeriodID");
		dateAdded = getStringContent(item, "dateAdded");
		dateEnd = getStringContent(item, "dateEnd");
		pricingModel = getStringContent(item, "pricingModel");
		impressionsToday = getStringContent(item, "impressionsToday");
		itemCost = getStringContent(item, "itemCost");
		name = getStringContent(item, "name");
		additionalAssistantAccounts = getStringContent(item, "additionalAssistantAccounts");
		mainPointID = getStringContent(item, "mainPointID");
		superCampaignID = getStringContent(item, "superCampaignID");
		targetingProfileID = getStringContent(item, "targetingProfileID");
		maxImpressions = getStringContent(item, "maxImpressions");
		clicksSmoothTypeID = getStringContent(item, "clicksSmoothTypeID");
		maxImpressionsPerDay = getStringContent(item, "maxImpressionsPerDay");
		additionalAssistantIDs = getStringContent(item, "additionalAssistantIDs");
		clicksAll = getStringContent(item, "clicksAll");
		additionalAdvertiserIDs = getStringContent(item, "additionalAdvertiserIDs");
		clicksToday = getStringContent(item, "clicksToday");
		sequence = getStringContent(item, "sequence");
		isSession = getStringContent(item, "isSession");
		additionalAdvertiserAccounts = getStringContent(item, "additionalAdvertiserAccounts");
		pricingModelID = getStringContent(item, "pricingModelID");
	}

	public String getMaxImpressionsPerHour() {
		return maxImpressionsPerHour;
	}

	public void setMaxImpressionsPerHour(String maxImpressionsPerHour) {
		this.maxImpressionsPerHour = maxImpressionsPerHour;
	}

	public String getClicksPerHour() {
		return clicksPerHour;
	}

	public void setClicksPerHour(String clicksPerHour) {
		this.clicksPerHour = clicksPerHour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAssistantAccount() {
		return assistantAccount;
	}

	public void setAssistantAccount(String assistantAccount) {
		this.assistantAccount = assistantAccount;
	}

	public String getImpressionsSmoothTypeID() {
		return impressionsSmoothTypeID;
	}

	public void setImpressionsSmoothTypeID(String impressionsSmoothTypeID) {
		this.impressionsSmoothTypeID = impressionsSmoothTypeID;
	}

	public String getTracingPointsType() {
		return tracingPointsType;
	}

	public void setTracingPointsType(String tracingPointsType) {
		this.tracingPointsType = tracingPointsType;
	}

	public String getAdvertiserAccount() {
		return advertiserAccount;
	}

	public void setAdvertiserAccount(String advertiserAccount) {
		this.advertiserAccount = advertiserAccount;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getItemQty() {
		return itemQty;
	}

	public void setItemQty(String itemQty) {
		this.itemQty = itemQty;
	}

	public String getIsTrafficSmooth() {
		return isTrafficSmooth;
	}

	public void setIsTrafficSmooth(String isTrafficSmooth) {
		this.isTrafficSmooth = isTrafficSmooth;
	}

	public String getImpressionsAll() {
		return impressionsAll;
	}

	public void setImpressionsAll(String impressionsAll) {
		this.impressionsAll = impressionsAll;
	}

	public String getAdvertiserID() {
		return advertiserID;
	}

	public void setAdvertiserID(String advertiserID) {
		this.advertiserID = advertiserID;
	}

	public String getMaxClicks() {
		return maxClicks;
	}

	public void setMaxClicks(String maxClicks) {
		this.maxClicks = maxClicks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPricingTypeID() {
		return pricingTypeID;
	}

	public void setPricingTypeID(String pricingTypeID) {
		this.pricingTypeID = pricingTypeID;
	}

	public String getMaxClicksPerHour() {
		return maxClicksPerHour;
	}

	public void setMaxClicksPerHour(String maxClicksPerHour) {
		this.maxClicksPerHour = maxClicksPerHour;
	}

	public String getOuterMarkID() {
		return outerMarkID;
	}

	public void setOuterMarkID(String outerMarkID) {
		this.outerMarkID = outerMarkID;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getImpressionsPerHour() {
		return impressionsPerHour;
	}

	public void setImpressionsPerHour(String impressionsPerHour) {
		this.impressionsPerHour = impressionsPerHour;
	}

	public String getDateFinished() {
		return dateFinished;
	}

	public void setDateFinished(String dateFinished) {
		this.dateFinished = dateFinished;
	}

	public String getBannerSequence() {
		return bannerSequence;
	}

	public void setBannerSequence(String bannerSequence) {
		this.bannerSequence = bannerSequence;
	}

	public String getImpressionsMethodID() {
		return impressionsMethodID;
	}

	public void setImpressionsMethodID(String impressionsMethodID) {
		this.impressionsMethodID = impressionsMethodID;
	}

	public String getMaxClicksPerDay() {
		return maxClicksPerDay;
	}

	public void setMaxClicksPerDay(String maxClicksPerDay) {
		this.maxClicksPerDay = maxClicksPerDay;
	}

	public String getSuperCampaignName() {
		return superCampaignName;
	}

	public void setSuperCampaignName(String superCampaignName) {
		this.superCampaignName = superCampaignName;
	}

	public String getPaymentMethodID() {
		return paymentMethodID;
	}

	public void setPaymentMethodID(String paymentMethodID) {
		this.paymentMethodID = paymentMethodID;
	}

	public String getAssistantID() {
		return assistantID;
	}

	public void setAssistantID(String assistantID) {
		this.assistantID = assistantID;
	}

	public String getScenarioPeriodID() {
		return scenarioPeriodID;
	}

	public void setScenarioPeriodID(String scenarioPeriodID) {
		this.scenarioPeriodID = scenarioPeriodID;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getPricingModel() {
		return pricingModel;
	}

	public void setPricingModel(String pricingModel) {
		this.pricingModel = pricingModel;
	}

	public String getImpressionsToday() {
		return impressionsToday;
	}

	public void setImpressionsToday(String impressionsToday) {
		this.impressionsToday = impressionsToday;
	}

	public String getItemCost() {
		return itemCost;
	}

	public void setItemCost(String itemCost) {
		this.itemCost = itemCost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdditionalAssistantAccounts() {
		return additionalAssistantAccounts;
	}

	public void setAdditionalAssistantAccounts(String additionalAssistantAccounts) {
		this.additionalAssistantAccounts = additionalAssistantAccounts;
	}

	public String getMainPointID() {
		return mainPointID;
	}

	public void setMainPointID(String mainPointID) {
		this.mainPointID = mainPointID;
	}

	public String getSuperCampaignID() {
		return superCampaignID;
	}

	public void setSuperCampaignID(String superCampaignID) {
		this.superCampaignID = superCampaignID;
	}

	public String getTargetingProfileID() {
		return targetingProfileID;
	}

	public void setTargetingProfileID(String targetingProfileID) {
		this.targetingProfileID = targetingProfileID;
	}

	public String getMaxImpressions() {
		return maxImpressions;
	}

	public void setMaxImpressions(String maxImpressions) {
		this.maxImpressions = maxImpressions;
	}

	public String getClicksSmoothTypeID() {
		return clicksSmoothTypeID;
	}

	public void setClicksSmoothTypeID(String clicksSmoothTypeID) {
		this.clicksSmoothTypeID = clicksSmoothTypeID;
	}

	public String getMaxImpressionsPerDay() {
		return maxImpressionsPerDay;
	}

	public void setMaxImpressionsPerDay(String maxImpressionsPerDay) {
		this.maxImpressionsPerDay = maxImpressionsPerDay;
	}

	public String getAdditionalAssistantIDs() {
		return additionalAssistantIDs;
	}

	public void setAdditionalAssistantIDs(String additionalAssistantIDs) {
		this.additionalAssistantIDs = additionalAssistantIDs;
	}

	public String getClicksAll() {
		return clicksAll;
	}

	public void setClicksAll(String clicksAll) {
		this.clicksAll = clicksAll;
	}

	public String getAdditionalAdvertiserIDs() {
		return additionalAdvertiserIDs;
	}

	public void setAdditionalAdvertiserIDs(String additionalAdvertiserIDs) {
		this.additionalAdvertiserIDs = additionalAdvertiserIDs;
	}

	public String getClicksToday() {
		return clicksToday;
	}

	public void setClicksToday(String clicksToday) {
		this.clicksToday = clicksToday;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getIsSession() {
		return isSession;
	}

	public void setIsSession(String isSession) {
		this.isSession = isSession;
	}

	public String getAdditionalAdvertiserAccounts() {
		return additionalAdvertiserAccounts;
	}

	public void setAdditionalAdvertiserAccounts(String additionalAdvertiserAccounts) {
		this.additionalAdvertiserAccounts = additionalAdvertiserAccounts;
	}

	public String getPricingModelID() {
		return pricingModelID;
	}

	public void setPricingModelID(String pricingModelID) {
		this.pricingModelID = pricingModelID;
	}

	@Override
	public String toString() {
		return "ClassPojo [maxImpressionsPerHour = " + maxImpressionsPerHour + ", clicksPerHour = " + clicksPerHour + ", type = " + type + ", assistantAccount = " + assistantAccount + ", impressionsSmoothTypeID = " + impressionsSmoothTypeID
				+ ", tracingPointsType = " + tracingPointsType + ", advertiserAccount = " + advertiserAccount + ", level = " + level + ", priority = " + priority + ", ID = " + ID + ", itemQty = " + itemQty + ", isTrafficSmooth = " + isTrafficSmooth
				+ ", impressionsAll = " + impressionsAll + ", advertiserID = " + advertiserID + ", maxClicks = " + maxClicks + ", status = " + status + ", pricingTypeID = " + pricingTypeID + ", maxClicksPerHour = " + maxClicksPerHour + ", outerMarkID = "
				+ outerMarkID + ", dateStart = " + dateStart + ", impressionsPerHour = " + impressionsPerHour + ", dateFinished = " + dateFinished + ", bannerSequence = " + bannerSequence + ", impressionsMethodID = " + impressionsMethodID
				+ ", maxClicksPerDay = " + maxClicksPerDay + ", superCampaignName = " + superCampaignName + ", paymentMethodID = " + paymentMethodID + ", assistantID = " + assistantID + ", scenarioPeriodID = " + scenarioPeriodID + ", dateAdded = " + dateAdded
				+ ", dateEnd = " + dateEnd + ", pricingModel = " + pricingModel + ", impressionsToday = " + impressionsToday + ", itemCost = " + itemCost + ", name = " + name + ", additionalAssistantAccounts = " + additionalAssistantAccounts
				+ ", mainPointID = " + mainPointID + ", superCampaignID = " + superCampaignID + ", targetingProfileID = " + targetingProfileID + ", maxImpressions = " + maxImpressions + ", clicksSmoothTypeID = " + clicksSmoothTypeID
				+ ", maxImpressionsPerDay = " + maxImpressionsPerDay + ", additionalAssistantIDs = " + additionalAssistantIDs + ", clicksAll = " + clicksAll + ", additionalAdvertiserIDs = " + additionalAdvertiserIDs + ", clicksToday = " + clicksToday
				+ ", sequence = " + sequence + ", isSession = " + isSession + ", additionalAdvertiserAccounts = " + additionalAdvertiserAccounts + ", pricingModelID = " + pricingModelID + "]";
	}
}
