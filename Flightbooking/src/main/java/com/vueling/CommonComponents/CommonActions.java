package com.vueling.CommonComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions extends CommonObjects{
	
	WebDriver driver;
	
	public CommonActions(WebDriver driver){
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToBooknowPage() {
		booknowHeader.click();
	}
	
	public WebElement waitForElementToAppear(By findBy, int duration) throws InterruptedException {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
//		return wait.until(ExpectedConditions.elementToBeClickable(findBy));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public WebElement waitForElementToAppearByElement(WebElement element, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public WebElement waitForElementToBeClickableByElement(WebElement element, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForURL(String partialURL, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.urlContains(partialURL));
	}
	
	public void waitForElementToBeClickableByLocator(By findBy, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.elementToBeClickable(findBy));
	}
	
	public void waitforElementToDisappear(By findBy, int duration) {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	
}
