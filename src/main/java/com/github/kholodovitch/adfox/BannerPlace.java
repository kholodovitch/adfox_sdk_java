package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

public class BannerPlace extends BaseObject {
	private String HTML;
	private String flashURL;
	private String hitURL;
	private String imageURL;

	public void load(Element item) {
		HTML = getStringContent(item, "HTML");
		flashURL = getStringContent(item, "flashURL");
		hitURL = getStringContent(item, "hitURL");
		imageURL = getStringContent(item, "imageURL");
	}

	public String getHTML() {
		return HTML;
	}

	public void setHTML(String hTML) {
		HTML = hTML;
	}

	public String getFlashURL() {
		return flashURL;
	}

	public void setFlashURL(String flashURL) {
		this.flashURL = flashURL;
	}

	public String getHitURL() {
		return hitURL;
	}

	public void setHitURL(String hitURL) {
		this.hitURL = hitURL;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

}
