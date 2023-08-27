package dataprovider30thjune;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Runner {
	@Test(dataProvider="test1")
	public void Login(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "abc" },
	   { "Anne", "xyz"},
	 };
	}

}
