package practice.c_04.p_07;

public class PrintNumbers {
	public static void main(String[] args){
		test1(99);
		test2(99);
	}
	
	static void test1(int n){
		int i=1;
		while(true){
			System.out.println(i);
			if(i==n){
				break;
			}
			i++;
		}
	}
	
	static void test2(int n){
		System.out.println("\n*********");
		int i=1;
		while(true){
			System.out.println(i);
			if(i==n){
				return;
			}
			i++;
		}
	}
}
