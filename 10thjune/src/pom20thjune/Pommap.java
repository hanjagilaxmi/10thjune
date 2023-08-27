package pom20thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pommap {
	@FindBy(xpath="//button[@id='hArJGc']")
	private WebElement btn;
	@FindBy(xpath="//input[@placeholder='Choose starting point, or click on the map...']")
	private WebElement sea;
	@FindBy(xpath="//input[@tooltip='Choose destination, or click on the map...']")
	private WebElement dest;
	
	public Pommap(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void bttn()
	{
		btn.click();
	}
	public void source(String sou)
	{
		sea.sendKeys(sou);
	}
	public void destination(String dst)
	{
		dest.sendKeys(dst);
	}
}
