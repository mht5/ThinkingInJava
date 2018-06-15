package test.c_13.array_list_display;

import java.util.Random;

public class RandomShapeGenerator {
	private static Random rand=new Random();
	
	public static Shape next(){
		switch(rand.nextInt(3)){
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			default: return new Shape();
		}
	}
}
