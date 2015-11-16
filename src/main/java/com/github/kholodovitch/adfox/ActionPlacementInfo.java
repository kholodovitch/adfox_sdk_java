package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionPlacementInfo;
import com.github.kholodovitch.adfox.objects.BannerPlace;

public class ActionPlacementInfo implements IActionPlacementInfo {

	private final ApiClient apiClient;

	public ActionPlacementInfo(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public BannerPlace modeBannerPlace(int bannerID, int placeID) throws AdFoxException {
		return apiClient.loadItem(BannerPlace.class, "placement", "info", null, "mode=bannerPlace", "bannerID=" + Integer.toString(bannerID), "placeID=" + Integer.toString(placeID));
	}

}
