package test.c_10.parcel_test09;

import test.c_10.parcel_test04.Destination;

/**
 * 匿名内部类
 * @author mohan
 *
 */
public class Parcel {
	//定义匿名内部类时初始化字段，在匿名类内部使用的参数要加final
	public Destination destination(final String s){
		return new Destination(){
			private String label=s;
			
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea").readLabel());
	}
}
