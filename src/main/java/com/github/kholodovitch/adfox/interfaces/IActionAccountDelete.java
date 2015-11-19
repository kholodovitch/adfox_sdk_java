package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;

public interface IActionAccountDelete {

	boolean banner(int campaignId, int... bannerIdArray) throws AdFoxException;

	boolean campaign(int campaignId);

	boolean user(int objectId);

	boolean place(int siteId, int... placeIdArray);

}
