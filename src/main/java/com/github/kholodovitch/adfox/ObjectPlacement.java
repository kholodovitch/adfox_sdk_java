package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionPlacementInfo;
import com.github.kholodovitch.adfox.interfaces.IObjectPlacement;

public class ObjectPlacement implements IObjectPlacement {

	private final ApiClient apiClient;

	public ObjectPlacement(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public IActionPlacementInfo info() {
		return new ActionPlacementInfo(apiClient);
	}

}
