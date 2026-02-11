package Com.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="login-username") WebElement txtEmail;
	@FindBy(name="password")  WebElement txtPassword;
	@FindBy(name="remember")  WebElement checkremember;
	@FindBy(xpath="//button[@name='submit']")  WebElement btnLogin;
	
	public  LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void email(String emailid) 
	{
		txtEmail.sendKeys("aniketsatade2003@gmail.com");	
	}
	
	public void password(String pass) 
	{
		txtEmail.sendKeys("pass");	
	}
	public void remember() 
	{
		checkremember.click();
	}
	public void submit() 
	{
		btnLogin.click();	
	}
}
