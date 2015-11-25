package com.github.kholodovitch.adfox;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.ContentType;

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

		return apiClient.addItem("account", "advertiser", "password=" + passSha256, "account=" + account, "eMail=" + eMail, "company=" + advertiser.getCompany() != null ? advertiser.getCompany() : "");
	}

	public int campaign(Campaign campaign, boolean isFlayt) throws AdFoxException {
		ArrayList<String> params = new ArrayList<String>();

		params.add("name=" + campaign.getName());
		if (!isFlayt)
			params.add("advertiserID=" + campaign.getAdvertiserID());

		return apiClient.addItem("account", "campaign", params.toArray(new String[0]));
	}

	public int banner(Banner banner, ContentType contentType) throws AdFoxException {
		ArrayList<String> params = new ArrayList<String>();

		params.add("campaignID=" + banner.getCampaignID());

		if (StringUtils.isEmpty(banner.getTemplateID())) {
			params.add("bannerTypeID=" + banner.getBannerTypeID());
			params.add("contentType=" + contentType.toString());
			params.add("imageURL=" + banner.getImageURL());
			params.add("hitURL=" + banner.getHitURL());
		} else {
			params.add("templateID=" + banner.getTemplateID());
		}

		return apiClient.addItem("account", "banner", params.toArray(new String[0]));
	}

}
