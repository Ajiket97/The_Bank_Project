package com.LoginPage;

import java.io.IOException;
import org.testng.annotations.Test;
import com.BankPropertiesFile.PropertiesFile;
import com.Keyword.Keywords;

public class CityNameRequriedOrNot {
	@Test
	public void verifyCityName() throws IOException {
		Keywords keyword = new Keywords();
		String base = System.getProperty("user.dir");
		String readPath = base + "//src//test//resources//LocatorsFile.Properties";
		PropertiesFile prop = new PropertiesFile(readPath);

		keyword.openBrowser();
		keyword.launchUrl(prop.readPropertFile("APP_URL"));
		// keyword.launchUrl(prop.readPropertFile(readPath, "APP_URL"));
		// keyword.clickButton(prop.readPropertFile(readPath, "REGISTER"));
		keyword.clickButton(prop.readPropertFile("REGISTER"));
		// keyword.sendKeys(prop.readPropertFile(readPath, "NAME"), "Ajit");
		keyword.sendKeys(prop.readPropertFile("NAME"), "Ajit");
		keyword.sendKeys(prop.readPropertFile(readPath, "LASTNAME"), "shingnare");

	}

}
