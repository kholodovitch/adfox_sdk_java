package com.github.kholodovitch.adfox;

import org.apache.commons.lang3.StringUtils;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.Campaign;

public class ActionAccountAdd implements IActionAccountAdd {

	private ApiClient apiClient;

	public ActionAccountAdd(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public int advertiser(Advertiser advertiser, String passSha256) throws AdFoxException {
		if (advertiser == null)
			throw new AdFoxException("advertiser is undefined");

		if (StringUtils.isBlank(passSha256))
			throw new AdFoxException("password is blank");

		String account = advertiser.getAccount();
		if (StringUtils.isBlank(account))
			throw new AdFoxException("advertiser.account is blank");

		String eMail = advertiser.getEMail();
		if (StringUtils.isBlank(eMail))
			throw new AdFoxException("advertiser.email is blank");

		return apiClient.addItem("account", "advertiser", "password=" + passSha256, "account=" + account, "eMail=" + eMail);
	}

	public int campaign(Campaign campaign) throws AdFoxException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int banner(Banner banner) throws AdFoxException {
		// TODO Auto-generated method stub
		return 0;
	}

}
