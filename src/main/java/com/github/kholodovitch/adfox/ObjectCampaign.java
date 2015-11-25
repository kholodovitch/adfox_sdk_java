package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionCampaignPlacing;
import com.github.kholodovitch.adfox.interfaces.IObjectCampaign;

public class ObjectCampaign implements IObjectCampaign {

	private ApiClient apiClient;

	public ObjectCampaign(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public IActionCampaignPlacing placing(int campaignId) {
		return new ActionCampaignPlacing(apiClient, campaignId);
	}

}
