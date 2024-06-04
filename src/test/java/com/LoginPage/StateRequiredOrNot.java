package com.LoginPage;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BankPropertiesFile.PropertiesFile;
import com.Keyword.Keywords;

public class StateRequiredOrNot {
	@Test
	public void verifyState() throws IOException {
		String actual = "State is required.";
		Keywords key = new Keywords();
		String base = System.getProperty("user.dir");
		String readPath = base + "//src//test//resources//LocatorsFile.Properties";
		PropertiesFile props = new PropertiesFile(readPath);
		key.openBrowser();
		key.launchUrl(props.readPropertFile("APP_URL"));
		key.clickButton(props.readPropertFile("REGISTER"));
		key.sendKeys(props.readPropertFile("NAME"), "Sahu");
		key.sendKeys(props.readPropertFile("LASTNAME"), "Sharma");
		key.sendKeys(props.readPropertFile("ADDRESS"), "Sharma");
		key.sendKeys(props.readPropertFile("CITY"), "Kashi");
		key.sendKeys(props.readPropertFile("STATE"), "");
		key.sendKeys(props.readPropertFile("ZIPCODE"), "411107");
		key.sendKeys(props.readPropertFile("MOBILENO"), "7785213649");
		key.sendKeys(props.readPropertFile("SSN"), "441011");
		key.sendKeys(props.readPropertFile("USERNAME"), "abc");
		key.sendKeys(props.readPropertFile("PASS"), "smi@123");
		key.sendKeys(props.readPropertFile("CONFIRM_PASS"), "smi@123");
		key.clickButton(props.readPropertFile("ENTER"));

		String exp = key.getMessage(props.readPropertFile("STATE_TXT"));
		SoftAssert as = new SoftAssert();
		as.assertEquals(actual, exp);

	}
}
