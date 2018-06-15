package test.c_16.array_copy;

import java.util.Arrays;

/**
 * ʹ��(System.arraycopy)�������飬�ô˷������ƶ���������ǳ����
 * @author mohan
 *
 */
public class CopyArray {
	public static void main(String[] args){
		int[] i=new int[7];
		int[] j=new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		System.out.println("i="+Arrays.toString(i));
		System.out.println("j="+Arrays.toString(j));
		System.arraycopy(i, 0, j, 1, i.length);
		System.out.println("j="+Arrays.toString(j));
	}
}
