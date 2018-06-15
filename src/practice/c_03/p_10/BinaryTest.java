package practice.c_03.p_10;

public class BinaryTest {
	public static void main(String[] args){
		long n1=0x01101l;
		long n2=0x01010l;
		System.out.println("n1:		"+Long.toBinaryString(n1));
		System.out.println("n2:       	"+Long.toBinaryString(n2));
		System.out.println("n1&n2:	"+Long.toBinaryString((n1&n2)));
		System.out.println("n1|n2:	"+Long.toBinaryString((n1|n2)));
		System.out.println("n1^n2:	"+Long.toBinaryString((n1^n2)));
		System.out.println("~n1:		"+Long.toBinaryString(~n1));
		System.out.println("~n2:       	"+Long.toBinaryString(~n2));
	}
}
