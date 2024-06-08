package com.Stepdefinatuion;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import com.BankPropertiesFile.PropertiesFile;
import com.Keyword.Keywords;
import com.Keyword.Locators;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	Keywords key = new Keywords();
	String base = System.getProperty("user.dir");
	String readPath = base + "//src//test//resources//LocatorsFile.Properties";
	PropertiesFile props = new PropertiesFile(readPath);
	String act = "State is required.";
	String ssnMsg = "Social Security Number is required.";

	@When("Click on Register button")
	public void click_on_register_button() throws IOException {
		key.clickButton(props.readPropertFile("REGISTER"));
	}

	@And("fill the form")
	public void fill_the_form() {
		key.sendKeys(Locators.NAME, "sita");
		key.sendKeys(Locators.LASTNAME, "Royal");
		key.sendKeys(Locators.ADDRESS, "pune bypass");
		key.sendKeys(Locators.CITY, "pune");
		key.sendKeys(Locators.STATE, "");
		key.sendKeys(Locators.ZIPCODE, "411107");
		key.sendKeys(Locators.MOBILENO, "9876543210");
		key.sendKeys(Locators.SSN, "199");
		key.sendKeys(Locators.USERNAME, "smita01");
		key.sendKeys(Locators.PASS, "sita@09");
		key.sendKeys(Locators.CONFIRM_PASS, "sita@09");
		key.clickButton(Locators.ENTER);
	}

	@Then("Get the message")
	public void get_the_message() {
		String exp = key.getMessage(Locators.TEXT);
		SoftAssert as = new SoftAssert();
		as.assertEquals(act, exp);
	}

	@Given("User is already on the Sign up form")
	public void user_is_already_on_the_sign_up_form() {
		key.clickButton(Locators.REGISTER);
		key.sendKeys(Locators.NAME, "devid");
		key.sendKeys(Locators.LASTNAME, "Royal");
		key.sendKeys(Locators.ADDRESS, "pune bypass");
		key.sendKeys(Locators.CITY, "pune");
		key.sendKeys(Locators.STATE, "UK");
		key.sendKeys(Locators.ZIPCODE, "78421");
		key.sendKeys(Locators.MOBILENO, "9876543210");
		key.sendKeys(Locators.SSN, "");
		key.sendKeys(Locators.USERNAME, "devid01");
		key.sendKeys(Locators.PASS, "dev@09");
		key.sendKeys(Locators.CONFIRM_PASS, "dev@09");
		key.clickButton(Locators.ENTER);
	}

	@Then("Getting the message")
	public void getting_the_message() {
		String expected = key.getMessage(Locators.SSNNUM);
		SoftAssert as = new SoftAssert();
		as.assertEquals(ssnMsg, expected);
	}
}
