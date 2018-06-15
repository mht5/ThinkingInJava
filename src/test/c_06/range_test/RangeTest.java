package test.c_06.range_test;

import static util.Print.*;
import static util.Range.*;

public class RangeTest {
	public static void main(String[] args){
		int[] a=range(12);
		int[] b=range(2,16);
		int[] c=range(2,8,2);
		print("a: ");
		for(int i=0;i<a.length;i++){
			print(a[i]+" ");
		}
		print("\nb: ");
		for(int i=0;i<b.length;i++){
			print(b[i]+" ");
		}
		print("\nc: ");
		for(int i=0;i<c.length;i++){
			print(c[i]+" ");
		}
	}
}
