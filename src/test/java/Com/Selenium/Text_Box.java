package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {
	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		
		
		WebElement txtFullName= driver.findElement(By.xpath("//input[@id='userName']"));
		txtFullName.sendKeys("aniketsautade");
		
		WebElement txtEmail= driver.findElement(By.xpath("//input[@id='userEmail']"));
		txtEmail.sendKeys("aniketsautade2003@gmail.com");
		
		WebElement txtCAddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		txtCAddress.sendKeys("Pune");
		

		WebElement txtPAddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		txtPAddress.sendKeys("Pune");
		

		WebElement btnSubmit= driver.findElement(By.xpath("//button[@id='submit']"));
		btnSubmit.click();
		
		driver.quit();
	}
}
				//runn