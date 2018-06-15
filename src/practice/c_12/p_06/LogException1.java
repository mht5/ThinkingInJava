package practice.c_12.p_06;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LogException1 extends Exception{
	private Logger logger=Logger.getLogger("LogException1");
	
	public LogException1(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
