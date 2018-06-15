package practice.c_11.p_31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape>{
	private static Random rand=new Random();
	private static Shape[] shapes;
	
	public RandomShapeGenerator(int n){
		shapes=new Shape[n];
		for(int i=0;i<n;i++){
			shapes[i]=next();
		}
	}
	
	public static Shape next(){
		switch(rand.nextInt(3)){
			case 0: return new Circle();
			case 1: return new Square();
			case 2: return new Triangle();
			default: return new Shape();
		}
	}

	@Override
	public Iterator iterator() {
		return new Iterator<Shape>(){
			private int index=0;
			
			public boolean hasNext(){
				return index<shapes.length;
			}
			
			public Shape next(){
				return shapes[index++];
			}
			
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args){
		RandomShapeGenerator rsg=new RandomShapeGenerator(7); 
		for(Shape s : shapes){
			System.out.println(s);
		}
	}
}
