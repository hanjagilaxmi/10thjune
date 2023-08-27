package pom20thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	@FindBy(name="email")
	private WebElement un;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement logbtn;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void email(String uname)
	{
		un.sendKeys(uname);
	}
	public void password(String pawd)
	{
		pwd.sendKeys(pawd);
	}
	public void login()
	{
		logbtn.click();
	}
}
