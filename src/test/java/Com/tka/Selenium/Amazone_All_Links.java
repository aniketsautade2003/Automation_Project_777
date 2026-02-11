package Com.tka.Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_All_Links {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav_a']"));
		System.out.println(allLinks.size());
		System.out.println("----------All links----------");

		for (WebElement link : allLinks) {
			String text=link.getText();
			System.out.println(text);
		}

			driver.quit();

		
	}
}
