package com.github.kholodovitch.adfox;

import java.util.List;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.BannerPlacements;
import com.github.kholodovitch.adfox.objects.Campaign;

public class ActionAccountList implements IActionAccountList {

	private ApiClient apiClient;

	public ActionAccountList(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public List<Advertiser> advertiser() throws AdFoxException {
		return apiClient.loadList(Advertiser.class, "account", "list", "advertiser");
	}

	public List<Banner> banner() throws AdFoxException {
		return apiClient.loadList(Banner.class, "account", "list", "banner");
	}

	public List<BannerPlacements> bannerPlacements(long bannerId) throws AdFoxException {
		return apiClient.loadList(BannerPlacements.class, "account", "list", "bannerPlacements", "bannerID=" + Long.toString(bannerId));
	}

	public List<Campaign> campaign() throws AdFoxException {
		return apiClient.loadList(Campaign.class, "account", "list", "campaign");
	}

}
