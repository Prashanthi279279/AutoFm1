package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.SeleniumActions.SafeActions;
import com.objectrepository.ProductPageLocators;



public class ProductsPage extends  SafeActions implements ProductPageLocators{

	public ProductsPage (WebDriver driver){
		super(driver);
	}

	/**
	 * Tis function will add first time of te page to te cart and veify te remove buttn
	 */
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