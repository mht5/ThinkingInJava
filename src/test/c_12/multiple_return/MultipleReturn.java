package test.c_12.multiple_return;

public class MultipleReturn {
	public static void f(int x){
		System.out.println("Initialization that needs cleanup");
		try{
			System.out.println("Point 1");
			if(x==0) return;
			System.out.println("Point 2");
			if(x==1) return;
			System.out.println("Point 3");
			if(x==2) return;
			System.out.println("End.");
			return;
		}finally{
			System.out.println("cleaning up");
		}
	}
	
	public static void main(String[] args){
		for(int i=0;i<4;i++){
			f(i);
		}
	}
}
