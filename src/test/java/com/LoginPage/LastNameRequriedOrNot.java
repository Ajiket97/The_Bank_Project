package com.LoginPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.Keyword.Keywords;
import com.Keyword.Locators;
import com.PageObjectMode.HomePage;

public class LastNameRequriedOrNot {
	@Test
	public void verifyLastName() {
		String act = "Last name is required..";
		Keywords keyword = new Keywords();
		keyword.openBrowser();
		keyword.launchUrl(Locators.APP_URL);
		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickRegister();
		home.enterName();
		// home.enterLastName();
		home.enterAdress();
		home.eneteCity();
		home.enterState();
		home.enterZipCode();
		home.enterPhone();
		home.eneteSNN();
		home.enterUserName();
		home.enterPass();
		home.enterConfirm();
		home.submit();
		String exp = home.getMessage();
		SoftAssert as = new SoftAssert();
		as.assertEquals(act, exp);
	}

}
