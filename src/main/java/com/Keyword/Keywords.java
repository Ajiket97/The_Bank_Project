package com.Keyword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	public static WebDriver driver;

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

	public void waits(int x) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(x));
	}
	
	public String currentUrl() {
		return driver.getCurrentUrl();	
		
	}

}
