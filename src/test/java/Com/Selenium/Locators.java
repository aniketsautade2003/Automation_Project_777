package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		WebElement txtUsername=driver.findElement(By.xpath("//input[@name='username']"));
		txtUsername.sendKeys("student");
		
		WebElement txtPassword=driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("Password123");
		
		WebElement btnSubmit=driver.findElement(By.xpath("//button[@class='btn']"));
		btnSubmit.click();
		
		driver.quit();
	}
}


		//runn