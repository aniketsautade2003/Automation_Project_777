package Com.tka.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement txtFirstName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		txtFirstName.sendKeys("Aniket");

		WebElement txtLastName = driver
				.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"));
		txtLastName.sendKeys("Sautade");

		WebElement txtAddress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		txtAddress.sendKeys("Karvenagar Pune");

		WebElement txtEmail = driver.findElement(By.cssSelector("#eid > input"));
		txtEmail.sendKeys("aniketsautade2003@gmail.com");

		WebElement txtPhone = driver
				.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
		txtPhone.sendKeys("7058442777");

		WebElement MaleRadiobutton = driver.findElement(By.name("radiooptions"));
		MaleRadiobutton.click();

		// one time all checkbox click

		List<WebElement> allchecks = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (WebElement check : allchecks) {
			if (check.getDomAttribute("value").contains("Cricket")|| check.getDomAttribute("value").contains("Hockey"))
			
			{
				check.click();
			}
		}

		driver.quit();

	}

}
