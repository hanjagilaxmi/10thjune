package fb21stjune;

import org.testng.annotations.Test;
import pom20thjune.FacebookLogin;
import test14thjune.Generic_script;

public class Fblogin extends Generic_script {
	@Test
	public void login() throws InterruptedException
	{
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
