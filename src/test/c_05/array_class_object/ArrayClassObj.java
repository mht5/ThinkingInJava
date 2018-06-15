package test.c_05.array_class_object;

import java.util.Arrays;
import java.util.Random;

public class ArrayClassObj {
	public static void main(String[] args){
		Random rand=new Random();
		Integer[] a=new Integer[rand.nextInt(20)];
		for(int i=0;i<a.length;i++){
			a[i]=rand.nextInt(1000);
		}
		System.out.println(Arrays.toString(a));
	}
}
