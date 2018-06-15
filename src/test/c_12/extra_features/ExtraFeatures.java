package test.c_12.extra_features;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ExtraFeatures {
	private static Logger logger=Logger.getLogger("Exception");
	
	public static void f() throws MyException{
		System.err.println("Throwing new exception from f().");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.err.println("Throwing new exception from g().");
		throw new MyException("Throwed from g()");
	}
	
	public static void h() throws MyException{
		System.err.println("Throwing new exception from h().");
		throw new MyException("Throwed from h()", 13);
	}
	
	public static void logException(Exception e){
		StringWriter trace=new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(MyException e){
			logException(e);
		}
		try{
			g();
		}catch(MyException e){
			logException(e);
		}
		try{
			h();
		}catch(MyException e){
			logException(e);
		}
	}
}
