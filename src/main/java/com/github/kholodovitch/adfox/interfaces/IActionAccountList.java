package com.github.kholodovitch.adfox.interfaces;

import java.util.List;

import com.github.kholodovitch.adfox.Banner;
import com.github.kholodovitch.adfox.BannerPlacements;

public interface IActionAccountList {
	List<Banner> banner();

	BannerPlacements bannerPlacements(long bannerId);
}
