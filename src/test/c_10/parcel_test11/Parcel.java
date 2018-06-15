package test.c_10.parcel_test11;

import test.c_10.parcel_test04.Contents;
import test.c_10.parcel_test04.Destination;

/**
 * 声明为static的内部类是嵌套类
 * 1.要创建嵌套类对象不用先创建外围对象
 * 2.不能从嵌套类对象中访问非静态的外围对象
 * 3.嵌套类可以包含静态数据和字段
 * @author mohan
 *
 */
public class Parcel {
	private static class PContents implements Contents{
		private int i=13;
		
		public int value(){
			return i;
		}
	}
	
	protected static class PDestination implements Destination{
		private String label;
		
		private PDestination(String s){
			this.label=s;
		}
		
		public String readLabel(){
			return label;
		}
		
		public static void f(){}
		
		static int x=10;
		
		static class AnotherLevel{
			public static void f(){}
			
			static int x=10;
		}
	}
	
	public static Destination destination(String s){
		return (new PDestination(s));
	}
	
	public static Contents contents(){
		return (new PContents());
	}
	
	public static void main(String[] args){
		Contents c=contents();
		Destination d=destination("Smoky sea");
	}
}
