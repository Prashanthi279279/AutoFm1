package com.testscripts1;

import java.io.IOException;
import org.testng.annotations.Test;
import com.pages.LoginPage;
import com.utilities.ConfigUtil;
import basehelper1.Base1;


public class LoginTest extends Base1 {
	LoginPage lp;
	
	

	@Test
	public void loginTest() throws IOException {
		
		lp = new LoginPage(getDriver());
		lp.loginToApplication(ConfigUtil.getkeyFromPropertyFile("env1.properties", "username"), 
				ConfigUtil.getkeyFromPropertyFile("env1.properties", "password"));

	}
	

}