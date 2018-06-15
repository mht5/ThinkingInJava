package test.c_18.serial_ctrl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * transient�����ı��������ڳ�������ȷ�����ָ�
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
//		ʹ��Ĭ�ϻ���д�����ķ�transient����
		stream.defaultWriteObject();
//		transient�����ı��������ڳ�������ȷ�����ָ�
		stream.writeObject(b);
	}
	
	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
//		ʹ��Ĭ�ϻ���д�����ķ�transient���֣��������defaultWriteObject()��ΪwriteObject()�ĵ�һ������
		stream.defaultReadObject();
//		transient�����ı��������ڳ�������ȷ�����ָ�
		b=(String)stream.readObject();
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		SerialCtrl sc=new SerialCtrl("test1", "test2");
		System.out.println("Before:\n"+sc);
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream out=new ObjectOutputStream(bout);
//		���л�
		out.writeObject(sc);
		
		ObjectInputStream in=new ObjectInputStream(
				new ByteArrayInputStream(bout.toByteArray()));
		SerialCtrl sc1=(SerialCtrl)in.readObject();
		System.out.println("After:\n"+sc1);
	}
}
