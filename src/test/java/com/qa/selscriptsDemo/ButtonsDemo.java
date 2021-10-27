package com.qa.selscriptsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1635298385&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3A%2F%2Faccount.microsoft.com%2Fauth%2Fcomplete-signin%3Fru%3Dhttps%253A%252F%252Faccount.microsoft.com%252F%253Frefd%253Daccount.microsoft.com%2526refp%253Dsignedout-index&lc=1033&id=292666&lw=1&fl=easi2&ru=https%3A%2F%2Faccount.microsoft.com%2Faccount%2Foutlook");
		
		// Inspect the button using xpath locator
		
		// xpath : //tagname[@attribute='value']
		
	
		// Check if email box is displayed or not
		
		boolean display= driver.findElement(By.xpath("//input[@type='email']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println("the element is dipslayed : " + display);
		
		// same element second action : check if it is enabled or not
		
		boolean enable1=driver.findElement(By.xpath("//input[@type='email']")).isEnabled();
		
		System.out.println("the element is enabled : " + enable1);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sonal04534563");
		
		Thread.sleep(3000);
		
		// check is the button element displayed or not
		
		boolean display2 = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		
		Thread.sleep(2000);
		System.out.println("the element is dipslayed : " + display);
		
		// is the element enabled or not
		
		boolean enable = driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		
		if(enable == true)
		{
			//click on the element
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
		
		

	}

}
