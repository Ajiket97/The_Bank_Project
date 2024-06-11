package com.Stepdefinatuion;

import com.Keyword.Keywords;
import com.Keyword.Locators;

import io.cucumber.java.en.Given;

public class StepDefinationTwo {
	Keywords key = new Keywords();

	@Given("I have the login page information{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void i_have_the_login_page_information_ajit(String name, String lastname, String Adress, String City,
			String State, String zipcode, String phone, String ssn, String username, String pass, String conpass) {
		key.clickButton(Locators.REGISTER);
		key.sendKeys(Locators.NAME, name);
		key.sendKeys(Locators.LASTNAME, lastname);
		key.sendKeys(Locators.ADDRESS, Adress);
		key.sendKeys(Locators.CITY, City);
		key.sendKeys(Locators.STATE, State);
		key.sendKeys(Locators.ZIPCODE, zipcode);
		key.sendKeys(Locators.MOBILENO, phone);
		key.sendKeys(Locators.SSN, ssn);
		key.sendKeys(Locators.USERNAME, username);
		key.sendKeys(Locators.PASS, pass);
		key.sendKeys(Locators.CONFIRM_PASS, conpass);
		key.clickButton(Locators.ENTER);

	}

}
