package practice.c_03.p_07;

import java.util.Random;

public class ToFlipACoin {
	public static void main(String[] args){
		Random rand=new Random();
		int front,back;
		front=0;
		back=0;
		for(int i=0;i<1000;i++){
			if((rand.nextInt())%2==0){
				front+=1;
				System.out.println("true");
			}
			else{
				back+=1;
				System.out.println("false");
			}
		}
		double x=front/1000.0;
		double y=back/1000.0;
		System.out.println("***************************");
		System.out.println("1000��Ͷ��Ӳ���й�������"+front+"��("+x*100+"%)������"+back+"��("+y*100+"%)��");
	}
}
