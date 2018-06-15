package test.c_18.serial_ctrl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * transient申明的变量必须在程序中明确保存或恢复
 * @author mohan
 *
 */
public class SerialCtrl implements Serializable{
	private String a;
	private transient String b;
	
	public SerialCtrl(String aa, String bb){
		this.a="Not transient: "+aa;
		this.b="Transient: "+bb;
	}
	
	public String toString(){
		return a+"\n"+b;
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException{
//		使用默认机制写入对象的非transient部分
		stream.defaultWriteObject();
//		transient申明的变量必须在程序中明确保存或恢复
		stream.writeObject(b);
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
//		使用默认机制写入对象的非transient部分，必须调用defaultWriteObject()作为writeObject()的第一个操作
		stream.defaultReadObject();
//		transient申明的变量必须在程序中明确保存或恢复
		b=(String)stream.readObject();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		SerialCtrl sc=new SerialCtrl("test1", "test2");
		System.out.println("Before:\n"+sc);
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(bout);
//		序列化
		out.writeObject(sc);
		
		ObjectInputStream in=new ObjectInputStream(
				new ByteArrayInputStream(bout.toByteArray()));
		SerialCtrl sc1=(SerialCtrl)in.readObject();
		System.out.println("After:\n"+sc1);
	}
}
