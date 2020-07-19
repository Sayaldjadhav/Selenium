package Test;
import java.awt.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectDemo.POMGoogleSearch;

public class TestNGGoogleSearch {

	private static WebDriver driver=null;

	@BeforeTest
	public static void setUpPath()
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\sayali\\Eclipse Projects\\SeleniumJavaFramework\\Drivers\\Gecko Driver\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	@Test
	public static void goSearch() throws InterruptedException
	{

		driver.get("http:\\www.google.com");

		POMGoogleSearch.textbox_googlesearch(driver).sendKeys("Sayali");;
		Thread.sleep(2000);

		POMGoogleSearch.button_googlesearch(driver).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}	
	
	@AfterTest
	public static void End()
	{
		driver.close();
	}
}
