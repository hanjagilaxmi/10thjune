package testscripr20thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom20thjune.FacebookLogin;

public class Loginfacebook {
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		FacebookLogin fb=new FacebookLogin(driver);
		fb.email("laxmi");
		Thread.sleep(2000);
		fb.password("hanjagi");
		Thread.sleep(2000);
		fb.login();
		Thread.sleep(4000);
		driver.close();
	}
}
