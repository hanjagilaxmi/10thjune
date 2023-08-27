package testframework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class Instagram {
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laxaravind");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}
	@Test
	public void fb() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot st=(TakesScreenshot)driver;
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP\\Facebook\\pop.jpeg");
		FileHandler.copy(src, dst);
		driver.close();
	}
}
