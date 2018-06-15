package test.c_18.using_random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile(不属于InputStream和OutputStream类系，实现了DataInput和DataoOutput)
 * 可以使用seek()方法在文件中移动，并修改文件中某个值
 * @author mohan
 *
 */
public class UsingRandomAccessFile {
	private static String file="uraf.dat";
	
	static void display() throws IOException{
		RandomAccessFile rf=new RandomAccessFile(file, "r");
		for(int i=0;i<7;i++){
			System.out.println("Value"+i+": "+rf.readDouble());
		}
		System.out.println(rf.readUTF());
		rf.close();
	}
	
	public static void main(String[] args) throws IOException{
		RandomAccessFile rf=new RandomAccessFile(file, "rw");
		for(int i=0;i<7;i++){
			rf.writeDouble(i*1.414);
		}
		rf.writeUTF("This is the end of this file.");
		rf.close();
		display();
		rf=new RandomAccessFile(file, "rw");
//		因为每个Double占8位，这里使用seek找到第6个Double并修改其值
		rf.seek(5*8);
		rf.writeDouble(47.0001);
		rf.close();
		display();
	}
}
