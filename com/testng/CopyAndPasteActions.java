package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyAndPasteActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.id("_dKg")).sendKeys("Viraj is a sweet boy");
		Thread.sleep(500);
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
		Thread.sleep(500);
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.id("_aKg")).sendKeys(Keys.TAB);
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.TAB);;
		Thread.sleep(500);
		
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("_dKg")).sendKeys(Keys.DELETE);



	}

}
