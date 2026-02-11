package Com.tka.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://javabykiran.in/other/CC/login");
		
		// for absolute xpath 
		
		WebElement linkRegister = driver.findElement(By.xpath("/html/body/div/div/div[5]/div/div/div[2]/a"));
		String text=linkRegister.getText();
		System.out.println(text);
		
		//for link text ( pura text )
		WebElement linktext =driver.findElement(By.linkText("Forgotten your password?"));
		System.out.println(linktext.getText());
		
				
		//for partial link (adha adhura link )
		WebElement linktext1=driver.findElement(By.partialLinkText("Forgotten y"));
		String text1= linktext1.getText();
		System.out.println(text1);
		
		
		WebElement txtEmail =driver.findElement(By.xpath("//input[@name='subscribe']"));
		txtEmail.sendKeys("aniketsautade2003@gmail.com");
		
		WebElement btnsubmit= driver.findElement(By.xpath("//button[@name='submit']"));
		btnsubmit.click();
		
		driver.quit();
		
		
		
		
	}

}
