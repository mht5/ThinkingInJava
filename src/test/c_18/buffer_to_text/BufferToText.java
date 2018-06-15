package test.c_18.buffer_to_text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * 将ByteBuffer看做是具有asCharBuffer()方法的CharBuffer()
 * asCharBuffer()无法直接读取ByteBuffer的数据(需要使用相应的编码进行解码 | 使用CharBuffer的方法来读写数据)
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
//		必须显式分配ByteBuffer的大小
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
//		一旦调用read()来告诉FileChannel向ByteBuffer存储字节，就必须调用ByteBuffer的flip()，让它做好让别人读取字节的准备
		fc.read(buff);
		buff.flip();
//		无法正确解码
		System.out.println(buff.asCharBuffer());
		System.out.println("********************************");
		
//		使用系统默认字符集解码
		buff.rewind();
		String encoding=System.getProperty("file.encoding");
		System.out.println("Decoded using "+encoding+": "+Charset.forName(encoding).decode(buff));
		fc=new FileOutputStream("dataCopy.dat").getChannel();
//		加密一些能打印的信息
		fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
		fc.close();
//		再次读取
		fc=new FileInputStream("dataCopy.dat").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		System.out.println("********************************");
		
//		使用CharBuffer来写
		fc=new FileOutputStream("dataCopy.dat").getChannel();
//		一个字符需要两个字节，这里一共九个字符，余下的空字节会显示成'□'
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
