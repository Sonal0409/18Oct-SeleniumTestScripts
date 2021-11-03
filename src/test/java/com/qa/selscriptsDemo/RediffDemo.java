package com.qa.selscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> e1= driver.findElements(By.xpath("//div[@id='country_id']/descendant::*"));
		  
		for(int i=0;i<e1.size();i++)
		{
			String Fromtext= e1.get(i).getText();
			System.out.println(Fromtext);
			if(Fromtext.contains("United Kingdom"))
			{
				e1.get(i).click();
				break;
			}
		}
		    
		 
	

	}

}
