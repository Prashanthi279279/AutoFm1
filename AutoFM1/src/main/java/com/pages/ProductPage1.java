package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SeleniumActions.SafeActions;

import com.objectrepository.ProductPageLocators1;



public class ProductPage1 extends SafeActions implements ProductPageLocators1{
	
	WebDriver driver;

	public ProductPage1(WebDriver driver) {
         super(driver);
         this.driver= driver;
     // TODO Auto-generated constructor stub

	}
      public  void  firstItemPriceShouldBeDisplayed() {
        String price = getText(ITEM_PRICE);
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

       Assert.assertTrue((findElement(VALIDATEMESSAGE_FREEPONYEXPRESS).getText()).equalsIgnoreCase(expmsg));

      }   

}  






