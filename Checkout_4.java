package com.Pom;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Checkout_4 {
		public WebDriver driver;
		
		@FindBy(xpath = "//a[@class = 'cheque']")
	    private WebElement Checkout_4;

		public Checkout_4 (WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getCheckout_4() {
			return Checkout_4;
		}

	}



