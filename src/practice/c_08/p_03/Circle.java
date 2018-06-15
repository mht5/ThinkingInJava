package practice.c_08.p_03;

public class Circle extends Shape{
	public void draw(){
		System.out.println("Circle.draw()");
	}
	
	public void erase(){
		System.out.println("Circle.erase()");
	}
	
	public void printInfo(){
		System.out.println("This is a circle.");
	}
}
