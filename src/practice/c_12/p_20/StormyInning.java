package practice.c_12.p_20;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}
class UmpireArgument extends Exception{}

abstract class Inning{
	public Inning() throws BaseballException{};
	public void event() throws BaseballException{};
	public abstract void atBat() throws Foul,Strike;
	public void walk(){};
	public void umpire() throws UmpireArgument{}
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
//	基类方法未声明RainOut异常
//	public void event() throws RainOut{}
	public void event(){};
	public void atBat() throws PopFoul{}
//	基类的walk方法没有声明异常
//	public void walk() throws PopFoul{}
//	派生类方法可以不抛出基类方法异常说明中的异常
	public void umpire(){}
	
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
