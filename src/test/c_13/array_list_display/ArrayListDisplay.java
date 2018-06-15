package test.c_13.array_list_display;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDisplay {
	public static void main(String[] args){
		List<Shape> shapes=new ArrayList<Shape>();
		for(int i=0;i<6;i++){
			shapes.add(RandomShapeGenerator.next());
		}
		System.out.println(shapes);
	}
}
