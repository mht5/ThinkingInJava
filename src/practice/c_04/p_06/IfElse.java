package practice.c_04.p_06;

public class IfElse {
	public static void main(String[] args){
		System.out.println(test(6,2,8));
		System.out.println(test(12,10,20));
		System.out.println(test(10,2,20));
		System.out.println(test(8,12,20));
	}
	
	static String test(int i, int begin, int end){
		if((i<begin)||(i>end)){
			return (i+" is not in the range "+begin+"-"+end+".");
		}
		else if(i>10){
			return (i+" is bigger than 10.");
		}
		else if(i<10){
			return (i+" is lesser than 10.");
		}
		else{
			return (i+" is equal to 10.");
		}
	}
}
