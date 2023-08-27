package testparallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexecution {
	public WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void test(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
			driver.findElement(By.xpath("//button[@name='login']")).click();
		}
		else
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
			driver.findElement(By.xpath("//button[@name='login']")).click();
		}
	}
}
