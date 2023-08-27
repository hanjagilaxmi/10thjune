package assert15thjune;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import test14thjune.Generic_script;

public class Assert1 extends Generic_script {
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log in to Facebook");
		System.out.println("1");
	}

}
