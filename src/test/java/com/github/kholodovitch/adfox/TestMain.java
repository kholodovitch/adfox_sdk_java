package com.github.kholodovitch.adfox;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMain {

	private String login;
	private String passSha256;

	@Before
	public void setUp() throws Exception {
		login = System.getenv("ADFOX_LOGIN");
		passSha256 = System.getenv("ADFOX_PASS_SHA256");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		ApiClient client = new ApiClient(login, passSha256);
		List<Banner> banner = client.account().list().banner();

		assertTrue(banner != null);
		assertTrue(banner.size() > 0);
	}

}
