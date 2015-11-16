package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.interfaces.IObjectAccount;

public class ObjectAccount implements IObjectAccount {

	private final IActionAccountAdd add;
	private final IActionAccountList list;

	public ObjectAccount(ApiClient apiClient) {
		add = new ActionAccountAdd(apiClient);
		list = new ActionAccountList(apiClient);
	}

	public IActionAccountAdd add() {
		return add;
	}

	public IActionAccountList list() {
		return list;
	}
}
