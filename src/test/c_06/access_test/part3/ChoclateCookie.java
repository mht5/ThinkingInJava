package test.c_06.access_test.part3;

import test.c_06.access_test.part1.Cookie;

public class ChoclateCookie extends Cookie{
	private ChoclateCookie(){
		System.out.println("This is not just a cookie, it's a choclate cookie.");
	}
	
	protected static ChoclateCookie makeAChoclateCookie(){
		System.out.println("making a cookie...");
		return new ChoclateCookie();
	}
}
