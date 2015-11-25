package com.github.kholodovitch.adfox;

import java.util.ArrayList;
import java.util.List;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionCampaignPlacing;
import com.github.kholodovitch.adfox.objects.ActionObject;

public class ActionCampaignPlacing implements IActionCampaignPlacing {

	private ApiClient apiClient;
	private int campaignId;

	public ActionCampaignPlacing(ApiClient apiClient, int campaignId) {
		this.apiClient = apiClient;
		this.campaignId = campaignId;
	}

	public boolean set(ActionObject actionObject, int actionObjectID, boolean actionStatus) throws AdFoxException {
		List<String> additional = new ArrayList<String>();

		additional.add("actionObjectID=" + Integer.toString(actionObjectID));
		additional.add("objectID=" + Integer.toString(campaignId));
		additional.add("actionStatus=" + (actionStatus ? "1" : "0"));

		return apiClient.changeItem("campaign", "placing", actionObject.toString(), additional.toArray(new String[0]));
	}

}
