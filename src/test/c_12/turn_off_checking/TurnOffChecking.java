package test.c_12.turn_off_checking;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用RuntimeException包装异常使其成为不被检查的异常，需要处理时使用getCause得到原来的异常
 * @author mohan
 *
 */
class WrapCheckedException {
	public void throwRuntimeException(int type){
		try{
			switch(type){
				case 0: throw new FileNotFoundException();
				case 1: throw new IOException();
				case 2: throw new RuntimeException("Where am I?");
				default: return;
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherException extends Exception{}

public class TurnOffChecking{
	public static void main(String[] args){
		WrapCheckedException wce=new WrapCheckedException();
		wce.throwRuntimeException(3);
		for(int i=0;i<4;i++){
			try{
				if(i<3){
					wce.throwRuntimeException(i);
				}
				else{
					throw new SomeOtherException();
				}
			}catch(SomeOtherException e){
				System.out.println("SomeOtherException: "+e);
			}catch(RuntimeException e){
				try{
					throw e.getCause();
				}catch(FileNotFoundException e1){
					System.out.println("FileNotFound: "+e1);
				}catch(IOException e2){
					System.out.println("IOException: "+e2);
				}catch(Throwable e3){
					System.out.println("Throwable: "+e3);
				}
			}
		}
	}
}