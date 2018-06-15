package test.c_12.logging_exceptions_01;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException extends Exception{
//	����һ����String�����������Logger����������������ᷢ�͵�System.err
	private static Logger logger=Logger.getLogger("LoggingException");
	
	public LoggingException(){
//		��ȡprintStackTrace�������ַ���
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
//		���printStackTrace�������ַ���
		logger.severe(trace.toString());
	}
}