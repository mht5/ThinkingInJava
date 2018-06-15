package util;

import java.util.Arrays;
import java.util.Collection;

public class PPrint {
	public static String pFormat(Collection<?> c){
		if(c.size()==0){
			return "[]";
		}
		StringBuilder result=new StringBuilder("[");
		for(Object item : c){
			if(c.size()!=1){
				result.append("\n ");
			}
			result.append(item);
		}
		if(c.size()!=1){
			result.append("\n");
		}
		result.append("]");
		return result.toString();
	}
	
	public static void pPrint(Collection<?> c){
		System.out.println(pFormat(c));
	}
	
	public static void pPrint(Object[] c){
		System.out.println(pFormat(Arrays.asList(c)));
	}
}
