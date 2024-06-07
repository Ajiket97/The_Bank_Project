package com.Stepdefinatuion;

import com.Keyword.Keywords;
import com.keyword.Keyword;
import com.keyword.Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	Keywords key = new Keywords();
	@Then("Open Browser")
	public void open_browser() {
		key.openBrowser();
	 
	}

	@When("Browser open launch url")
	public void browser_open_launch_url() {
		key.launchUrl(Locators.APPURL);
	    
	}

	@Then("Click on Register button")
	public void click_on_register_button() {
	   
	}

	@Then("fill the form")
	public void fill_the_form() {
	    
	}

	@Then("Get the message")
	public void get_the_message() {
	   
	}

}
	

