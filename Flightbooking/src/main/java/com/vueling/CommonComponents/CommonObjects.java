package com.vueling.CommonComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonObjects{
	
WebDriver driver;
	
	public CommonObjects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='ng-tns-c99-1'][normalize-space()='BOOK NOW']")
	WebElement booknowHeader;
	
	@FindBy(xpath="//span[normalize-space()='MY TRIPS']")
	WebElement mytripsHeader;
	
	@FindBy(xpath="//span[normalize-space()='CHECK_IN']")
	WebElement checkinHeader;
	
	@FindBy(xpath="//span[normalize-space()='FLIGHT STATUS']")
	WebElement flightstatusHeader;
	
	@FindBy(xpath="//span[normalize-space()='OFFERS']")
	WebElement offersHeader;
	
	@FindBy(xpath="//span[normalize-space()='LOYALTY']")
	WebElement loyaltyHeader;
	
	@FindBy(xpath="//span[normalize-space()='INFO/HELP']")
	WebElement infohelpHeader;
	
	@FindBy(css=".vy-culture_button")
	WebElement globeHeader;
	
	@FindBy(css="#vy-button-id-a06c46cb-bdb0-4efd-9c90-7e90e708fa85")
	WebElement profileHeader;
	
	@FindBy(css=".vy-header_logo")
	WebElement logoHeader;

}
