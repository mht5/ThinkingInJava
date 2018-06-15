package test.c_07.cad_system;

public class Circle extends Shape{
	public Circle(int i){
		super(i);
		System.out.println("Drawing circle...");
	}
	
	public void dispose(){
		System.out.println("Erasing circle...");
		super.dispose();
	}
}
