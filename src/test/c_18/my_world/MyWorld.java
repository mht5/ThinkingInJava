package test.c_18.my_world;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 只要将任何对象序列化到单一流中，就可以恢复出与我们写出时一样的关系网，并且没有任何意外重复复制出的对象
 * @author mohan
 *
 */

class House implements Serializable{}

class Animal implements Serializable{
	private String name;
	private House preferredHouse;
	
	Animal(String name, House house){
		this.name=name;
		this.preferredHouse=house;
	}
	
	public String toString(){
		return name+"["+super.toString()+"], "+preferredHouse+"\n";
	}
}

public class MyWorld {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		House house=new House();
		List<Animal> animals=new ArrayList<Animal>();
		animals.add(new Animal("dog", house));
		animals.add(new Animal("hamster", house));
		animals.add(new Animal("cat", house));
		System.out.println("Animals:\n"+animals);

		ByteArrayOutputStream bout1=new ByteArrayOutputStream();
		ObjectOutputStream o1=new ObjectOutputStream(bout1);
		o1.writeObject(animals);
//		写入到同一个流中
		o1.writeObject(animals);	
		ByteArrayOutputStream bout2=new ByteArrayOutputStream();
		ObjectOutputStream o2=new ObjectOutputStream(bout2);
		o2.writeObject(animals);
		
//		recover data
		ObjectInputStream in1=new ObjectInputStream(
				new ByteArrayInputStream(bout1.toByteArray()));
		ObjectInputStream in2=new ObjectInputStream(
				new ByteArrayInputStream(bout2.toByteArray()));
		List
			animalList1=(List) in1.readObject(),
			animalList2=(List) in1.readObject(),
			animalList3=(List) in2.readObject();
		System.out.println("animalList1: "+animalList1);
		System.out.println("animalList2: "+animalList2);
		System.out.println("animalList3: "+animalList3);
	}
}
