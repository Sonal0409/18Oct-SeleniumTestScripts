package com.qa.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleScript {
	WebDriver driver;
	Xls_Reader reader = new Xls_Reader("C:\\Users\\sonal\\Desktop\\Excels\\SimpleTestData.xlsx");
	
	
	@BeforeMethod
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	
	
	}
	
	@Test(dataProvider="testdata")
	public void wikiPageInput(String searchdata) throws InterruptedException
	{
		
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys(searchdata);
		Thread.sleep(2000);
		driver.close();
	
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] Simpledata()
	{
		Object input[][] = Xls_dataProvider.getTestData("Sheet1");
		
		return input;
	}
	
	
	
	
	
	
	
	
	

}
