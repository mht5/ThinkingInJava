package test.c_16.ragged_array;

import java.util.Arrays;
import java.util.Random;

public class RaggedArray {
	public static int[][][] getArray(){
		Random rand=new Random();
		int[][][] a=new int[rand.nextInt(7)+1][][];
		for(int i=0;i<a.length;i++){
			a[i]=new int[rand.nextInt(5)+1][];
			for(int j=0;j<a[i].length;j++){
				a[i][j]=new int[rand.nextInt(5)+1];
			}
		}
		return a;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.deepToString(getArray()));
	}
}
