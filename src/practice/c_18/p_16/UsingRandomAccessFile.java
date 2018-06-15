package practice.c_18.p_16;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RandomAccessFile(������InputStream��OutputStream��ϵ��ʵ����DataInput��DataoOutput)
 * ����ʹ��seek()�������ļ����ƶ������޸��ļ���ĳ��ֵ
 * ��дUsingRandomAccessFile����֤������׼���洢�Ͷ�ȡ�������͵�ֵ
 * @author mohan
 *
 */
public class UsingRandomAccessFile {
	private static String file="uraf.dat";
	
	static void display() throws IOException{
		RandomAccessFile rf=new RandomAccessFile(file, "r");
		System.out.println(rf.read());
		System.out.println(rf.readBoolean());
		System.out.println(rf.readByte());
		System.out.println(rf.readChar());
		System.out.println(rf.readDouble());
		System.out.println(rf.readFloat());
		System.out.println(rf.readInt());
		System.out.println(rf.readLong());
		System.out.println(rf.readShort());
		System.out.println(rf.readUTF());
		rf.close();
	}
	
	public static void main(String[] args) throws IOException{
		RandomAccessFile rf=new RandomAccessFile(file, "rw");
		rf.write(13);
		rf.writeBoolean(true);
		rf.writeByte(123);
		rf.writeChar('x');
		rf.writeDouble(3.1415926);
		rf.writeFloat(2.14f);
		rf.writeInt(23);
		rf.writeLong(100000000l);
		rf.writeShort(11);
		rf.writeUTF("This is the end of this file.");
		rf.close();
		display();
	}
}
