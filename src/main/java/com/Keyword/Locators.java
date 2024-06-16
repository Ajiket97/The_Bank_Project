package com.Keyword;

public interface Locators {
	String APP_URL = "https://parabank.parasoft.com/parabank/index.htm";
	String NAME = "//input[@name=\"customer.firstName\"]";
	String REGISTER = "//a[text()='Register']";
	String LASTNAME="//input[@name=\"customer.lastName\"]";
	String ADDRESS="//input[@name=\"customer.address.street\"]";
	String CITY="//input[@name=\"customer.address.city\"]";
	String STATE ="//input[@name=\"customer.address.state\"]";
	String ZIPCODE ="//input[@name=\"customer.address.zipCode\"]";
	String MOBILENO="//input[@name=\"customer.phoneNumber\"]";
	String SSN="//input[@name=\"customer.ssn\"]";
	String USERNAME ="//input[@name=\"customer.username\"]";
	String PASS="//input[@name=\"customer.password\"]";
	String CONFIRM_PASS="//input[@name=\"repeatedPassword\"]";
	String ENTER = "//input[@value=\"Register\"]";
	String TEXT = "//input[@name=\"customer.address.state\"]";
	String SSNNUM = "//input[@id=\"customer.ssn\"]";
	String LOGINUSERNAME = "//input[@name=\"username\"]";
	String LOGINPASS = "//input[@name=\"password\"]";
	String LoginBTN = "//input[@value=\"Log In\"]";
	String ERRMSG = "//p[text()='The username and password could not be verified.']";
}
