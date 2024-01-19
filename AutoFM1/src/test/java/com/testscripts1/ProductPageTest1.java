package com.testscripts1;

import org.testng.annotations.Test;

import com.pages.Loginpage;
import com.pages.ProductPage1;

import basehelper1.Base1;

public class ProductPageTest1 extends Base1 {
	
	Loginpage lp;

	ProductPage1 pp1;		

	

	@Test (priority=1)
    public void VerifyPriceofFirstProduct() {
     lp = new Loginpage(getDriver());

		//pp1 = new ProductPage1(getDriver());
     lp.loginToApplication("standard_user","secret_sauce");
         lp.firstItemPriceShouldBeDisplayed();



	}

    //  @Test(priority=2)
    //	public  void verifyAddToCart() throws InterruptedException{
	//	  lp = new LoginPage(getDriver());
    //   pp1 = new ProductPage1(getDriver());

//		lp.loginToApplication("standard_user","secret_sauce");

//		lp.addTwoItemsToCart ();

//		Thread.sleep(8000);

//	}

//	

//  	@Test(priority=3)
 //    public void verifyCheckOutItems() throws InterruptedException {

//		lp = new LoginPage(getDriver());

//		pp1 = new ProductPage1(getDriver());

//		lp.loginToApplication("standard_user","secret_sauce");

//		pp1.checkOutItems("ravi","kumar","5678", "FREE PONY EXPRESS DELIVERY!");

//		Thread.sleep(8000);

//	}

}



	

}
