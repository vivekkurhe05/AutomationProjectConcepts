package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardTabDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.id("_dKg")).sendKeys("Viraj is a sweet boy");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("_aKg")).sendKeys("Hello everybody");
		driver.findElement(By.id("_aKg")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("_cKg")).sendKeys("whats up guys");
		driver.findElement(By.id("_cKg")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("_bKg")).sendKeys("are you enjoying");
		driver.findElement(By.id("_bKg")).sendKeys(Keys.TAB);
		
		
		driver.findElement(By.id("_RKg")).sendKeys("23");
		driver.findElement(By.id("_RKg")).sendKeys(Keys.TAB);
		
		
		try{
			driver.findElement(By.name("as_nhi")).sendKeys("42");
			driver.findElement(By.id("as_nhi")).sendKeys(Keys.TAB);	
		}
		catch(NoSuchElementException e){
			System.out.println("element not detected properly");
		}
		
	
		

	}

}
