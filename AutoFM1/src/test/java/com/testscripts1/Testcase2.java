package com.testscripts1;

import java.util.Properties;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utilities.ConfigUtil;

import basehelper1.Base1;





public class Testcase2  extends Base1{

    Properties props= new Properties();
	@Test
	public  void  testlogin() throws Exception {

	LoginPage lp; 
	lp = new LoginPage(getDriver());

	String username = ConfigUtil.getkeyFromPropertyFile("env.properties", "username");
	String password = ConfigUtil.getkeyFromPropertyFile("env.properties", "password");

	LoginPage loginPage = new LoginPage(null);
	loginPage.loginToApplication(username, password);

	}

}
