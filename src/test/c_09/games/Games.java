package test.c_09.games;

public class Games {
	public static void playGame(GameFactory fact){
		Game g=fact.getGame();
		while(g.move());
	}
	
	public static void main(String[] args){
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}
