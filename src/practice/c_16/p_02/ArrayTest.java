package practice.c_16.p_02;

import java.util.Arrays;

class Apple{
	private static long counter;
	private final long id=counter++;
	
	public String toString(){
		return "Apple"+id;
	}
}

public class ArrayTest {
	public static Apple[] buy(int n){
		Apple[] apples=new Apple[n];
		for(int i=0;i<n;i++){
			apples[i]=new Apple();
		}
		return apples;
	}
	
	public static void main(String[] args){
		System.out.println(Arrays.toString(buy(7)));
	}
}
