package practice.c_12.p_05;

public class Test {
	public static void main(String[] args){
		int[] a=new int[6];
		int i=10;
		boolean flag=false;
		while(!flag){
			i--;
			try{
				for(;i>0;i--){
					a[i]=i;
				}
				flag=true;
			}catch(ArrayIndexOutOfBoundsException e){
				flag=false;
				e.printStackTrace();
			}
		}
	}
}
