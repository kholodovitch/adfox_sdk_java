package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.Advertiser;
import com.github.kholodovitch.adfox.exceptions.AdFoxException;

public interface IActionAccountAdd {
	int advertiser(Advertiser advertiser, String passSha256) throws AdFoxException;
}
