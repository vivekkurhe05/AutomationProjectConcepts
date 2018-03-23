package com.testng;

import static java.lang.Thread.sleep;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		sleep(2000);
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		
		Set<String> handle=driver.getWindowHandles();
		for(String childWindow:handle){
			driver.switchTo().window(childWindow);	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();
		if(url.equals("http://toolsqa.com/")){
			System.out.println("New Window open");
		}
		driver.close();
		sleep(2000);
		driver.switchTo().window(parentWindow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parentWindowTitle=driver.getTitle();
		if(parentWindowTitle.equalsIgnoreCase("a new title is here"))
			System.out.println("Focus is on parent window");
		else
			System.out.println("Focus on child window");
		
		
		sleep(3000);
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();
		for(String s:driver.getWindowHandles()){
			driver.switchTo().window(s);
		}
		sleep(5000);
		driver.switchTo().window(parentWindow);
		sleep(2000);
		WebElement element=driver.findElement(By.id("alert"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		driver.findElement(By.id("alert")).click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		
		
		
		
		

	}

}
