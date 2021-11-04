package com.qa.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {
	
	WebDriver driver;
	
	// if you want to execute any particular scenario before any of the test method is executed
	// this method will be executed only once in the begining, as the first method of the class
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test(priority='1')
	public void RadioButtonTest() throws InterruptedException
	{
		WebElement e1 =driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[2]"));
	    
		e1.click();
		Thread.sleep(2000);
		
	}
	@Test(priority='2')
	public void Checkboxtest() throws InterruptedException
	{
		WebElement e2=	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
		
		e2.click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
