package test.c_12.finally_works;

/**
 * 无论是否有异常抛出，finally总是要执行
 * @author mohan
 *
 */
class MyException extends Exception{}

public class FinallyWorks {
	private static int count=0;
	
	public static void main(String[] args){
		while(true){
			try{
				if(count++==0){
					throw new MyException();
				}
				System.out.println("No Exception");
			}catch(MyException e){
				System.out.println("MyException");
			}finally{
				System.out.println("Inside finally");
				if(count%2==0){
					break;
				}
			}
		}
	}
}
