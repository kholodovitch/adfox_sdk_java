package com.github.kholodovitch.adfox.interfaces;

public interface IObjectAccount {
	IActionAccountList list();

	IActionAccountAdd add();

	IActionAccountDelete delete();
}
