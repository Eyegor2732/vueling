package com.vueling.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vueling.CommonComponents.CommonActions;

public class ServicesPageObjects extends CommonActions{
	
WebDriver driver;
	
	public ServicesPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[href*='LinkButtonSubmit']")
	protected
	WebElement continueButton;

}
