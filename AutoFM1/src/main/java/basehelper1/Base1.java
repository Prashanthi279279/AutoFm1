package basehelper1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.utilities.ConfigUtil;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base1 {

	WebDriver driver;


	@BeforeMethod
	public void launchApplication() throws Exception{
		ConfigUtil props = new ConfigUtil();
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();	
		String env =props.getkeyFromPropertyFile("env1.properties","envToRun");
		if(env.equalsIgnoreCase("qa")) {
			driver.get(props.getkeyFromPropertyFile("env1.properties", "QAUrl"));
		}else if(env.equalsIgnoreCase("uat")) {
			driver.get(props.getkeyFromPropertyFile("env1.properties", "UATUrl"));
		}else if(env.equalsIgnoreCase("prod")) {
			driver.get(props.getkeyFromPropertyFile("env1.properties", "ProdUrl"));
		}else {
			//	throw new Exception("please enter either qa or prod or uat to continu");
			Assert.fail("please enter either qa or prod or uat to continue");
		}
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}


	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}


}
