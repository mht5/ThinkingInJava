package test.c_18.buffer_to_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * ��ByteBuffer�����Ǿ���asCharBuffer()������CharBuffer()
 * asCharBuffer()�޷�ֱ�Ӷ�ȡByteBuffer������(��Ҫʹ����Ӧ�ı�����н��� | ʹ��CharBuffer�ķ�������д����)
 * @author mohan
 *
 */
public class BufferToText {
private static final int BSIZE=1024;
	
	public static void main(String[] args) throws Exception{
		FileChannel fc=new FileOutputStream("data.dat").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		fc=new RandomAccessFile("data.dat","rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap(", and some more.".getBytes()));
		fc.close();
		fc=new FileInputStream("data.dat").getChannel();
//		������ʽ����ByteBuffer�Ĵ�С
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
//		һ������read()������FileChannel��ByteBuffer�洢�ֽڣ��ͱ������ByteBuffer��flip()�����������ñ��˶�ȡ�ֽڵ�׼��
		fc.read(buff);
		buff.flip();
//		�޷���ȷ����
		System.out.println(buff.asCharBuffer());
		System.out.println("********************************");
		
//		ʹ��ϵͳĬ���ַ�������
		buff.rewind();
		String encoding=System.getProperty("file.encoding");
		System.out.println("Decoded using "+encoding+": "+Charset.forName(encoding).decode(buff));
		fc=new FileOutputStream("dataCopy.dat").getChannel();
//		����һЩ�ܴ�ӡ����Ϣ
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
//		�ٴζ�ȡ
		fc=new FileInputStream("dataCopy.dat").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		System.out.println("********************************");
		
//		ʹ��CharBuffer��д
		fc=new FileOutputStream("dataCopy.dat").getChannel();
//		һ���ַ���Ҫ�����ֽڣ�����һ���Ÿ��ַ������µĿ��ֽڻ���ʾ��'��'
		buff=ByteBuffer.allocate(24);
		buff.asCharBuffer().put("Some text");
		fc.write(buff);
		fc.close();
		fc=new FileInputStream("dataCopy.dat").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}
}
