package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.SeleniumActions.SafeActions;
import com.objectrepository.LoginPageLocators;
import com.objectrepository.ProductPageLocators;
import com.objectrepository.ProductPageLocators1;
import com.objectrepository.ProductPageLocators2;

import basehelper1.Base1;

     public class Loginpage extends SafeActions implements LoginPageLocators,ProductPageLocators2,ProductPageLocators1{
	
	WebDriver driver;

	public Loginpage(WebDriver driver){

		super(driver);
		this.driver = driver;

	}

	public  void  loginToApplication(String username, String password) {
		enterText(INPUT_USERNAME,username);
		enterText(INPUT_PASSWORD,password);
        clickElement(BTN_LOGIN);

		Assert.assertTrue(findElement(NOTIFICATION_CART).isDisplayed());

		System.out.println("Logged in successfully");
	}


     public  void  firstItemPriceShouldBeDisplayed() {

     String price = getText(By.className("inventory_item_price"));
     Assert.assertTrue(price.contains("29.99"));

		System.out.println("Price verified");

	}

     public void addTwoItemsToCart () {
    	 
        clickElement(BTN_BACKPACK_ADDTOCART);
        Assert.assertTrue(findElement(BTN_BACKPACK_REMOVE).isDisplayed());

		clickElement(BTN_BOLT_TSHIRT_ADDTOCART);
		Assert.assertTrue(findElement(BTN_BOLT_TSHIRT_REMOVE).isDisplayed());

		String NotificationCount = findElement(NOTIFICATION_CART).getText(); 
        Assert.assertEquals(NotificationCount,"2");

		   System.out.println("Notification cart should display two items");

	   }

	   
     public  void checkOutItems(String firstname,String lastname,String postalcode,String expmsg) {
          clickElement(NOTIFICATION_CART);
          clickElement(BUTTON_CHECKOUT);
          enterText(INPUT_FIRSTNAME,firstname);
          enterText(INPUT_LASTNAME,lastname);
          enterText(INPUT_POSTALCODE,postalcode);
          clickElement(BUTTON_CONTINUE);

	       //Assert.assertTrue((findElement(VALIDATEMESSAGE_FREEPONYEXPRESS).getText()).equalsIgnoreCase(expmsg));

     }     

	       

	}



	

	
	