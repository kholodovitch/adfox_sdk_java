package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.interfaces.IObjectAccount;

public class ObjectAccount implements IObjectAccount {

	private final IActionAccountList list;

	public ObjectAccount(ApiClient apiClient) {
		list = new ActionAccountList(apiClient);
	}

	public IActionAccountList list() {
		return list;
	}
}
