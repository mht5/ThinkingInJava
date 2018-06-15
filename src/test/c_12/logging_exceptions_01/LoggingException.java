package test.c_12.logging_exceptions_01;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException extends Exception{
//	创建一个与String参数相关联的Logger对象，这个对象的输出会发送到System.err
	private static Logger logger=Logger.getLogger("LoggingException");
	
	public LoggingException(){
//		获取printStackTrace产生的字符串
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
//		输出printStackTrace产生的字符串
		logger.severe(trace.toString());
	}
}