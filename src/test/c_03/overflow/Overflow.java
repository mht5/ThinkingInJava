package test.c_03.overflow;

/**
 * ����������㹻���intֵ���г˷����㣬����ͻ����
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
