package test.c_09.games;

public class CheckersFactory implements GameFactory{
	public Game getGame(){
		return (new Checkers());
	}
}
