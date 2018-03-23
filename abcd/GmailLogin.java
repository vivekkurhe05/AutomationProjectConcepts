package abcd;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C://Users//sai//workspace//geckodriver-v0.16.1-win32//geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C://Program Files//Mozilla Firefox//firefox.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=HSgpWayiN-by8AeiwIyACw");
		driver.findElement(By.linkText("Gmail")).click();



		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("Vvekkurhe555@gmail.com");
		driver.findElement(By.id("identifierNext")).click();

		try{
			Thread.sleep(3000);
		}
		catch(Exception e){

		}
		driver.findElement(By.name("password")).sendKeys("9823207515");
		driver.findElement(By.id("passwordNext")).click();

		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//		driver.findElement(By.id("gbqfq")).sendKeys("Vikas Padhy");
		//		driver.findElement(By.id("gbqfb")).click();


		// V image code for logout

		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			System.err.println("Too much time");
		}

		try{
			driver.findElement(By.cssSelector(".gbii")).click();
		}
		catch(Exception e){
			System.out.println("Element not found.....");
		}

		// Logout button code
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("id('gb_71')")).click();


	}

}
