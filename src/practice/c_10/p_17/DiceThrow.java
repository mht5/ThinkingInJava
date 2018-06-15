package practice.c_10.p_17;

import java.util.Random;

public class DiceThrow implements Game{
	private static Random rand=new Random();
	
	public void play(){
		System.out.println("DiceThrow: "+(rand.nextInt(6)+1));
	}
	
	public static GameFactory factory=new GameFactory(){
		public Game getGame(){
			return (new DiceThrow());
		}
	};
}
