package test.c_10.parcel_test07;

import test.c_10.parcel_test04.Destination;

/**
 * 匿名内部类：没有构造器
 * @author mohan
 *
 */
public class Parcel {
	//返回一个继承自Destination的匿名类对象
	public Destination destination(String s){
		return new Destination(){
			private String label;
			
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea").readLabel());
	}
}
