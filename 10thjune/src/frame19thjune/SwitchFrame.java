package frame19thjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/mainpage.html");
		driver.findElement(By.id("un")).sendKeys("ABC");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("pwd")).sendKeys("XYZ");
	}
}
