package practice.c_18.p_27;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable{
	private int id;
	public Human(int id){
		this.id=id;
	}
	public String toString(){
		return Integer.toString(id);
	}
}
class Animal implements Serializable{
	private Human next;
	public Animal(int id){
		next=new Human(id);
	}
	public String toString(){
		StringBuilder result=new StringBuilder("Animal(Human(");
		result.append(next);
		result.append("))");
		return result.toString();
	}
}

public class TestObjectSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		Animal a=new Animal(1);
		System.out.println("a="+a);
		
//		读写文件
		ObjectOutputStream out=new ObjectOutputStream(
				new FileOutputStream("animal.out"));
		out.writeObject("Animal storage\n");
		out.writeObject(a);
		out.close();
		ObjectInputStream in=new ObjectInputStream(
				new FileInputStream("animal.out"));
		String s=(String)in.readObject();
		Animal a2=(Animal)in.readObject();
		System.out.println(s+"a2="+a2);
		
//		读写字节数组
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream out2=new ObjectOutputStream(bout);
		out2.writeObject("Animal storage\n");
		out2.writeObject(a);
		out2.close();
		ObjectInputStream in2=new ObjectInputStream(
				new ByteArrayInputStream(
						bout.toByteArray()));
		s=(String)in2.readObject();
		Animal a3=(Animal)in2.readObject();
		System.out.println(s+"a3="+a3);
	}
}
