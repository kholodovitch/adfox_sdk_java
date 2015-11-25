package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;

public interface IActionAccountDelete {

	boolean banner(int campaignId, int... bannerIdArray) throws AdFoxException;

	boolean campaign(int campaignId) throws AdFoxException;

	boolean user(int objectId) throws AdFoxException;

	boolean place(int siteId, int... placeIdArray) throws AdFoxException;

}
