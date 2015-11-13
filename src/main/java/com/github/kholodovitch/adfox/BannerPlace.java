package com.github.kholodovitch.adfox;

import org.w3c.dom.Element;

public class BannerPlace {
	private String HTML;
	private String flashURL;
	private String hitURL;
	private String imageURL;

	public BannerPlace() {
	}

	public BannerPlace(Element item) {
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
