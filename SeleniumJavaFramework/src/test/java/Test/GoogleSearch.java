package Test;
import java.awt.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectDemo.POMGoogleSearch;

public class GoogleSearch {
	private static WebDriver driver=new FirefoxDriver();
	public static void main(String[] args) throws InterruptedException 
	{
		goSearch();
		System.out.println("Google Search Executed Sucessfully!!");
	}	
	public static void goSearch() throws InterruptedException
	{

	System.setProperty("webdriver.gecko.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		//driver= new FirefoxDriver();

		driver.get("http:\\www.google.com");
		POMGoogleSearch.textbox_googlesearch(driver).sendKeys("Sayali");
		Thread.sleep(3000);
		POMGoogleSearch.textbox_googlesearch(driver).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		driver.close();
	}
}
