package com.vueling.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vueling.CommonComponents.CommonActions;

public class BagsservicePageObjects extends CommonActions{
	
WebDriver driver;
	
	public BagsservicePageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="[id$='LinkButtonSubmit']")
	protected
	WebElement continueButton;

	
	


}
