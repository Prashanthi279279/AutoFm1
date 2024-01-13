package com.testscripts1;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pages.Loginpage;
import com.utilities.ConfigureProperties1;

import basehelper1.Base1;


    public class Logintest1 extends Base1 {
	
    	@Test
	public void loginTest() throws IOException {
		   
    		Loginpage.loginToApplication(ConfigureProperties1.getkeyFromPropertyFile("env1.properties", "username"), 
    				ConfigureProperties1.getkeyFromPropertyFile("env1.properties", "password"));
		
}
}