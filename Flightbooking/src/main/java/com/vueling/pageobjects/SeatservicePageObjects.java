package com.vueling.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vueling.CommonComponents.CommonActions;

public class SeatservicePageObjects extends CommonActions{
	
WebDriver driver;
	
	public SeatservicePageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@data_assignable=\"true\"])[1]")
	protected
	WebElement availableSeat;
	
	@FindBy(css="[id$='LinkButtonSubmit']")
	protected
	WebElement continueButton;

}
