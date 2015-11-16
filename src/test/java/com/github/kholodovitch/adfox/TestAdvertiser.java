package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.UUID;

import org.junit.Test;

public class TestAdvertiser extends BaseTest {

	public TestAdvertiser() throws Exception {
		super();
	}

	@Test
	public void testAddAdvertiser() throws Exception {
		Advertiser advertiser = new Advertiser();
		advertiser.setAccount("XXX_" + UUID.randomUUID().toString());
		advertiser.setEMail("mail@example.com");

		int advertiserId = client.account().add().advertiser(advertiser, "cb92d111bf8d6bcf59e905d5fc50d5d403f0a59bf9a857b711020ba083b524a9");
		assertTrue(advertiserId > 0);
	}

}
