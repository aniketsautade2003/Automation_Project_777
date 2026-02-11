package Com.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement DoubleClickButton= driver.findElement(By.id("doubleClickBtn"));
		DoubleClickButton.click();
		System.out.println("You have done a double click");
		
		
		WebElement RightClickButton= driver.findElement(By.id("rightClickBtn"));
		RightClickButton.click();
		System.out.println("You have done a right click");

		
		WebElement Clickme= driver.findElement(By.xpath("//*[@id=\"8CIVc\"]"));
		Clickme.click();
		System.out.println("You have done a dynamic click");
		
		driver.quit();

	}

}
