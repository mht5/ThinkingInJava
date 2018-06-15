package practice.c_16.p_03;

import java.util.Arrays;
import java.util.Random;

/**
 * 前两个参数指定数组尺寸，后两个参数指定取值范围
 * @author mohan
 *
 */
public class ArrayTest {
	public static double[][] getArray(int i, int j, int m, int n){
		Random rand=new Random();
		double[][] a=new double[i][j];
		for(int x=0;x<i;x++){
			for(int y=0;y<j;y++){
				double i1=rand.nextDouble()*n;
				while(i1<m){
					i1=rand.nextDouble()*n;
				}
				a[x][y]=i1;
			}
		}
		return a;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.deepToString(getArray(2,2,1,7)));
	}
}
