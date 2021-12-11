package com.Pom;	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Checkout_1 {
		
	public WebDriver driver;
		
		@FindBy(xpath = "(//i[@class = 'icon-chevron-right right'])[3]")
	    private WebElement Checkout_1;

		public Checkout_1 (WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getCheckout_1() {
			return Checkout_1;
		}
	}


