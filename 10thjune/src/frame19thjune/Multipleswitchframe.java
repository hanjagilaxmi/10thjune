package frame19thjune;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleswitchframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/deepa/OneDrive/Desktop/QSP/HTML/mainpage.html");
		driver.findElement(By.id("un")).sendKeys("ABC");
		driver.switchTo().frame("f1");//A to B
		driver.findElement(By.id("pwd")).sendKeys("XYZ");
		driver.switchTo().frame(0);//B to C
		driver.findElement(By.id("c1")).click();
		driver.switchTo().defaultContent();//C to A(child to first main frame)
		driver.findElement(By.id("un")).sendKeys("123");
		driver.switchTo().parentFrame();//C to B(child to immediate parent)
		driver.findElement(By.id("pwd")).sendKeys("234");
		driver.close();
	}
}
