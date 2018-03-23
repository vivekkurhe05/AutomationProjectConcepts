package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		
		By locator=By.id("dKg");
		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		
		Thread.sleep(2000);
		WebElement element=driver.findElement(locator);
		
		try{
			Actions action=new Actions(driver).contextClick(element);
			action.build().perform();
			System.out.println("Right clicked successfully");

		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		
		
		
	}

}
