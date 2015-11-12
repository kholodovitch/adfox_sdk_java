package com.github.kholodovitch.adfox;

import java.util.List;

import com.github.kholodovitch.adfox.interfaces.IActionAccountList;

public class ActionAccountList implements IActionAccountList {

	private ApiClient apiClient;

	public ActionAccountList(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public List<Banner> banner() {
		// TODO Auto-generated method stub
		return null;
	}

	public BannerPlacements bannerPlacements(long bannerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
