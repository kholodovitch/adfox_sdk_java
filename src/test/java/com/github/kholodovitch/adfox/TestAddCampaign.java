package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.interfaces.IActionAccountDelete;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Campaign;

public class TestAddCampaign extends BaseTest {

	public TestAddCampaign() throws Exception {
		super();
	}

	@Test
	public void testAddCampaign() throws Exception {
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
		assertTrue(apiDelete.campaign(newCampaignId));
	}

}
