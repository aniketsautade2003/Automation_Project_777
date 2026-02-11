package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		WebElement checkbox= driver.findElement(By.cssSelector("#tree-node > ol > li > span > label"));
		checkbox.click();System.out.println("Checkbox clicked successfully");
	
		driver.quit();
	
}
}