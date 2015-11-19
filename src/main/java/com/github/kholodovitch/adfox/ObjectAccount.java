package com.github.kholodovitch.adfox;

import com.github.kholodovitch.adfox.interfaces.IActionAccountAdd;
import com.github.kholodovitch.adfox.interfaces.IActionAccountDelete;
import com.github.kholodovitch.adfox.interfaces.IActionAccountList;
import com.github.kholodovitch.adfox.interfaces.IObjectAccount;

public class ObjectAccount implements IObjectAccount {

	private final IActionAccountAdd add;
	private final IActionAccountList list;
	private final IActionAccountDelete delete;

	public ObjectAccount(ApiClient apiClient) {
		add = new ActionAccountAdd(apiClient);
		list = new ActionAccountList(apiClient);
		delete = new ActionAccountDelete(apiClient);
	}

	public IActionAccountAdd add() {
		return add;
	}

	public IActionAccountList list() {
		return list;
	}

	public IActionAccountDelete delete() {
		return delete;
	}
}
