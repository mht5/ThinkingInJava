package test.c_05.enum_sample;

public class EnumOrder {
	public static void main(String[] args){
		for(Spiciness s : Spiciness.values()){
			System.out.println(s+": "+s.ordinal());
		}
	}
}
