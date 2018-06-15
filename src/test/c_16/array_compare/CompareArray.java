package test.c_16.array_compare;

import java.util.Arrays;

/**
 * 数组的比较
 * @author mohan
 *
 */
public class CompareArray {
	public static void main(String[] args){
		int[] a1=new int[6];
		int[] a2=new int[6];
		Arrays.fill(a1, 47);
		Arrays.fill(a2, 47);
		System.out.println(Arrays.equals(a1, a2));
		a2[2]=13;
		System.out.println(Arrays.equals(a1, a2));
		
		String[] s1=new String[6];
		String[] s2={"Hi","Hi","Hi","Hi","Hi","Hi"};
		Arrays.fill(s1, "Hi");
		System.out.println(Arrays.equals(s1, s2));
	}
}
