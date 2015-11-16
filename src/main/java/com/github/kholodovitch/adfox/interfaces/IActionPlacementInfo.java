package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.BannerPlace;
import com.github.kholodovitch.adfox.exceptions.AdFoxException;

public interface IActionPlacementInfo {
	BannerPlace modeBannerPlace(int bannerID, int placeID) throws AdFoxException;
}
