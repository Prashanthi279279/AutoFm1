package com.pages;

import com.objectrepository.LoginPageLocators;

import basehelper1.Base1;

public class Loginpage implements LoginPageLocators{

	public static void loginToApplication(String username, String password) {
		 Base1.enterText(INPUT_USERNAME,username);
		 Base1.enterText(INPUT_PASSWORD,password);
		 Base1.clickElement(BTN_LOGIN);
	
}
	
}	