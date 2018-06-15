package practice.c_12.p_22;

import java.util.Random;

public class FailingConstructor {
	private Random rand=new Random();
	
	public FailingConstructor(){
		int i=rand.nextInt(23);
		if(i%2==0){
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args){
		try{
			FailingConstructor fc=new FailingConstructor();
		}catch(Exception e){
			System.out.println("Initialization failed");
		}
	}
}
