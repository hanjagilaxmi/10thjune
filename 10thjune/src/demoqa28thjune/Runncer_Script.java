package demoqa28thjune;

import org.testng.annotations.Test;

public class Runncer_Script extends Base_Test1{
	@Test
	public void test() throws InterruptedException
	{
		Pom_Script pm=new Pom_Script(driver);
		pm.first("Laxmi");
		pm.last("Hanjagi");
		pm.email("laxmihanjagi@gmail.com");
		pm.gender();
		pm.num("7896541236");
		pm.date("24 Jun 2008");
		pm.subj("hello, good morning");
		pm.hobby(driver);
		pm.upload("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP\\Facebook.jpeg");
		pm.address("Vijayapura");
	}
}
