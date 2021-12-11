package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_3 {
			public WebDriver driver;
		
		@FindBy(xpath = "//input[@name ='cgv']")
	    private WebElement Checkout_3;
		
		@FindBy(xpath= "(//i[@class = 'icon-chevron-right right'])[3]")
	    private WebElement Checkout_11;

		public Checkout_3 (WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		public WebElement getCheckout_3() {
			return Checkout_3;
		}
		public WebElement getCheckout_11() {
			return Checkout_11;
		}}

	



