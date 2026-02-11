package Com.tka.Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_All_Links {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        List<WebElement> allLinks = driver.findElements(By.xpath("//*[@class='XnhcQm']"));

        System.out.println("---------- All Links ----------");

        for (WebElement link : allLinks) {
             String text = link.getText();

             {
                System.out.println(link.getText());
             }
         }
        
        WebElement linkmyntra= driver.findElement(By.xpath("//*[@aria-label='Myntra']"));
        linkmyntra.click();
        
        WebElement linkShopsy= driver.findElement(By.xpath("//*[@aria-label='Shopsy']"));
        linkShopsy.click();
      
    
        
        driver.quit();

    }
}
