package pom20thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(name="login")
	private WebElement logbtn;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		logbtn.click();
	}
}
