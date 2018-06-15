package test.c_18.storing_and_recovering_data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 存储和恢复数据
 * @author mohan
 *
 */
public class StoringAndRecoveringData {
	public static void main(String[] args) throws IOException{
		DataOutputStream out=new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("storing.txt")));
		out.writeDouble(3.1415926);
		out.writeUTF("That was Pi");
		out.writeChar('x');
		out.writeDouble(1.41413);
		out.writeUTF("That was square root for 2");
		out.close();
		
		DataInputStream in=new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("storing.txt")));
		System.out.println(in.readDouble());
//		只有readUTF()能恢复Java-UTF的值
		System.out.println(in.readUTF());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();
	}
}
