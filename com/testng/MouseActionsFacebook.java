package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/advanced_search");
		//driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String fb_url=driver.getCurrentUrl();
		
		if(fb_url.equals("https://www.google.com/advanced_search")){
			System.out.println("Page launched successfully");
			
		}
		else{
			System.out.println("Page does not launch successfully");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("_dKg")).sendKeys(Keys.SHIFT,"vivek");;
		
		WebElement txtusername=driver.findElement(By.id("_dKg"));
//		
		Actions builder=new Actions(driver);
		Action seriesOfActions =builder.moveToElement(txtusername).click().keyDown(txtusername,Keys.SHIFT).sendKeys(txtusername,"vvekkurhe555@gmail.com").keyUp(txtusername,Keys.SHIFT).doubleClick(txtusername).contextClick().build();
		
		
		seriesOfActions.perform();
		
		

		

	}

}
