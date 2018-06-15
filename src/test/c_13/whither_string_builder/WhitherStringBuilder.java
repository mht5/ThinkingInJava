package test.c_13.whither_string_builder;

/**
 * String, StringBuilder和StringBuffer添加字符串效率比较
 * @author mohan
 *
 */
public class WhitherStringBuilder {
	public static void usingString(){
		String s=null;
		long before=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s+=i;
		}
		long after=System.currentTimeMillis();
		System.out.println("Using string: "+(after-before)+"ms");
	}
	
	public static void usingStringBuilder(){
		StringBuilder s=new StringBuilder();
		long before=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s.append(i);
		}
		long after=System.currentTimeMillis();
		System.out.println("Using stringBuilder: "+(after-before)+"ms");
	}
	
	public static void usingStringBuffer(){
		StringBuffer s=new StringBuffer();
		long before=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s.append(i+"");
		}
		long after=System.currentTimeMillis();
		System.out.println("Using stringBuffer: "+(after-before)+"ms");
	}
	
	public static void main(String[] args){
		usingString();
		usingStringBuilder();
		usingStringBuffer();
	}
}
