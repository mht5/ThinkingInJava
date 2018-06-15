package practice.c_18.p_15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ´æ´¢ºÍ»Ö¸´Êý¾Ý
 * @author mohan
 *
 */
public class StoringAndRecoveringData {
	public static void main(String[] args) throws IOException{
		DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("storing.txt")));
		out.write(1);
		out.writeBoolean(true);
		out.writeByte(123);
		out.writeChar('x');
		out.writeDouble(3.1415926);
		out.writeFloat(2.14f);
		out.writeInt(13);
		out.writeLong(20150608);
		out.writeShort(23);
		out.writeUTF("That was a test for DataInputStrea.write()");
		out.close();
		
		DataInputStream in=new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("storing.txt")));
		System.out.println(in.read());
		System.out.println(in.readBoolean());
		System.out.println(in.readByte());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		System.out.println(in.readFloat());
		System.out.println(in.readInt());
		System.out.println(in.readLong());
		System.out.println(in.readShort());
		System.out.println(in.readUTF());
		in.close();
	}
}
