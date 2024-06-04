package com.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keywords {
	public RemoteWebDriver driver;
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();


	}

	public void launchUrl(String path) {
		driver.get(path);
	}

	public void sendKeys(String path, String key) {
		driver.findElement(By.xpath(path)).sendKeys(key);
	}

	public void clickButton(String path) {
		driver.findElement(By.xpath(path)).click();

	}

	public String getText(String path) {
		return driver.findElement(By.xpath(path)).getText();
	}
	
	public String getMessage(String path) {
		return driver.findElement(By.xpath(path)).getText();
	}

	public void quitBrowser() {
		driver.quit();
	}

	

}
