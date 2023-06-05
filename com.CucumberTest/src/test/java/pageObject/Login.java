package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login {
	
	public WebDriver idriver;
	public Login(WebDriver rDriver)
	{
		
		idriver =rDriver;
		PageFactory.initElements(rDriver,this);
	}
	
	@FindBy(id="j_username")
	WebElement email;
	
	@FindBy(id="j_password")
	WebElement password;
	
	@FindBy(id="cookieValue")
	WebElement list;
	
	@FindBy(id="loginBtn")
	WebElement login;
	
	@FindBy(className="linkblack")
	WebElement logout;
	
	public void enterEmail(String emailadd)
	{
		email.sendKeys(emailadd);
	}
	public void enterPass(String pwd)
	{
	password.sendKeys(pwd);
	}
	
	public void selectListValue()
	{
		Select sl = new Select(list);
		sl.selectByIndex(1);
	}
	
	public void clickOnLoginButton()
	{
		login.click();
	}
	public void clickOnLogoutButton()
	{
		logout.click();
	}
}
