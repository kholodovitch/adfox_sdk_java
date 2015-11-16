package com.github.kholodovitch.adfox.interfaces;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.objects.Advertiser;

public interface IActionAccountAdd {
	int advertiser(Advertiser advertiser, String passSha256) throws AdFoxException;
}
