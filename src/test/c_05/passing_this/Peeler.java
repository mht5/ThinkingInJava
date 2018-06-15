package test.c_05.passing_this;

import java.util.Random;

public class Peeler {
	public static boolean peel(Apple apple){
		Random rand=new Random();
		if(rand.nextInt(100)%2==0){
			return true;
		}
		else{
			return false;
		}
	}
}
