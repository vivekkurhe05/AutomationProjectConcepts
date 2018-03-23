package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetToolTipText {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean res=driver.findElement(By.className("gb_Ec")).isEnabled();
		System.out.println(res);
		driver.findElement(By.className("gb_Ec")).click();
		res=driver.findElement(By.className("gb_Ec")).isEnabled();
		System.out.println(res);
		Thread.sleep(2000);
		String gettitle=driver.findElement(By.xpath(".//*[@id='gbwa']/div/a")).getAttribute("title");
		System.out.println(gettitle);
		String getrole=driver.findElement(By.xpath(".//*[@id='gbwa']/div/a")).getAttribute("role");
		System.out.println(getrole);
		String getaria=driver.findElement(By.xpath(".//*[@id='gbwa']/div/a")).getAttribute("aria-expanded");
		System.out.println(getaria);

	}

}
