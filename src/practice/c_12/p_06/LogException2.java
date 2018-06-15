package practice.c_12.p_06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogException2 extends Exception{
	private Logger logger=Logger.getLogger("LogException2");
	
	public LogException2(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
