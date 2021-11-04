package com.qa.TestNGScripts;

import org.testng.annotations.Test;

public class TestAnnotationDemo {
	
	// to execute your test method use @Test

	@Test(priority='1')
	public void loginPageTest()  // test method
	{
		System.out.println("Selenium code to test login Page");
	}
	
  
@Test	(priority='2')
public void createEmailTest()  // test method
	{
		System.out.println("Selenium code to test Create email Page");
	}
@Test	(priority='3')
public void modifyEmail()
{
	System.out.println("Selenium code to test modify email Page");
}
@Test (priority='4')
public void DeleteEmail()
{
	System.out.println("Selenium code to test Delete email Page");
}
	
	
	
	

}
