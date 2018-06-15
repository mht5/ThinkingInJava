package practice.c_07.p_08;

public class BoardGame extends Game{
	BoardGame(){
		super(1);
		System.out.println("Default board game constructor.");
	}
	
	BoardGame(int i){
		super(i);
		System.out.println("Board game constructor.");
	}
	
	public static void main(String[] args){
		new BoardGame();
		new BoardGame(2);
	}
}
