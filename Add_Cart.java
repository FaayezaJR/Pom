package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	public WebDriver driver;
	
	@FindBy(xpath = "//button[@name='Submit']")
    private WebElement Add_Cart;

	public Add_Cart (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd_Cart() {
		return Add_Cart;
	}
}
