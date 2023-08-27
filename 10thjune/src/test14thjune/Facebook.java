package test14thjune;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook extends Generic_script {
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Test
	public void login1()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
