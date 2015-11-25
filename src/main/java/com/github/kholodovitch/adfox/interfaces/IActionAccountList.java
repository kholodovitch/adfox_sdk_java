package com.github.kholodovitch.adfox.interfaces;

import java.util.List;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.BannerPlacements;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.WebSite;

public interface IActionAccountList {
	List<Advertiser> advertiser() throws AdFoxException;

	List<Banner> banner() throws AdFoxException;

	List<BannerPlacements> bannerPlacements(long bannerId) throws AdFoxException;

	List<Campaign> campaign() throws AdFoxException;

	List<WebSite> website() throws AdFoxException;
}
