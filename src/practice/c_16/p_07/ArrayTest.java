package practice.c_16.p_07;

import java.util.Arrays;

import test.c_16.array_options.Apple;

/**
 * 根据参数生成一个三维数组
 * @author mohan
 *
 */
public class ArrayTest {
	public static Apple[][][] fill(int x, int y, int z){
		Apple[][][] apples=new Apple[x][y][z];
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				for(int k=0;k<z;k++){
					apples[i][j][k]=new Apple();
				}
			}
		}
		return apples;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.deepToString(fill(2,3,2)));
	}
}
