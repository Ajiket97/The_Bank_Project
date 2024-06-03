package com.PageObjectMode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//a[text()='Register']")
	public WebElement Register;
	@FindBy(xpath = "//input[@name=\"customer.firstName\"]")
	public WebElement Name;

	@FindBy(xpath = "//input[@name=\"customer.lastName\"]")
	public WebElement LastName;
	@FindBy(xpath = "//input[@name=\"customer.address.street\"]")
	public WebElement Adress;
	@FindBy(xpath = "//input[@name=\"customer.address.city\"]")
	public WebElement City;
	@FindBy(xpath = "//input[@name=\"customer.address.state\"]")
	public WebElement State;
	@FindBy(xpath = "//input[@name=\"customer.address.zipCode\"]")
	public WebElement ZipCode;
	@FindBy(xpath = "//input[@name=\"customer.phoneNumber\"]")
	public WebElement Phone;
	@FindBy(xpath = "//input[@name=\"customer.ssn\"]")
	public WebElement SNNno;
	@FindBy(xpath = "//input[@name=\"customer.username\"]")
	public WebElement UserName;
	@FindBy(xpath = "//input[@name=\"customer.password\"]")
	public WebElement PassWord;
	@FindBy(xpath = "//input[@name=\"repeatedPassword\"]")
	public WebElement ConfirmPassWord;
	@FindBy(xpath = "//input[@value=\"Register\"]")
	public WebElement submit;
	@FindBy(xpath = "//span[text()='Last name is required.']")
	public WebElement text;

	public void clickRegister() {
		Register.click();
	}

	public void enterName() {
		Name.sendKeys("Ajit");
	}

	public void enterLastName() {
		LastName.sendKeys("shingnare");
	}

	public void enterAdress() {
		Adress.sendKeys("pune");
	}

	public void eneteCity() {
		City.sendKeys("pune");		
	}

	public void enterState() {
		State.sendKeys("mahah");		
	}

	public void enterPhone() {
		ZipCode.sendKeys("sn4410");
	}

	public void enterZipCode() {
		Phone.sendKeys("9798746578");
	}

	public void eneteSNN() {
		SNNno.sendKeys("SNnno564");
	}

	public void enterUserName() {
		UserName.sendKeys("ajit");
	}

	public void enterPass() {
		PassWord.sendKeys("Ajit@123");		
	}

	public void enterConfirm() {
		ConfirmPassWord.sendKeys("Ajit@123");		
	}

	public void submit() {
		submit.click();		
	}

	public String getMessage() {
	return	text.getText();		
	}

}
