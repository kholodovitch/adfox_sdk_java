package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestBannerPlace extends BaseTest {

	public TestBannerPlace() throws Exception {
		super();
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
