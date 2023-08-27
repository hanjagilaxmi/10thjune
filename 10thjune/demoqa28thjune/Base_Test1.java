package demoqa28thjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test1 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
	}
//	@AfterMethod
//	public void closeApp()
//	{
//		driver.close();
//	}
}
