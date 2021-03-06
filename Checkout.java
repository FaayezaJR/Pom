package com.Pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Checkout {
		
	public WebDriver driver;
		
		@FindBy(xpath = "(//i[@class = 'icon-chevron-right right'])[2]")
	    private WebElement Checkout;

		public Checkout (WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getCheckout() {
			return Checkout;
		}
		

	}



