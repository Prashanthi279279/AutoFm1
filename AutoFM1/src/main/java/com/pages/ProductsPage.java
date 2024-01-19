package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.SeleniumActions.SafeActions;
import com.objectrepository.ProductPageLocators;
import com.objectrepository.ProductPageLocators1;



   public class ProductsPage extends  SafeActions implements ProductPageLocators1{
	
	public ProductsPage (WebDriver driver){
        super(driver);
	}
	
    public void  addItemToCart() {
    clickElement(BTN_BACKPACK_ADDTOCART);
    Assert.assertTrue( findElement(BTN_BACKPACK_REMOVE).isDisplayed());
    String NotificationCount = findElement(NOTIFICATION_CART).getText();
    Assert.assertEquals(NotificationCount,"1");
    System.out.println("Verified Remove Button and Cart noficitaon");

    }	
    
    public void getPriceOfProduct() {
    String price = findElement(ITEM_PRICE).getText();
    Assert.assertTrue(price.contains("29.99"));
    System.out.println("Price verified");

	}
	
}