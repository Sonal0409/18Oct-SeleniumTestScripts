package com.qa.selscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[1]")).sendKeys("Mumbai");
		
		Thread.sleep(7000);
		
		List<WebElement> From=driver.findElements(By.xpath("(//*[@id='C120_suggestion-wrap'])[1]/child::*"));
		
		System.out.println("the size of FROM list is:"+ From.size());
		
		for(int i=0;i<From.size();i++)
		{
			String Fromtext= From.get(i).getText();
			if(Fromtext.contains("Vashi"))
			{
				From.get(i).click();
				break;
			}
		}
		
driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[3]")).sendKeys("Pune");
		
		Thread.sleep(7000);
		
		
List<WebElement> To=driver.findElements(By.xpath("//*[@id='C120_suggestion-wrap']/child::*"));
		
		System.out.println("the size of To list is:"+ To.size());
		
		for(int i=0;i<To.size();i++)
		{
			String Totext= To.get(i).getText();
			if(Totext.contains("Shivaji"))
			{
				To.get(i).click();
				break;
			}
		}
		
	
// click 5 Nov in the calander
	
		
driver.findElement(By.xpath("//*[@class='D120_search_widget']/descendant::input[5]")).click();
		
		Thread.sleep(7000);
		
		
List<WebElement> cal=driver.findElements(By.xpath("(//*[@class='rb-calendar-days'])[2]/child::*"));
		
		System.out.println("the size of calander list is:"+ cal.size());
		
		for(int i=0;i<cal.size();i++)
		{
			String caltext= cal.get(i).getText();
			if(caltext.contains("5"))
			{
				cal.get(i).click();
				break;
			}
		}
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
