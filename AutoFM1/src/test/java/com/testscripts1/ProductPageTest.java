package com.testscripts1;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.ProductsPage;

import basehelper1.Base1;

public class ProductPageTest extends Base1 {
	
	LoginPage lp;
	ProductsPage pp;


	@Test(priority=1)
     public void verifyAddToCart() throws Exception {
     lp = new LoginPage(getDriver());
     pp =  new ProductsPage(getDriver());
     lp.loginToApplication("standard_user","secret_sauce");
     pp.addItemToCart();
     Thread.sleep(8000);
       
	}
//     @Test(priority=2)
//     public static void verifyPriceofTheProduct() {
//     lp.loginToApplication("standard_user","secret_sauce");
//     pp.getPriceOfProduct();
//
//     }

	}
	
	


