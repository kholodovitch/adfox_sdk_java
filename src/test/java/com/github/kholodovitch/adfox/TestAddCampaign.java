package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.kholodovitch.adfox.objects.Campaign;

public class TestAddCampaign extends BaseTest {

	public TestAddCampaign() throws Exception {
		super();
	}

	@Test
	public void testAddCampaign() throws Exception {
		Campaign campaign = new Campaign();
		int newId = client.account().add().campaign(campaign, false);

		assertTrue(newId > 0);
	}

}
