package com.objectrepository;

import org.openqa.selenium.By;

public interface ProductPageLocators {
	
    
    public static final By ITEM_PRICE = By.className("inventory_item_price");
	public static final By BTN_BACKPACK_ADDTOCART = By.id("add-to-cart-sauce-labs-backpack");
    public static final By BTN_BACKPACK_REMOVE = By.id("remove-sauce-labs-backpack");
    public static final By BTN_BOLT_TSHIRT_ADDTOCART=By.className("btn_primary btn_inventoryull");
    public static final By BTN_BOLT_TSHIRT_REMOVE= By.className("btn_secondary btn_inventory");
    public static final By NOTIFICATION_CART = By.className("shopping_cart_badge");
    public static final By BUTTON_CHECKOUT=By.className("btn_action checkout_button");
    public static final By INPUT_FIRSTNAME=By.id("first-name");	
    public static final By INPUT_LASTNAME=By.id("last-name");
    public static final By INPUT_POSTALCODE=By.id("postal-code");
    public static final By BUTTON_CONTINUE = By.className("btn_primary cart_button");
    public static final By VALIDATEMESSAGE_FREEPONYEXPRESS=By.className("summary_value_label");
}