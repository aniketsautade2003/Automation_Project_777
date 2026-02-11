package Com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.LoginPage.LoginPage;

public class LoginTestCases {
	WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	void setup()
	{
	  driver = new ChromeDriver();
	  driver.get("https://javabykiran.in/other/CC/login");
	  lp= new LoginPage(driver);
	}
	@Test
	void testvalid()
	{
		lp.email("aniketsatade2003@gmail.com");
		lp.password("Aniket@123");
		lp.remember();
		lp.submit();
	}
	
	@Test
	void testInvalidUsername()
	{
		lp.email("aniketsautade@com.gmail");
		lp.password("Aniket@123");
		lp.remember();
		lp.submit();	
	}
	
	@Test
	void testInvalidPassword()
	{
		lp.email("aniketsatade2003@gmail.com");
		lp.password("@$#$%%23");
		lp.remember();
		lp.submit();
	}
	
	@Test
	void testBothInvalid()
	{
		lp.email("aniketsautade@com.gmail");
		lp.password("@$#$%%23");
		lp.remember();
		lp.submit();
	}
}
