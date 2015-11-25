package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import com.github.kholodovitch.adfox.exceptions.AdFoxException;
import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.interfaces.IActionAccountDelete;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.objects.ActionObject;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.WebSite;

public class TestCampaignPlacing extends BaseTest {

	public TestCampaignPlacing() throws Exception {
		super();
	}

	@Test
	public void testCampaignPlacing() throws AdFoxException {
		IActionAccountList listApi = client.account().list();
		IActionAccountAdd addApi = client.account().add();
		IActionAccountDelete apiDelete = client.account().delete();

		Advertiser advertiser = new Advertiser();
		advertiser.setAccount(getRandomName());
		advertiser.setEMail("mail@example.com");
		int advertiserId = addApi.advertiser(advertiser, sha256(UUID.randomUUID().toString()));
		assertTrue(advertiserId > 0);

		Campaign campaign = new Campaign();
		campaign.setAdvertiserID(advertiserId);
		campaign.setName(getRandomName());
		int newCampaignId = addApi.campaign(campaign, false);
		assertTrue(newCampaignId > 0);
		
		WebSite website = listApi.website().get(0);
		
		assertTrue(client.campaign().placing(newCampaignId).set(ActionObject.website, website.getID(), true));
		assertTrue(apiDelete.campaign(newCampaignId));
		assertTrue(apiDelete.user(advertiserId));
	}
}
