package com.vueling.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vueling.CommonComponents.CommonActions;

public class PassengersPageObjects extends CommonActions{
	
WebDriver driver;
	
	public PassengersPageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[id*='TextBoxFirstName_0']")
	protected
	WebElement paxFirstNameInput;
	
	@FindBy(css="[id*='TextBoxLastName_0']")
	protected
	WebElement paxSurNameInput;
	
	@FindBy(xpath="//button[text()='All set']")
	protected
	WebElement allsetButton;
	
	@FindBy(css="[id$='DropDownListCountry']")
	protected
	WebElement countryDropdown;
	
	@FindBy(css="[id$='TextBoxHomePhone']")
	protected
	WebElement phoneInput;
	
	@FindBy(css="[id$='TextBoxEmailAddress']")
	protected
	WebElement emailInput;
	
	@FindBy(css="[id$='NewsLetterCheckBox']")
	protected
	WebElement offersCheckbox;
	
	@FindBy(css="#fsAcceptsPrivPol")
	protected
	WebElement privacyCheckbox;

	@FindBy(css="[id$='LinkButtonSubmit']")
	protected
	WebElement continueButton;

	protected
	By acceptPrivacyButtonLocator = By.cssSelector("data-testid='uc-container'");
	
	


}
