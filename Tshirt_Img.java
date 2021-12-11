package com.Pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Tshirt_Img {
		public WebDriver driver;

		@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
		private WebElement Tshirt_Img;
		
	public Tshirt_Img (WebDriver driver2) {
			
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}

	public WebElement getTshirt_Img() {
		return Tshirt_Img;
	}
	}
	



