package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_5 {
	
public WebDriver driver;
	
	@FindBy(xpath = "(//i[@class= 'icon-chevron-right right'])[3]")
    private WebElement Checkout_5;

	public Checkout_5 (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckout_5() {
		return Checkout_5;
	}

}


