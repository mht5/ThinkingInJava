package practice.c_12.p_28;

/**
 * 抛出不被检查的异常可以不适用try-catch
 * @author mohan
 *
 */
public class Test {
	public static void f(){
		throw new RuntimeException(new MyException("This is a new exception"));
	}
	
	public static void main(String[] args){
//		try{
			f();
		/*}catch(MyException e){
			e.printMsg();
			e.printStackTrace();
		}*/
	}
}
