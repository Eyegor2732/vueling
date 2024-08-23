package com.vueling.pageactions;

import org.openqa.selenium.WebDriver;

import com.vueling.pageobjects.SeatservicePageObjects;

public class SeatservicePageActions extends SeatservicePageObjects{
	
	WebDriver driver;

	public SeatservicePageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public BagsservicePageActions selectSeat() throws InterruptedException {
		waitForURL("SeatService", 5);
		availableSeat.click();
		continueButton.click();

		return (new BagsservicePageActions(driver));
	}

}