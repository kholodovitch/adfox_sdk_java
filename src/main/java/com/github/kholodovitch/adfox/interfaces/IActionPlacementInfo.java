package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.objects.BannerPlace;

public interface IActionPlacementInfo {
	BannerPlace modeBannerPlace(int bannerID, int placeID) throws AdFoxException;
}
