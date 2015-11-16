package com.github.kholodovitch.adfox;

public class BaseTest {
	private String login;
	private String passSha256;

	protected ApiClient client;

	public BaseTest() throws Exception {
		login = System.getenv("ADFOX_LOGIN");
		passSha256 = System.getenv("ADFOX_PASS_SHA256");

		client = new ApiClient(login, passSha256);
	}

}
