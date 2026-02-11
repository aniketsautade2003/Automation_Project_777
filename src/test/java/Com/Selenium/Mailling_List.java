package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mailling_List {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.in/other/CC/login");
		
		WebElement maillinglist= driver.findElement(By.xpath("//input[@id='newsletter_email']"));
		maillinglist.sendKeys("aniket2003@gmail.com");
		
	    WebElement btnsubscribe=	driver.findElement(By.xpath("//input[@value='Subscribe']"));
		btnsubscribe.click();
		
		driver.quit();
	}
}


			//runn