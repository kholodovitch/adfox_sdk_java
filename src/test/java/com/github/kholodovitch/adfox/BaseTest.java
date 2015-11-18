package com.github.kholodovitch.adfox;

import java.security.MessageDigest;
import java.util.UUID;

public class BaseTest {
	private String login;
	private String passSha256;

	protected ApiClient client;

	public BaseTest() throws Exception {
		login = System.getenv("ADFOX_LOGIN");
		passSha256 = System.getenv("ADFOX_PASS_SHA256");

		client = new ApiClient(login, passSha256);
	}

	protected String getRandomName() {
		return "XXX_" + UUID.randomUUID().toString().substring(0, 6);
	}

	protected String sha256(String base) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(base.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
