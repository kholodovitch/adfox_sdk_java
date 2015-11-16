package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

import com.github.kholodovitch.adfox.interfaces.ILoadFromXml;

public abstract class BaseObject implements ILoadFromXml {
	protected String getStringContent(Element item, String name) {
		return item.getElementsByTagName(name).item(0).getTextContent();
	}
}
