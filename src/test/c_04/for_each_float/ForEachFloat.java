package test.c_04.for_each_float;

import java.util.Random;

public class ForEachFloat {
	public static void main(String[] args){
		Float f[]=new Float[10];
		Random rand=new Random();
		for(int i=0;i<10;i++){
			f[i]=rand.nextFloat();
		}
		for(float x : f){
			System.out.println(x);
		}
	}
}
