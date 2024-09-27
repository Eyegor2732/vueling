package com.vueling.pageactions;

import org.openqa.selenium.WebDriver;

import com.vueling.pageobjects.PassengersPageObjects;

public class PassengersPageActions extends PassengersPageObjects {

	WebDriver driver;

	public PassengersPageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public SeatservicePageActions enterPaxInformation(String name, String surname, String country, String phone,
			String email) throws InterruptedException {
		waitForURL("PassengersInformation", 10);
		paxFirstNameInput.sendKeys(name);
		paxSurNameInput.sendKeys(surname);
		allsetButton.click();
		countryDropdown.sendKeys(country);
		phoneInput.sendKeys(phone);
		emailInput.sendKeys(email);
		privacyCheckbox.click();
		continueButton.click();

		return (new SeatservicePageActions(driver));

	}

}
