package practice.c_09.p_19;

public class CoinFactory implements GameFactory{
	public Game getGame(){
		return (new CoinFlip());
	}
}
