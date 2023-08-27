package testscripr20thjune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom20thjune.Pom;

public class Facebook {
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Pom p=new Pom(driver);
		Thread.sleep(2000);
		p.login();
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.login();
		driver.close();
	}
}
