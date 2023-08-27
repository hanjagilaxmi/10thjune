package fb21stjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_script {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
}
