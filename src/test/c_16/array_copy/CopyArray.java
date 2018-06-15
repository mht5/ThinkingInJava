package test.c_16.array_copy;

import java.util.Arrays;

/**
 * 使用(System.arraycopy)复制数组，用此方法复制对象数组是浅复制
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
