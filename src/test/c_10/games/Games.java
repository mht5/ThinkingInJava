package test.c_10.games;

/**
 * ʹ��������ʵ�ֹ���ģʽ
 * @author mohan
 *
 */
public class Games {
	public static void playGame(GameFactory fact){
		Game g=fact.getGame();
		while(g.move());
	}
	
	public static void main(String[] args){
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}
