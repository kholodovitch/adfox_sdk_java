package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestBannerPlace {
	private String login;
	private String passSha256;
	private ApiClient client;

	@Before
	public void setUp() throws Exception {
		login = System.getenv("ADFOX_LOGIN");
		passSha256 = System.getenv("ADFOX_PASS_SHA256");

		client = new ApiClient(login, passSha256);
	}

	@Test
	public void testModeBannerPlace() throws Exception {
		Banner banner = client.account().list().banner().get(0);
		BannerPlacements bannerPlacement = client.account().list().bannerPlacements(banner.getID()).get(0);
		BannerPlace bannerPlace = client.placement().info().modeBannerPlace(banner.getID(), bannerPlacement.getPlaceID());

		assertTrue(bannerPlace != null);
		assertTrue(bannerPlace.getHitURL() != null);
		assertTrue(bannerPlace.getHitURL().length() > 0);
	}
}
