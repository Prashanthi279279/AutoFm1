package com.SeleniumActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class SafeActions {
	
	WebDriver driver;

     public SafeActions(WebDriver driver) {	
        this.driver = driver;

	}
     public  void enterText(By locator,String value) {
        try {
            driver.findElement(locator).sendKeys(value);
       } catch (Exception e) {
           // TODO Auto-generated catch block
              e.printStackTrace();
           }
	}
     public void clickElement(By locator) {
        driver.findElement(locator).click();

	}
     public  WebElement findElement(By locator) {
       return driver.findElement(locator);

	}
     public String getText(By locator) {
       return driver.findElement(locator).getText();

	}
     public  void closeBrowser() {
       driver.close();	

	}
     public  void enterText (By locator, int value) {
        driver.findElement( locator );

       }

     public void  selectElement(String selectCriteria,By locator,int index,String value) {
           WebElement ele =findElement(locator);

		Select select = new Select(ele);
         if(selectCriteria.equalsIgnoreCase("Index")) {
              select.selectByIndex(index);
          }else  if(selectCriteria.equalsIgnoreCase("Value")) {
             select.selectByValue(value);
           }else if(selectCriteria.equalsIgnoreCase("Text")) {
              select.selectByVisibleText(value);
           }else {
         //  Assert.fail("Please give selectCreitera as Index/Value/Text");
           }
		}	
     public  void selectByIndex ( By locator,int index) {
           WebElement tit = findElement(locator);
            Select select = new Select (tit);
            select.selectByIndex(index);

         }
     public  void selectByValue(By locator,String value) {
           WebElement tit =findElement(locator);
           Select select = new Select(tit);
            select.selectByValue(value);

         }
       public  void selectByVisibleText(By locator,String value) {
            WebElement tit =findElement(locator);
             Select select = new Select(tit);
             select.selectByVisibleText(value);

          }

	   public  void selectRadioBtn(By locator) {
          WebElement ele =driver.findElement(locator);
            if(!ele.isSelected()) {
                ele.click();		
              }else {
         System.out.println("Already selected");

		}
     }
        public  void pauseTest(int num) throws InterruptedException  {
        Thread.sleep(num);

	}

}




