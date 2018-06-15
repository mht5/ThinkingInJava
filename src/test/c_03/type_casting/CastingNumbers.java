package test.c_03.type_casting;

/**
 * double和float类型在转型为整值时，总是对该数字执行截尾
 * @author mohan
 *
 */
public class CastingNumbers {
	public static void main(String[] args){
		double above=0.7,below=0.4;
		float fAbove=0.7f,fBelow=0.4f;
		System.out.println("(int)above: "+(int)above);
		System.out.println("(int)below: "+(int)below);
		System.out.println("(int)fAbove: "+(int)fAbove);
		System.out.println("(int)fBelow: "+(int)fBelow);
	}
}
