package practice.c_09.p_19;

import java.util.Random;

public class CoinFlip implements Game{
	private static Random rand=new Random();
	
	public void play(){
		if(rand.nextInt(2)==0){
			System.out.println("CoinFlip: front");
		}
		else{
			System.out.println("CoinFlip: back");
		}
	}
}
