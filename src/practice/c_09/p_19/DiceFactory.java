package practice.c_09.p_19;

public class DiceFactory implements GameFactory{
	public Game getGame(){
		return (new DiceThrow());
	}
}
