package test.c_07.cad_system;

public class Triangle extends Shape{
	public Triangle(int i){
		super(i);
		System.out.println("Drawing triangle...");
	}
	
	public void dispose(){
		System.out.println("Erasing triangle...");
		super.dispose();
	}
}
