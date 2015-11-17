package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.Campaign;

public interface IActionAccountAdd {
	int advertiser(Advertiser advertiser, String passSha256) throws AdFoxException;

	int campaign(Campaign campaign) throws AdFoxException;

	int banner(Banner banner) throws AdFoxException;
}
