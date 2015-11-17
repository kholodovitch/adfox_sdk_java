package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionCampaignPlacing;

public class ActionCampaignPlacing implements IActionCampaignPlacing {

	private ApiClient apiClient;

	public ActionCampaignPlacing(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public void set(int actionObjectID, boolean actionStatus) {
		// TODO Auto-generated method stub

	}

}
