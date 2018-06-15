package test.c_12.stormy_inning;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	public Inning() throws BaseballException{};
	public void event() throws BaseballException{};
	public abstract void atBat() throws Foul,Strike;
	public void walk(){};
}

class StormException extends Exception{}
class RainOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	public void event() throws RainOut;
	public void rainHard() throws RainOut;
}

public class StormyInning extends Inning implements Storm{
	public StormyInning() throws RainOut, BaseballException{}
	public StormyInning(String s) throws Foul, BaseballException{}
	public void rainHard() throws RainOut {}
//	���෽��δ����RainOut�쳣
//	public void event() throws RainOut{}
	public void event(){};
	public void atBat() throws PopFoul{}
//	�����walk����û�������쳣
//	public void walk() throws PopFoul{}
	
	public static void main(String[] args){
		try{
			StormyInning si=new StormyInning();
			si.atBat();
		}catch(PopFoul e){
			System.err.println("new PopFoul exception");
			e.printStackTrace();
		}catch(RainOut e){
			System.err.println("new RainOut exception");
			e.printStackTrace();
		}catch(BaseballException e){
			System.err.println("new BaseballException");
			e.printStackTrace();
		}
		try{
			Inning i=new StormyInning();
			i.atBat();
		}catch(Strike e){
			System.err.println("new Strike exception");
			e.printStackTrace();
		}catch(Foul e){
			System.err.println("new Foul exception");
			e.printStackTrace();
		}catch(RainOut e){
			System.err.println("new RainOut exception");
			e.printStackTrace();
		}catch(BaseballException e){
			System.err.println("new BaseballException");
			e.printStackTrace();
		}
	}
}
