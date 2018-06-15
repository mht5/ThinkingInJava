package test.c_13.simple_format;

/**
 *	格式化输出
 * @author mohan
 *
 */
public class SimpleFormat {
	public static void main(String[] args){
		int x=13;
		double y=3.1415926;
		System.out.println("Row1: ["+x+" "+y+"]");
		System.out.format("Row1: [%d %f]\n", x, y);
		System.out.printf("Row1: [%d %f]\n", x, y);
	}
}
