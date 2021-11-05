package com.qa.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadDataFROMEXCEL {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	
	@Test
	public void createAcount()
	{
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'name')]")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'login')]")).sendKeys(rediffid);
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'passwd')]")).sendKeys(password);
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name ,'confirm_passwd')]")).sendKeys(retype);
	}

}
