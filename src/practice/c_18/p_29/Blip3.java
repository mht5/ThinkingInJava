package practice.c_18.p_29;

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
 * 需要在writeExternal()中讲来自对象的重要信息写入，还必须在readExternal()中恢复数据
 * 调用Externalizable的readExternal()时，会调用默认构造器
 * 此例中默认构造器并没有初始化变量，如果不在readExternal()中初始化的话，得到的将是默认值
 * @author mohan
 *
 */

public class Blip3 implements Externalizable{
	private int i;
	private String s;
	
	public Blip3(){
		System.out.println("Blip3 constructor");
	}
	
	public Blip3(String x, int a){
		System.out.println("Blip3("+x+", "+a+")");
		this.s=x;
		this.i=a;
	}
	
	public String toString(){
		return s+i;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException{
		System.out.println("Blip3.writeExternal()");
		/*out.writeObject(s);
		out.writeObject(i);*/
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		System.out.println("Blip3.readExternal()");
		/*s=(String)in.readObject();
		i=(Integer) in.readObject();*/
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		System.out.println("Constructing objects...");
		Blip3 b3=new Blip3("a string", 47);
		System.out.println(b3);
		ObjectOutputStream out=new ObjectOutputStream(
				new FileOutputStream("Blip3.out"));
		System.out.println("Saving objects...");
		out.writeObject(b3);
		out.close();
		ObjectInputStream in=new ObjectInputStream(
				new FileInputStream("Blip3.out"));
		System.out.println("Recovering objects...");
		b3=(Blip3)in.readObject();
		System.out.println(b3);
	}
}
