package com.LoginPage;

import org.testng.annotations.Test;

import com.Keyword.Keywords;
import com.Keyword.Locators;

public class VerifyName {
	@Test
	public void verifyNameRequriedOrNot()  {
		Keywords key = new Keywords();
		
		String msg = "First name is required.";
		key.openBrowser();
		key.launchUrl(Locators.APP_URL);
		key.clickButton(Locators.REGISTER);
		//key.sendKeys(Locators.NAME, "Smita");
		key.sendKeys(Locators.LASTNAME, "pawar");
		key.sendKeys(Locators.ADDRESS, "pune");
		key.sendKeys(Locators.CITY, "pune");
		key.sendKeys(Locators.STATE, "jj");
		key.sendKeys(Locators.ZIPCODE, "555");
		key.sendKeys(Locators.MOBILENO, "9876543210");
		key.sendKeys(Locators.SSN, "sdjks");
		key.sendKeys(Locators.USERNAME, "ajit");
		key.sendKeys(Locators.PASS, "Aj@123");
		key.sendKeys(Locators.CONFIRM_PASS, "Aj@123");
		key.clickButton("//input[@value=\"Register\"]");
		

		//key.clickButton(Locators.REGISTER);
		String msg1 = key.getText(Locators.TEXT);
		if (msg.equals(msg1)) {
			System.err.println("name is requred ");
		} else {
System.out.println("not requried");
		}

	}

}
