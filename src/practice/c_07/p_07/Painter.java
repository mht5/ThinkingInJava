package practice.c_07.p_07;

import java.util.Date;

public class Painter extends Human{
	public Painter(){
		super((new Date()).toString());
		System.out.println("Painter constructor.");
		new Drawing((new Date()).toString());
	}
	
	public static void main(String[] args){
		new Painter();
	}
}
