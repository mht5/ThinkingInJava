package practice.c_12.p_03;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args){
		int[] a=new int[6];
		try{
			for(int i=0;i<10;i++){
				a[i]=i;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
}
