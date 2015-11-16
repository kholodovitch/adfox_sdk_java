package com.github.kholodovitch.adfox.objects;

import org.w3c.dom.Element;

public class Advertiser extends BaseObject {
	private String lastName;
	private String phone;
	private String fax;
	private String state;
	private String dateAdded;
	private String address1;
	private String address2;
	private String country;
	private String city;
	private String isByAssistantCreated;
	private String company;
	private String eMail;
	private String ID;
	private String account;
	private String ZIPCode;
	private String firstName;

	public void load(Element item) {
		lastName = getStringContent(item, "lastName");
		phone = getStringContent(item, "phone");
		fax = getStringContent(item, "fax");
		state = getStringContent(item, "state");
		dateAdded = getStringContent(item, "dateAdded");
		address1 = getStringContent(item, "address1");
		address2 = getStringContent(item, "address2");
		country = getStringContent(item, "country");
		city = getStringContent(item, "city");
		isByAssistantCreated = getStringContent(item, "isByAssistantCreated");
		company = getStringContent(item, "company");
		eMail = getStringContent(item, "eMail");
		ID = getStringContent(item, "ID");
		account = getStringContent(item, "account");
		ZIPCode = getStringContent(item, "ZIPCode");
		firstName = getStringContent(item, "firstName");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIsByAssistantCreated() {
		return isByAssistantCreated;
	}

	public void setIsByAssistantCreated(String isByAssistantCreated) {
		this.isByAssistantCreated = isByAssistantCreated;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getZIPCode() {
		return ZIPCode;
	}

	public void setZIPCode(String ZIPCode) {
		this.ZIPCode = ZIPCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
