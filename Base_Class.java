package Org.Maven;	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

		public class Base_Class {

				public static WebDriver driver;
				 
				 public static WebDriver getBrowser(String type) {
					 
					 if (type.equalsIgnoreCase("chrome")) {
						 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Driver new//chromedriver.exe");
						 driver = new ChromeDriver();
			    }
					 else if (type.equalsIgnoreCase("firefox")) {
						 System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "//Driver new//chromedriver.exe");
						 driver = new FirefoxDriver();
				}
					 driver.manage().window().maximize();
					 return driver;
				 }

				 public static void clickOnWebElement(WebElement element) {
				 element.click();
				 }
				 public static void inputValueElement(WebElement element, String Value)
				 {
					 element.sendKeys(Value);
				 }
					 
				 public static void url(String url) {
					 
				 driver.get(url);
				 }
			 public static void Actions(String A, WebElement element) {
				 Actions ac = new Actions(driver);
				 if(A.equalsIgnoreCase("move")) {
					 ac.moveToElement(element).build().perform();
				 }
				 else if(A.equalsIgnoreCase("click")){
				 ac.click(element).build().perform();
				 }}}


