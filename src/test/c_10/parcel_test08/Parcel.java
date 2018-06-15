package test.c_10.parcel_test08;

/**
 * 匿名内部类
 * @author mohan
 *
 */
public class Parcel {
	//返回一个继承自(含带参构造器对象)的匿名类对象
	public Wrapping wrapping(int i){
		return new Wrapping(i){
			private int i;
			
			public int value(){
				return super.value();
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().wrapping(1).value());
	}
}
