package demoqa28thjune;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_Script {
	public WebDriver driver;
	@FindBy (id="firstName")
	private WebElement fn;
	
	@FindBy(id="lastName")
	private WebElement ln;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement gen;
	
	@FindBy(id="userNumber")
	private WebElement mob;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(id="subjectsInput")
	private WebElement sub;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement hob;
	
	@FindBy(id="uploadPicture")
	private WebElement pic;
	
	@FindBy(id="currentAddress")
	private WebElement add;
	
	public Pom_Script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void first(String name)
	{
		fn.sendKeys(name);
	}
	public void last(String name)
	{
		ln.sendKeys(name);
	}
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	public void gender()
	{
		gen.click();
	}
	public void num(String no)
	{
		mob.sendKeys(no);
	}
	public void date(String birth) throws InterruptedException
	{
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('dateOfBirthInput'), value=''");
		dob.sendKeys(birth);
	}
	public void subj(String in)
	{
		sub.sendKeys(in);
	}
	public void hobby(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", hob);
	}
	public void upload(String doc)
	{
		pic.sendKeys(doc);
	}
	public void address(String addr)
	{
		add.sendKeys(addr);
	}
}
