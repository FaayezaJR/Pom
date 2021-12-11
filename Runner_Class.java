package Org.Maven;
	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import com.Pom.Add_Cart;
    import com.Pom.Checkout;
    import com.Pom.Checkout_1;
import com.Pom.Checkout_2;
import com.Pom.Checkout_3;
import com.Pom.Checkout_4;
import com.Pom.Checkout_5;
import com.Pom.Frame;
    import com.Pom.Home_Page;
	import com.Pom.Login_Page;
import com.Pom.Page_Object_Manager;
import com.Pom.T_Shirts;
	import com.Pom.Tshirt_Img;
public class Runner_Class extends Base_Class {
		public static WebDriver driver = getBrowser("chrome");
		public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		
        public static void main(String args[]) throws InterruptedException, IOException{
		   	url("http://automationpractice.com/index.php");
			clickOnWebElement(pom.getInstanceHp().getSign_in());
			inputValueElement(pom.getInstanceLp().getEmail(),"faayezaJR@gmail.com");
			inputValueElement(pom.getInstanceLp().getPassword(),"JR29021603");
			clickOnWebElement(pom.getInstanceLp().getSign_btn());
			clickOnWebElement(pom.getInstanceT().getTshirts());
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,550);");
			clickOnWebElement(pom.getInstanceTi().getTshirt_Img());
			driver.switchTo().frame(pom.getInstancef().getFrame());
			clickOnWebElement(pom.getInstanceA().getAdd_Cart());
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			clickOnWebElement(pom.getInstancepc().getCheckout());
			Thread.sleep(8000);
			clickOnWebElement(pom.getInstancepc1().getCheckout_1());
		    js.executeScript("window.scrollBy(0,850);");
			clickOnWebElement(pom.getInstancepc2().getCheckout_2());
			clickOnWebElement(pom.getInstancepc3().getCheckout_3());
			clickOnWebElement(pom.getInstancepc11().getCheckout_11());
		    Thread.sleep(3000);
			clickOnWebElement(pom.getInstancepc4().getCheckout_4());
		    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,850);");
		clickOnWebElement(pom.getInstancepc5().getCheckout_5());
	    js.executeScript("window.scrollBy(0,350);");
	    Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\faayeza\\eclipse-workspace\\Selenium_Testing\\screenshots//pic6.png");
	    FileUtils.copyFile(source, destination);
		}
		}



