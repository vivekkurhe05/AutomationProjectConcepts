package com.testng;

import static java.lang.Thread.sleep;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/products-page/product-category/accessories/");
		driver.manage().timeouts().implicitlyWait(50, SECONDS);
		
//		WebElement element=driver.findElement(By.id("menu-item-33"));
//		System.out.println(element.getText());
//		Actions builder=new Actions(driver);
//		builder.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(50, SECONDS);
		List<WebElement> li=driver.findElements(By.id("menu-item-33"));
		Actions builder=new Actions(driver);
		for(WebElement e:li){
			String str=e.getText();
			if(str.equals("Product Category")){
				builder.moveToElement(e).click().build().perform();
				break;
			}
			System.out.println(e.getText());
			
		}
		sleep(5000);
//		driver.close();
//		Actions builder=new Actions(driver);
//		builder.moveToElement(element).build().perform();
//		driver.findElement(By.linkText("MacBooks")).click();
//		sleep(2000);
//		driver.navigate().back();
//		sleep()
//		driver.findElement(By.linkText("")).click();
//		driver.manage().timeouts().implicitlyWait(50, SECONDS);
//		String url=driver.getCurrentUrl();
//		if(url.equals("http://store.demoqa.com/products-page/product-category/macbooks/")){
//			System.out.println("on MacBooks page");
//		}
//		else{
//			System.out.println("Not on MacBooks page");
//		}

	}

}
