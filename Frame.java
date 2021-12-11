package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement Frame;
	
	public Frame (WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrame() {
		return Frame;
	}

}
