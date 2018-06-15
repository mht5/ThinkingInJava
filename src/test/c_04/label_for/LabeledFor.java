package test.c_04.label_for;

public class LabeledFor {
	public static void main(String[] args){
		int i=0;
		outer:
		for(;true;){
			inner:
			for(;i<10;i++){
				if(i==2){
					System.out.println("continue.");
					continue;
				}
				if(i==3){
					System.out.println("break.");
					i++;
					break;
				}
				if(i==7){
					System.out.println("continue outer.");
					i++;
					continue outer;
				}
				if(i==8){
					System.out.println("break outer.");
					break outer;
				}
				for(int m=0;m<5;m++){
					if(m==3){
						System.out.println("continue inner.");
						continue inner;
					}
				}
			}
		}
	}
}
