package test.c_18.blips_01;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Externalizable继承了Serializable接口，同时增添了两个方法：writeExternal()和readExternal()。
 * 这两个方法会在序列化和反序列化时被调用，以便执行一些特殊操作。
 * 调用Externalizable的readExternal()时，会调用默认构造器
 * @author mohan
 *
 */

class Blip1 implements Externalizable{
	public Blip1(){
		System.out.println("Blip1.constructor");
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip1.writeExternal");
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("Blip1.readExternal");
	}
}

class Blip2 implements Externalizable{
	Blip2(){
		System.out.println("Blip2.constructor");
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("Blip2.writeExternal");
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("Blip2.readExternal");
	}
}

public class Blips {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("Constructing objects...");
		Blip1 b1=new Blip1();
		Blip2 b2=new Blip2();
		ObjectOutputStream o=new ObjectOutputStream(
				new FileOutputStream("blips.out"));
		System.out.println("Saving objects...");
		o.writeObject(b1);
		o.writeObject(b2);
		o.close();
		ObjectInputStream i=new ObjectInputStream(
				new FileInputStream("blips.out"));
		System.out.println("Recovering objects...");
		b1=(Blip1)i.readObject();
//		Blip2的构造器不是公共的，会在恢复出现异常
//		b2=(Blip2)i.readObject();
	}
}
