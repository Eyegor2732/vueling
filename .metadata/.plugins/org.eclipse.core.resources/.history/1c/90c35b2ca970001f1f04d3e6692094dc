package com.vueling.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vueling.CommonComponents.CommonActions;

public class SchedulePageObjects extends CommonActions{
	
WebDriver driver;
	
	public SchedulePageObjects(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#outboundFlightCardsContainer #selectFlightButton")
	protected
	List<WebElement> outboundTicket;
	
	@FindBy(css="#inboundFlightCardsContainer #selectFlightButton")
	protected
	List<WebElement> returnTicket;
	
	@FindBy(xpath="//div[contains(@class, 'selected')]//span[contains(@class, 'btn')]")
	protected
	WebElement flyButton;
	
	@FindBy(xpath="(//li[@class='selected']//span[contains(@class, 'header')])[1]")
	protected
	WebElement originMonthButton;
	
	@FindBy(xpath="(//li[@class='selected']//span[contains(@class, 'header')])[2]")
	protected
	WebElement returnMonthButton;
	
	@FindBy(xpath="(//li[@class='selected']//span[contains(@class, 'item_num')])[1]")
	protected
	WebElement originDayButton;
	
	@FindBy(xpath="(//li[@class='selected']//span[contains(@class, 'item_num')])[2]")
	protected
	WebElement returnDayButton;
	
	@FindBy(id="stvContinueButton")
	protected
	WebElement continueButton;
	
	
	protected
	By acceptPrivacyButtonLocator = By.cssSelector("data-testid='uc-container'");
	
	protected
	By flyButtonLocator = By.xpath("(//span[@data-js-id=\"bundle-VCB3\"])[2]");

	
	protected
	By continueButtonLocator = By.id("stvContinueButton");
	
	protected
	By circleLocator = By.xpath("//div[@class='circle']");
	
	


}
