package com.hooks;

import java.io.IOException;

import com.BankPropertiesFile.PropertiesFile;
import com.Keyword.Keywords;
import com.Keyword.Locators;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MainHooks {
	Keywords key = new Keywords();
	String base = System.getProperty("user.dir");
	String readPath = base + "//src//test//resources//LocatorsFile.Properties";
	PropertiesFile props = new PropertiesFile(readPath);

	@Before
	public void launchUrlAndOpenBrowser() throws IOException {
		key.openBrowser();
		key.launchUrl(props.readPropertFile("APP_URL"));

	}

	@After
	public void closeBrowser() {
		key.quitBrowser();

	}
}
