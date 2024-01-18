package com.pages;

import org.openqa.selenium.WebDriver;

import com.SeleniumActions.SafeActions;
import com.objectrepository.RegisterPageLocators;

import dev.failsafe.internal.util.Assert;

   public class RegisterPage extends SafeActions implements RegisterPageLocators{
	   
   public RegisterPage(WebDriver driver) {
         super(driver);
      // TODO Auto-generated constructor stub
   }
	
   public  void registerNewUser() {
    selectElement("text", SELECT_TITLE, 0, "Captain");
    selectRadioBtn(SELECT_FULL);
    selectByIndex(SELECT_TITLE,6);
    selectByValue(SELECT_TITLE, "Father");

   }

	public  void registerUser(){
     try {	
       selectByIndex(SELECT_TITLE, 3);
        enterText(INPUT_FIRSTNAME, "Ravi");
        enterText(INPUT_SURNAME, "Mohan");
        enterText(INPUT_PHONENUMBER, "5678");
        selectByIndex(INPUT_YEAR, 6);
        selectByVisibleText(INPUT_MONTH," May");
        selectByIndex(INPUT_DATE, 12);
        selectRadioBtn(SELECT_FULL);
        selectByIndex(SELECT_LICENCESPERIOD, 8);
        selectByVisibleText(SELECT_OCCUPATION," Doctor");
        enterText(INPUT_STREET, "bryce drive");
        pauseTest(3000);
        enterText(INPUT_CITY, "denver");
        enterText(INPUT_COUNTRY, "usa");
        enterText(INPUT_POSTCODE, 7890);
        enterText(INPUT_EMAIL, "dfgtrt@com");
        enterText(INPUT_PASSWORD, "jnhyu");
        enterText(INPUT_CONFIRMPASSWORD," hgty");
         }catch(Exception e) {
         Assert.fail("Error at : "+e.getMessage());
       }finally {
         System.out.println("=======================================>>>> Executed");

	}

	}	

	 public  void registeruser1 (String title,String fname,String sname,String ph) {
        int intTitle = Integer.parseInt(title);
          String intTitle1 = String.valueOf(intTitle);

         selectByIndex(SELECT_TITLE , intTitle);
         enterText(INPUT_FIRSTNAME, fname);
         enterText(INPUT_SURNAME, sname);
         enterText(INPUT_PHONENUMBER, ph);

	 }

    public void ab(int num1, int num2) {
      int a=num1;
      final int b=num2;
      int c= a+b;

    }	

   } 	

    


