package practice.c_12.p_07;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ArrayIndexOutOfBounds {
	private static Logger logger=Logger.getLogger("Exception");
	
	public static void main(String[] args){
		int[] a=new int[6];
		try{
			for(int i=0;i<10;i++){
				a[i]=i;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			StringWriter trace=new StringWriter();
			e.printStackTrace(new PrintWriter(trace));
			logger.severe(trace.toString());
		}
	}
}
