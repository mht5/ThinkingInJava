package test.c_08.poly_constructors;

public class Glyph {
	public Glyph(){
		System.out.println("Glyph before draw()");
		draw();
		System.out.println("Glyph after draw()");
	}
	
	public void draw(){
		System.out.println("Glyph.draw()");
	}
}
