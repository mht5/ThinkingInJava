package test.c_18.using_random_access_file;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RandomAccessFile(������InputStream��OutputStream��ϵ��ʵ����DataInput��DataoOutput)
 * ����ʹ��seek()�������ļ����ƶ������޸��ļ���ĳ��ֵ
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
//		��Ϊÿ��Doubleռ8λ������ʹ��seek�ҵ���6��Double���޸���ֵ
		rf.seek(5*8);
		rf.writeDouble(47.0001);
		rf.close();
		display();
	}
}
