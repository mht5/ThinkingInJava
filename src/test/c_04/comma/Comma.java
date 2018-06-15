package test.c_04.comma;

public class Comma {
	public static void main(String[] args){
		for(int i=1,j=i+2;i<6;i++,j=i*2){
			System.out.println("i="+i+", j="+j);
		}
	}
}
