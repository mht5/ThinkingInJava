package test.c_10.games;

public class Checkers implements Game{
	private int moves=0;
	private static final int MOVES=3;
	
	public boolean move(){
		System.out.println("Checker move: "+moves);
		return ++moves!=MOVES;
	}
	
	public static GameFactory factory=new GameFactory(){
		public Game getGame(){
			return (new Checkers());
		}
	};
}
