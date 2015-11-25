package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.kholodovitch.adfox.exceptions.AdFoxResultException;
import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.BannerPlacements;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.WebSite;

public class TestMain {

	private String login;
	private String passSha256;
	private ApiClient client;

	@Before
	public void setUp() throws Exception {
		login = System.getenv("ADFOX_LOGIN");
		passSha256 = System.getenv("ADFOX_PASS_SHA256");

		client = new ApiClient(login, passSha256);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = AdFoxResultException.class)
	public void testError() throws Exception {
		ApiClient localClient = new ApiClient(login, "123");
		List<Advertiser> advertisers = localClient.account().list().advertiser();

		assertTrue(advertisers != null);
		assertTrue(advertisers.size() > 0);
	}

	@Test
	public void testAccountListAdvertiser() throws Exception {
		List<Advertiser> advertisers = client.account().list().advertiser();

		assertTrue(advertisers != null);
		assertTrue(advertisers.size() > 0);
	}

	@Test
	public void testAccountListBanner() throws Exception {
		List<Banner> banner = client.account().list().banner();

		assertTrue(banner != null);
		assertTrue(banner.size() > 0);
	}

	@Test
	public void testAccountListBannerPlacements() throws Exception {
		List<Banner> banner = client.account().list().banner();
		List<BannerPlacements> bannerPlacements = client.account().list().bannerPlacements(banner.get(0).getID());

		assertTrue(bannerPlacements != null);
		assertTrue(bannerPlacements.size() > 0);
	}

	@Test
	public void testAccountListCampaign() throws Exception {
		List<Campaign> campaign = client.account().list().campaign();

		assertTrue(campaign != null);
		assertTrue(campaign.size() > 0);
	}

	@Test
	public void testAccountListWebsite() throws Exception {
		List<WebSite> website = client.account().list().website();

		assertTrue(website != null);
		assertTrue(website.size() > 0);
	}

}
