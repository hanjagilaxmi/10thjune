package assert15thjune;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import test14thjune.Generic_script;

public class Softasser extends Generic_script {
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanjagilaxmi8@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hanjagi");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert as=new SoftAssert();
		as.assertEquals(title, "Log in to Facebook");
		Assert.fail();
		System.out.println("1");
		as.assertAll();
	}
}
