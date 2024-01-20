package com.testscripts1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.RegisterPage;

import basehelper1.Base1;

public class RegisterUserinGuruDemo extends Base1{
	
	@Test(priority=1,dataProvider= "registerdata")

	 public void registerUser1(String title,String fname,String sname,String ph) throws InterruptedException {
     RegisterPage rp;
     rp = new RegisterPage(getDriver());
   
     rp.registeruser1(title,fname,sname,ph);

	 Thread.sleep(10000);

	}

	@DataProvider ( name="registerdata")

	public Object[][] getData() {
       String [][]data = {
       { "4","isha","hgtyu","vfgctdr"},   
       { "2", "riya","reddt","cfvdgtr"},
       { "6","varun","gfrty", "vbvcnm"},
       { "5","ram","dev","aaaa"}

		};

		return data ;

	}	

	}

	


