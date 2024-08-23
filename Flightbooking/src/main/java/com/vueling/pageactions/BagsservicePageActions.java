package com.vueling.pageactions;

import org.openqa.selenium.WebDriver;

import com.vueling.pageobjects.BagsservicePageObjects;

public class BagsservicePageActions extends BagsservicePageObjects{
	
	WebDriver driver;

	public BagsservicePageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public ServicesPageActions selectLuggage() throws InterruptedException {
		waitForURL("BagsService", 5);
		continueButton.click();

		return (new ServicesPageActions(driver));
	}

}