package com.vueling.pageactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.vueling.pageobjects.ServicesPageObjects;

public class ServicesPageActions extends ServicesPageObjects{
	
	WebDriver driver;

	public ServicesPageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public PaymentPageActions selectServices() throws InterruptedException {
		waitForURL("Services", 5);
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 500)");
        waitForElementToBeClickableByElement(continueButton, 10).click();
		continueButton.click();
		
		return (new PaymentPageActions(driver));
	}

}