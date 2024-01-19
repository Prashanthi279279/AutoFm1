package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.SeleniumActions.SafeActions;
import com.objectrepository.LoginPageLocators;
import com.objectrepository.ProductPageLocators;
import basehelper1.Base1;

public class LoginPage extends SafeActions implements LoginPageLocators,ProductPageLocators{

	WebDriver driver;

	public LoginPage(WebDriver driver){

		super(driver);
		this.driver = driver;

	}

	public  void  loginToApplication(String username, String password) throws Exception{
		enterText(INPUT_USERNAME,username);
		enterText(INPUT_PASSWORD,password);
		clickElement(BTN_LOGIN);
		Thread.sleep(10000);
		Assert.assertTrue(findElement(NOTIFICATION_CART).isDisplayed());

		System.out.println("Logged in successfully");
	}


	 



}






