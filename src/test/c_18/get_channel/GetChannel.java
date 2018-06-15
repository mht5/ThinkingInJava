package test.c_18.get_channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ��io�е�FileInputStream, FileOutputStream��RandomAccessFile�����౻�޸��ˣ���������FileChannel(ͨ��)
 * ������ͨ���������ڶ�д��ByteBuffer�����ҿ��������ļ��е�ĳЩ�������ڶ�ռʽ����
 * ByteBuffer��Ψһ��ͨ�������Ļ�����
 * @author mohan
 *
 */
public class GetChannel {
	private static final int BSIZE=1024;
	
	public static void main(String[] args) throws Exception{
		FileChannel fc=new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc=new RandomAccessFile("data.txt","rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap(", and some more.".getBytes()));
		fc.close();
		fc=new FileInputStream("data.txt").getChannel();
//		������ʽ����ByteBuffer�Ĵ�С
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
//		һ������read()������FileChannel��ByteBuffer�洢�ֽڣ��ͱ������ByteBuffer��flip()�����������ñ��˶�ȡ�ֽڵ�׼��
		fc.read(buff);
		buff.flip();
//		һ���ֽ�һ���ֽڵض�ȡ
		while(buff.hasRemaining()){
			System.out.print((char)buff.get());
		}
	}
}
