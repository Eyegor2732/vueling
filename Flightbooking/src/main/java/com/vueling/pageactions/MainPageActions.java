package com.vueling.pageactions;

import org.openqa.selenium.WebDriver;

import com.vueling.pageobjects.MainPageObjects;

public class MainPageActions extends MainPageObjects {

	WebDriver driver;

	public MainPageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void goTo() {
		driver.get("https://www.vueling.com/en");
	}

	public BookPageActions clickBookNow() throws InterruptedException {
		waitForURL("vueling.com/en", 5);
		acceptCookiesButton.click();
		goToBooknowPage();
		return (new BookPageActions(driver));
	}

}