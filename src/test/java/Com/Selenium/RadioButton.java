package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		
		WebElement radiobutton= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]"));
		radiobutton.click();
	
		driver.quit();
	}
}
