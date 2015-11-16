package com.github.kholodovitch.adfox;

public class Advertiser {
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

	@Override
	public String toString() {
		return "ClassPojo [lastName = " + lastName + ", phone = " + phone + ", fax = " + fax + ", state = " + state + ", dateAdded = " + dateAdded + ", address1 = " + address1 + ", address2 = " + address2 + ", country = " + country + ", city = " + city
				+ ", isByAssistantCreated = " + isByAssistantCreated + ", company = " + company + ", eMail = " + eMail + ", ID = " + ID + ", account = " + account + ", ZIPCode = " + ZIPCode + ", firstName = " + firstName + "]";
	}
}
