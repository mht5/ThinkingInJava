package practice.c_05.p_21;

public class Tester {
	public static void main(String[] args){
		for(Currency c : Currency.values()){
			System.out.println(c+": "+c.ordinal());
		}
	}
}
