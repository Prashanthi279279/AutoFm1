package com.testscripts1;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.pages.LoginPage;

import basehelper1.Base1;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;




public class Testcase2  extends Base1{

	Properties props= new Properties();
	@Test
	public void  t() throws IOException {
		
		String username = ConfigProperties.getkeyFromPropertyFile("env.properties", "username");
		String password = ConfigProperties.getKeyFromPropertyFile("env.properties", "password");
		
		LoginPage.loginToApplication(username,password);
		
		}
	
}
