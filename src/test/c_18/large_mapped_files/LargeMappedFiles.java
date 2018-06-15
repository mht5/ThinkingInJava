package test.c_18.large_mapped_files;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * �ڴ�ӳ���ļ��������Ǵ������޸���Щ��Ϊ̫������ܷ����ڴ���ļ��������ڴ�ӳ���ļ������ǾͿ��Լٶ������ļ��������ڴ��У����ҿ�����ȫ���������ǳ��������������
 * MappedByteBuffer��һ�������ֱ�ӻ�����������ָ��ӳ���ļ��ĳ�ʼλ�ú�ӳ������ĳ��ȣ�����ζ�����ǿ���ӳ��һ�����ļ���ĳ������
 * ������򴴽����ļ�Ϊ128M������ܱȲ���ϵͳ����һ�������ڴ�Ŀռ�󡣵��ƺ����ǿ��Է��������ļ�����Ϊ��ֻ��һ�����ļ��������ڴ棬�ļ����������ֱ������˳�ȥ
 * @author mohan
 *
 */
public class LargeMappedFiles {
	private static int length=0x8FFFFFF;	//128M
	
	public static void main(String[] args) throws IOException{
		MappedByteBuffer out=new RandomAccessFile("data.dat","rw").getChannel()
				.map(FileChannel.MapMode.READ_WRITE, 0, length);
		for(int i=0;i<length;i++){
			out.put((byte)'x');
		}
		System.out.println("Finished writing");
		for(int i=length/2;i<length/2+6;i++){
			System.out.println((char)out.get(i));
		}
	}
}
