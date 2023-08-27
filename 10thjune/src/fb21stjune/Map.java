package fb21stjune;

import org.testng.annotations.Test;

import pom20thjune.Pommap;

public class Map extends Generic_script {
	@Test
	public void map()
	{
		Pommap m=new Pommap(driver);
		m.bttn();
		m.source("Rajajinagar metro station");
		m.destination("Vijayanagar metro station");
	}
}
