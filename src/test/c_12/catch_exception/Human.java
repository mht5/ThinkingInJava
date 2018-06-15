package test.c_12.catch_exception;

/**
 * ������Ķ������ƥ�������Ĵ������
 * @author mohan
 *
 */
class Exception1 extends Exception{}
class Exception2 extends Exception1{}

public class Human {
	public static void main(String[] args){
		try{
			throw new Exception2();
		}catch(Exception2 e){
			System.out.println("Caught Exception2");
		}catch(Exception1 e){
			System.out.println("Caught Exception1");
		}
		
		try{
			throw new Exception2();
		}catch(Exception1 e){
			System.out.println("Caught Exception1");
		}/*catch(Exception2 e){
			System.out.println("Caught Exception2");
		}*/
		
		try{
			throw new Exception1();
		}catch(Exception2 e){
			System.out.println("Caught Exception2");
		}catch(Exception1 e){
			System.out.println("Caught Exception1");
		}
	}
}
