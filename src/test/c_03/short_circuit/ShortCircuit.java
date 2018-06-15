package test.c_03.short_circuit;

/**
 * 短路，一旦能明确无误地确定整个表达式的值，就不再计算表达式剩余的部分
 * @author mohan
 *
 */
public class ShortCircuit {
	static boolean test1(int val){
		System.out.println("test1("+val+")");
		System.out.println("result: "+(val<1));
		return val<1;
	}
	static boolean test2(int val){
		System.out.println("test2("+val+")");
		System.out.println("result: "+(val<2));
		return val<2;
	}
	static boolean test3(int val){
		System.out.println("test3("+val+")");
		System.out.println("result: "+(val<3));
		return val<3;
	}
	public static void main(String[] args){
		boolean flag=(test1(0)&&test2(2)&&test3(2));
		System.out.println("The expression is "+flag+".\n");
		flag=(test1(1)||(test2(0)||test3(6)));
		System.out.println("The expression is "+flag+".");
	}
}
