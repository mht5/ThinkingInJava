package practice.c_08.p_03;

public class Shapes {
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	
	public static void main(String[] args){
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++){
			s[i]=gen.next();
		}
		for(Shape shape : s){
			shape.draw();
			shape.printInfo();
		}
	}
}
