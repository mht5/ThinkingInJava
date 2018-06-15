package test.c_03.overflow;

/**
 * 如果对两个足够大的int值进行乘法运算，结果就会溢出
 * @author mohan
 *
 */
public class Overflow {
	public static void main(String[] args){
		int big=Integer.MAX_VALUE;
		System.out.println("big: "+big);
		int bigger=big*2;
		System.out.println("bigger: "+bigger);
	}
}
