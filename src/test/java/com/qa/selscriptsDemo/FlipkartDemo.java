package com.qa.selscriptsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='_2QfC02']/descendant::button[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//form[@class='_2M8cLY header-form-search']/descendant::input[1]")).sendKeys("books");
		Thread.sleep(4000);
		List <WebElement>l1=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/child::*"));
		System.out.println("the list related to search is :"+l1.size());
for(int i =0;i<l1.size();i++)
			
		{
		String text = l1.get(i).getText();
		
		if(text.contains("books to read"))
		{
			
			l1.get(i).click();
		    break;
		}
		
		}

	}

}
