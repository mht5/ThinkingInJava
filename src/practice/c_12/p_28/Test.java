package practice.c_12.p_28;

/**
 * �׳����������쳣���Բ�����try-catch
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
