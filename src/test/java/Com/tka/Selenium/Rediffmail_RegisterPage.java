package Com.tka.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail_RegisterPage {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//with use tagname
		WebElement txtsend= driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		txtsend.sendKeys("Aniket Sautade");
		
		//without use tagname use *
		WebElement txtsendemail =driver.findElement(By.xpath("//*[@placeholder='Enter Rediffmail ID']"));
		txtsendemail.sendKeys("aniket2003@gmail.com");
		
		//use contain
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter password')]")).sendKeys("@Aniket2777");

		//use Start With
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Retype pa')]")).sendKeys("@Aniket2777");
		
		//use text()
		WebElement txtPrint= driver.findElement(By.xpath("//h2[text()='Create a Rediffmail account']"));
		System.out.println(txtPrint.getText());
		
		// and method
		driver.findElement(By.xpath("//input[@placeholder='Enter recovery email' and @onblur='fieldTrack(this);']")).sendKeys("aniket20@gmail.com");
		
		//or method
		driver.findElement(By.xpath("//input[@id='mobno' or @onkeyup='allowOnlyNumber(this)']")).sendKeys("7058442777");
		
		driver.quit();
	}

}
