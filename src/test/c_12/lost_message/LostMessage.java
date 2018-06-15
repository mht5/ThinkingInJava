package test.c_12.lost_message;

/**
 * 异常丢失，前一个抛出的异常还未被处理就抛出了另一个异常，导致前面抛出的异常被覆盖
 * @author mohan
 *
 */

class Exception1 extends Exception{
	public String toString(){
		return "a very important exception";
	}
}

class Exception2 extends Exception{
	public String toString(){
		return "a trivial exception";
	}
}

public class LostMessage {
	public void f() throws Exception1{
		throw new Exception1();
	}
	
	public void dispose() throws Exception2{
		throw new Exception2();
	}
	
	public static void main(String[] args){
		try{
			LostMessage lm=new LostMessage();
			try{
				lm.f();
			}finally{
				lm.dispose();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
