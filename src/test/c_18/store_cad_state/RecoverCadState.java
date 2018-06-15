package test.c_18.store_cad_state;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class RecoverCadState {
	public static void main(String[] args) throws Exception{
		ObjectInputStream in=new ObjectInputStream(
				new FileInputStream("CadState.out"));
		List<Class<? extends Shape>> shapeTypes=(List<Class<? extends Shape>>) in.readObject();
		Line.deserializeStaticState(in);
		List<Shape> shapes=(List<Shape>) in.readObject();
		System.out.println(shapes);
	}
}
