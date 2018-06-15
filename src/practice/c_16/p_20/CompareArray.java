package practice.c_16.p_20;

import java.util.Arrays;

public class CompareArray {
	public static void main(String[] args){
		int[][] a1=new int[2][4];
		int[][] a2=new int[2][4];
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++){
				a1[i][j]=i*j;
				a2[i][j]=i*j;
			}
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.deepEquals(a1, a2));
	}
}
