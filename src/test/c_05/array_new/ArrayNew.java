package test.c_05.array_new;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args){
		Random rand=new Random();
		int[] a=new int[rand.nextInt(100)];
		System.out.println("arrayLength: "+a.length);
		System.out.println(Arrays.toString(a));
	}
}
