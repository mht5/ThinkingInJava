package practice.c_03.p_04;

import java.util.Random;

public class Speed {
	public static void main(String[] args){
		Random rand=new Random();
		/*for(int i=0;i<6;i++){*/
			float d=rand.nextFloat()*10000;
			int s=rand.nextInt(100)+1;
			System.out.println("distance: "+d+"m\ntime: "+s+"s");
			System.out.println("speed: "+d/s+"m/s\n");
		/*}*/
	}
}
