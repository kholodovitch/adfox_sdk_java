package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.interfaces.IActionAccountDelete;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.ContentType;

public class TestAddBanner extends BaseTest {

	public TestAddBanner() throws Exception {
		super();
	}

	@Test
	public void testAddBanner() throws Exception {
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

		Banner banner = new Banner();
		banner.setCampaignID(newCampaignId);
		banner.setBannerTypeID(21);
		banner.setImageURL("//banners.adfox.ru/transparent.gif");
		banner.setHitURL("http://example.com");
		int newBannerId = addApi.banner(banner, ContentType.graphics);

		assertTrue(newBannerId > 0);
		assertTrue(apiDelete.banner(newCampaignId, newBannerId));
	}

}
