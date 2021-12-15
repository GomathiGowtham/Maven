package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement continu;

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinu() {
		return continu;
	}
//	public Select_Hotel(WebDriver driver2) {
//		this.driver = driver2;
//		PageFactory.initElements(driver, this);
//	}

	public Select_Hotel(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver, this);
	}
	

}
