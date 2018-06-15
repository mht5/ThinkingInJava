package practice.c_10.p_17;

public class Games {
	public static void getGame(GameFactory x){
		x.getGame().play();
	}
	
	public static void play(Game g){
		g.play();
	}
	
	public static void main(String[] args){
		getGame(CoinFlip.factory);
		getGame(DiceThrow.factory);
	}
}
