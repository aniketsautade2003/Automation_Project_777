package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Demo {
	WebDriver driver;
	
	@BeforeMethod
	void setUP()
	{
		driver= new ChromeDriver();
		driver.get("https://javabykiran.in/other/CC/login");	
	}
	@AfterMethod
	void close()
	{
		driver.quit();
	}
	@Test
	void testExecutor() {	
		WebElement email = driver.findElement(By.id("login-username"));
		WebElement password = driver.findElement(By.id("login-password"));
		WebElement Login = driver.findElement(By.xpath("//button[@name='submit']"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='aniketsautade2003@gmail.com';",email);
		js.executeScript("arguments[0].value='aniket@2003';",password);
		js.executeScript("arguments[0].click();",Login);
		
		js.executeScript("window.scrollBy(0,500)");
		
	}
}
