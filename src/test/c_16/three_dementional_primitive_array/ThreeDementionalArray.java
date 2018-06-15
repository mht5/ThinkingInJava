package test.c_16.three_dementional_primitive_array;

import java.util.Arrays;

public class ThreeDementionalArray {
	public static void main(String[] args){
		int[][] b=new int[2][4];
		System.out.println(Arrays.deepToString(b));
		int[][][] a=new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}
}
