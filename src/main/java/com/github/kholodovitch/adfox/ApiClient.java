package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IApiClient;
import com.github.kholodovitch.adfox.interfaces.IObjectAccount;
import com.github.kholodovitch.adfox.interfaces.IObjectPlacement;

public class ApiClient implements IApiClient {
	
	private IObjectAccount account = new ObjectAccount(this);
	private IObjectPlacement placement = new ObjectPlacement(this);

	private String login;
	private String passSha256;
	
	public ApiClient(String login, String passSha256) {
		this.login = login;
		this.passSha256 = passSha256;
	}

	public IObjectAccount account() {
		return account;
	}

	public IObjectPlacement placement() {
		return placement;
	}
	
}
