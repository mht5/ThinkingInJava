package practice.c_12.p_27;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args){
		int[] a=new int[6];
		try{
			for(int i=0;i<10;i++){
				if(i>a.length-1){
					throw new RuntimeException(new ArrayIndexOutOfBoundsException());
				}
				a[i]=i;
			}
		}catch(RuntimeException e){
			try {
				throw e.getCause();
			} catch (ArrayIndexOutOfBoundsException e1) {
				e1.printStackTrace();
			} catch (Throwable e1) {
				e.printStackTrace();
			}
		}
	}
}
