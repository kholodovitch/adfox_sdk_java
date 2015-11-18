package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.ContentType;

public class TestAddBanner extends BaseTest {

	public TestAddBanner() throws Exception {
		super();
	}

	@Test
	public void testAddCampaign() throws Exception {
		Banner banner = new Banner();
		int newId = client.account().add().banner(banner, ContentType.graphics);

		assertTrue(newId > 0);
	}

}
