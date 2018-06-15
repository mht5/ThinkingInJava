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
 * ֻҪ���κζ������л�����һ���У��Ϳ��Իָ���������д��ʱһ���Ĺ�ϵ��������û���κ������ظ����Ƴ��Ķ���
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
//		д�뵽ͬһ������
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
