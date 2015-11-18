package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

import com.github.kholodovitch.adfox.objects.Advertiser;

public class TestAdvertiser extends BaseTest {

	public TestAdvertiser() throws Exception {
		super();
	}

	@Test
	public void testAddAdvertiser() throws Exception {
		Advertiser advertiser = new Advertiser();
		advertiser.setAccount(getRandomName());
		advertiser.setEMail("mail@example.com");

		int advertiserId = client.account().add().advertiser(advertiser, sha256(UUID.randomUUID().toString()));
		assertTrue(advertiserId > 0);
	}

}
