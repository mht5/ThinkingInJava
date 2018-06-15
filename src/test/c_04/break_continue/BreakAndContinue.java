package test.c_04.break_continue;

public class BreakAndContinue {
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			if(i==73){
				break;
			}
			if(i%9!=0){
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		int i=0;
		while(true){
			i++;
			int j=i*13;
			if(j==169){
				break;
			}
			if(j%2==0){
				continue;
			}
			System.out.print(j+" ");
		}
	}
}
