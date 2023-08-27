package logger27thjune;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class logger_class {
	@Test
	public void test() throws IOException
	{
		Layout lay=new PatternLayout("%d %m %c %n");
		Appender app=new FileAppender(lay,"./reports/l.log");
		BasicConfigurator.configure(app);
		Logger log=Logger.getLogger(this.getClass());
		log.error("error");
		log.fatal("fatal");
		log.info("info");
	}
}
