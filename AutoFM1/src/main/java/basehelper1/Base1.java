package basehelper1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.utilities.ConfigureProperties1;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base1 {
	
	static WebDriver driver;
	
	
	@BeforeMethod
	public static void launchApplication() throws Exception{
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();	
		String env =ConfigureProperties1.getkeyFromPropertyFile("env1.properties","envToRun");
		if(env.equalsIgnoreCase("qa")) {
			driver.get(ConfigureProperties1.getkeyFromPropertyFile("env1.properties", "QAUrl"));
		}else if(env.equalsIgnoreCase("uat")) {
			driver.get(ConfigureProperties1.getkeyFromPropertyFile("env1.properties", "UATUrl"));
		}else if(env.equalsIgnoreCase("prod")) {
			driver.get(ConfigureProperties1.getkeyFromPropertyFile("env1.properties", "ProdUrl"));
		}else {
		//	throw new Exception("please enter either qa or prod or uat to continu");
			Assert.fail("please enter either qa or prod or uat to continue");
		}
	}
	
	
	public static void enterText(By locator,String value) {
		driver.findElement(locator).sendKeys(value);
	}
	
	
	public static void clickElement(By locator) {
		driver.findElement(locator).click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
