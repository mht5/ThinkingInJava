package test.c_09.games;

public class ChessFactory implements GameFactory{
	public Game getGame(){
		return (new Chess());
	}
}
