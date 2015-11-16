package com.github.kholodovitch.adfox.objects;

import org.w3c.dom.Element;

import com.github.kholodovitch.adfox.interfaces.ILoadFromXml;

public abstract class BaseObject implements ILoadFromXml {
	protected Integer getIntContent(Element item, String name) {
		String textContent = item.getElementsByTagName(name).item(0).getTextContent();
		return Integer.parseInt(textContent);
	}

	protected String getStringContent(Element item, String name) {
		return item.getElementsByTagName(name).item(0).getTextContent();
	}
}
