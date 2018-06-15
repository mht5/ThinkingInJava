package practice.c_09.p_19;

import java.util.Random;

public class DiceThrow implements Game{
	private static Random rand=new Random();
	
	public void play(){
		System.out.println("DiceThrow: "+(rand.nextInt(6)+1));
	}
}
