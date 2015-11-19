package com.github.kholodovitch.adfox;

import org.apache.commons.lang3.StringUtils;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountDelete;

public class ActionAccountDelete implements IActionAccountDelete {

	private ApiClient apiClient;

	public ActionAccountDelete(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public boolean banner(int campaignId, int... bannerIdArray) throws AdFoxException {
		if (apiClient.deleteItem("account", "banner", "campaignID=" + campaignId, "listIDs=" + StringUtils.join(bannerIdArray, ",")) > 0)
			return true;
		else
			return false;
	}

	public boolean campaign(int campaignId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean user(int objectId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean place(int siteId, int... placeIdArray) {
		// TODO Auto-generated method stub
		return false;
	}

}
