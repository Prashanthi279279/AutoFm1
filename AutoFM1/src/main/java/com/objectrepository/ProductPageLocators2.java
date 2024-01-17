package com.objectrepository;

import org.openqa.selenium.By;

public interface ProductPageLocators2 {
	public static final By BTN_BACKPACK_ADDTOCART = By.className("<button class=\"btn_primary btn_inventory\">ADD TO CART</button>");
    public static final By BTN_BACKPACK_REMOVE= By.className("btn_secondary btn_inventory");
    public static final By NOTIFICATION_CART =By.className("fa-layers-counter shopping_cart_badge");
    public static final By ITEM_PRICE = By.className("inventory_item_price");

}
