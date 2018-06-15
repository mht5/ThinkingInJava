package test.c_13.simple_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class SimpleRead {
	public static BufferedReader input=new BufferedReader(new StringReader("Sir Robin of Camlot\n22 10.24"));

	public static void main(String[] args){
		try{
			System.out.println("What is your name?");
			String name=input.readLine();
			System.out.println(name);
			System.out.println("How old are you? and what's your favorate integer?");
			String numbers=input.readLine();
			String[] numberArray=numbers.split(" ");
			int age=Integer.parseInt(numberArray[0]);
			double f=Double.parseDouble(numberArray[1]);
			System.out.println(age+", "+f);
			System.out.format("Hi, %s.\n", name);
			System.out.format("In 5 years you will turn %d.\n", age+5);
			System.out.format("Your favorate number is %f.",f);
		}catch(IOException e){
			System.out.println(e.getStackTrace());
		}
	}
}
