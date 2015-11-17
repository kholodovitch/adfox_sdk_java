package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionCampaignPlacing;
import com.github.kholodovitch.adfox.interfaces.IObjectCampaign;

public class ObjectCampaign implements IObjectCampaign {

	private ActionCampaignPlacing placing;

	public ObjectCampaign(ApiClient apiClient) {
		placing = new ActionCampaignPlacing(apiClient);
	}

	public IActionCampaignPlacing placing() {
		return placing;
	}

}
