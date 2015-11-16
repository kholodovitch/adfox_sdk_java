package com.github.kholodovitch.adfox.interfaces;

import java.util.List;

import com.github.kholodovitch.adfox.Advertiser;
import com.github.kholodovitch.adfox.Banner;
import com.github.kholodovitch.adfox.BannerPlacements;
import com.github.kholodovitch.adfox.Campaign;
import com.github.kholodovitch.adfox.exceptions.AdFoxException;

public interface IActionAccountList {
	List<Advertiser> advertiser() throws AdFoxException;

	List<Banner> banner() throws AdFoxException;

	List<BannerPlacements> bannerPlacements(long bannerId) throws AdFoxException;

	List<Campaign> campaign() throws AdFoxException;
}
