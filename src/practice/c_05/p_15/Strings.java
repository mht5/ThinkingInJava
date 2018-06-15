package practice.c_05.p_15;

public class Strings {
	String str1;
	String str2;
	{
		str1="Hello ";
		str2="world!";
		System.out.println("str1 and str2 initialized.");
	}
	
	Strings(){
		System.out.println("strings()");
	}
	
	void printInfo(){
		System.out.println(str1+str2);
	}
}
