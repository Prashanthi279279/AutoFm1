package com.objectrepository;

import org.openqa.selenium.By;

public interface RegisterPageLocators {
	
	public static final By SELECT_TITLE = By.id("user_title");
	public static final By INPUT_FIRSTNAME = By.id("user_firstname");
    public static final By INPUT_SURNAME = By.id("user_surname");
    public static final By INPUT_PHONENUMBER= By.id("user_phone");
    public static final By INPUT_YEAR = By.id("user_dateofbirth_1i");
    public static final By INPUT_MONTH = By.id("user_dateofbirth_2i");
	public static final By INPUT_DATE = By.id("user_dateofbirth_3i");
    public static final By SELECT_FULL = By.id("licencetype_f");
    public static final By SELECT_LICENCESPERIOD = By.id("user_licenceperiod");
    public static final By SELECT_OCCUPATION = By.id("user_occupation_id");
    public static final By INPUT_STREET = By.id("user_address_attributes_street");
    public static final By INPUT_CITY = By.className("city");
    public static final By INPUT_COUNTRY = By.className("county");
    public static final By INPUT_POSTCODE = By.className("post_code");
    public static final By INPUT_EMAIL = By.className("email");
    public static final By INPUT_PASSWORD = By.className("password");
    public static final By INPUT_CONFIRMPASSWORD =By.className("c_password");
    public static final By INPUT_SUBMIT = By.className("submit");

	
}
	
	

