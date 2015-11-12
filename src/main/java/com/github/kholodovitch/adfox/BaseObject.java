package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

public abstract class BaseObject {
	protected String getStringContent(Element item, String name) {
		return item.getElementsByTagName(name).item(0).getTextContent();
	}
}
