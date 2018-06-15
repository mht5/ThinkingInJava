package test.c_13.formatter;

import java.io.PrintStream;
import java.util.Formatter;

public class Turtle {
	private String name;
	private Formatter out;
	
	public Turtle(String name, Formatter out){
		this.name=name;
		this.out=out;
	}
	
	public void move(int x, int y){
		out.format("%s the turtle is at (%d,%d) now.\n", name,x,y);
	}
	
	public static void main(String[] args){
		PrintStream outAlias=System.out;
		Turtle tommy=new Turtle("Tommy", new Formatter(System.out));
		Turtle terry=new Turtle("Terry",new Formatter(outAlias));
		tommy.move(0,0);
		terry.move(1,2);
		tommy.move(2,2);
		terry.move(3,3); 
		tommy.move(4,2);
		terry.move(2,1);
	}
}
