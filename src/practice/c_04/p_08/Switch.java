package practice.c_04.p_08;

import java.util.Random;

public class Switch {
	public static void main(String[] args){
		Random rand=new Random();
		for(int i=0;i<20;i++){
			int n=rand.nextInt(10000);
			switch(n%6){
			case 0: System.out.println("original"); break;
			case 1: System.out.println("type1"); break;
			case 2: System.out.println("type2"); break;
			case 3: System.out.println("type3"); break;
			case 4: System.out.println("type4"); break;
			case 5: System.out.println("type5"); break;
			default: System.out.println("default"); break;
			}
		}
	}
}
