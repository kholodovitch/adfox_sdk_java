package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IObjectPlacement;

public class ObjectPlacement implements IObjectPlacement {

	private final ApiClient apiClient;

	public ObjectPlacement(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

}
