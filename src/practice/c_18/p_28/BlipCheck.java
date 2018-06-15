package practice.c_18.p_28;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import test.c_18.blips_01.Blips;

/**
 * Externalizable�̳���Serializable�ӿڣ�ͬʱ����������������writeExternal()��readExternal()��
 * �����������������л��ͷ����л�ʱ�����ã��Ա�ִ��һЩ���������
 * ����Externalizable��readExternal()ʱ�������Ĭ�Ϲ�����
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

public class BlipCheck implements Externalizable{
	/*BlipCheck(){
		System.out.println("Blip2.constructor");
	}*/

	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("BlipCheck.writeExternal");
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("BlipCheck.readExternal");
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Blips.main(args);
	}
}
