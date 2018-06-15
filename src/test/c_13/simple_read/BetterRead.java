package test.c_13.simple_read;

import java.util.Scanner;

public class BetterRead {
	public static void main(String[] args){
		Scanner stdin=new Scanner(SimpleRead.input);
		System.out.println("What is your name?");
		String name=stdin.nextLine();
		System.out.println(name);
		System.out.println("How old are you? and what's your favorate integer?");
		int age=stdin.nextInt();
		double f=stdin.nextDouble();
		System.out.println(age+", "+f);
		System.out.format("Hi, %s.\n", name);
		System.out.format("In 5 years you will turn %d.\n", age+5);
		System.out.format("Your favorate number is %f.",f);
	}
}
