package practice.c_09.p_19;

public class Games {
	public static void getGame(GameFactory x){
		x.getGame().play();
	}
	
	public static void play(Game g){
		g.play();
	}
	
	public static void main(String[] args){
		getGame(new CoinFactory());
		getGame(new DiceFactory());
	}
}
