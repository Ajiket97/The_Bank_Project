package com.Stepdefinatuion;

import com.Keyword.Keywords;
import com.Keyword.Locators;
import io.cucumber.java.en.Given;

public class StepDefinationLogin {

	Keywords key = new Keywords();

	@Given(": User login details ID{string} Pass{string}")
	public void user_login_details_id_devin1_pass_smita(String id, String password) {
		key.sendKeys(Locators.LOGINUSERNAME, id);
		key.sendKeys(Locators.LOGINPASS, password);
		key.clickButton(Locators.LoginBTN);
		//key.waits(30);
		String msg = key.getText(Locators.ERRMSG);
		String txt = "The username and password could not be verified.";
		String str = key.currentUrl();
		String cutUrl = "https://parabank.parasoft.com/parabank/overview.htm";
		if (msg.equals(txt)) {
			System.err.println("Fail TC");
		}else {
			System.out.println("pass TC");
		}
//		Assert.assertEquals(msg, txt);
//		System.err.println("fail TC");
	}

}
