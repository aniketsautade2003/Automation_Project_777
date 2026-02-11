package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_by_kiran {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.in/other/CC/login");
		
		
		
		WebElement txtusername=driver.findElement(By.xpath("//input[@name='username']"));
		txtusername.sendKeys("aniketsautade2003@gmail.com");
		
		WebElement txtpassward=driver.findElement(By.xpath("//input[@name='password']"));
		txtpassward.sendKeys("aniket2777");
		
		WebElement btnRememberme=driver.findElement(By.cssSelector("#login_form > div:nth-child(6) > div"));
		btnRememberme.click();
		
		WebElement btnSubmit= driver.findElement(By.xpath("//button[@name='submit']"));
		btnSubmit.click();
	
		driver.quit();
	}
}

			//runn
