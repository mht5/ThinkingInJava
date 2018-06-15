package practice.c_03.p_14;

public class StringCompare {
	static void test(String s1, String s2){
		System.out.println("\ns1==s2: "+(s1==s2));
		System.out.println("s1!=s2: "+(s1!=s2));
		System.out.println("s1.equals(s2): "+(s1.equals(s2)));
	}
	
	public static void main(String[] args){
		String s1="Hello",s2="world";
		test(s1,s2);
		String a=new String("singer");
		String b=new String("singer");
		test(a,b);
		s1="singer";
		s2="singer";
		test(s1,s2);
	}
}
