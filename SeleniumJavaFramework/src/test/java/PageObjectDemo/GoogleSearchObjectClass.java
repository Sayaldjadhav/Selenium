package PageObjectDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchObjectClass {

	public WebDriver driver=null;
	
	By TextBox_Search =By.name("q");
	By Search_Button= By.name("btnK");
	
	public GoogleSearchObjectClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void SetTextInTextBox(String text)
	{
		driver.findElement(TextBox_Search).sendKeys(text);;
	}
	
	public void ClickSearchButton()
	{
		driver.findElement(Search_Button).sendKeys(Keys.RETURN);
	}
}
