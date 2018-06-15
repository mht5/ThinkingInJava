package test.c_18.get_channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 旧io中的FileInputStream, FileOutputStream和RandomAccessFile三个类被修改了，用以生成FileChannel(通道)
 * 可以向通道传送用于读写的ByteBuffer，并且可以锁定文件中的某些区域用于独占式访问
 * ByteBuffer是唯一与通道交互的缓冲器
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
//		必须显式分配ByteBuffer的大小
		ByteBuffer buff=ByteBuffer.allocate(BSIZE);
//		一旦调用read()来告诉FileChannel向ByteBuffer存储字节，就必须调用ByteBuffer的flip()，让它做好让别人读取字节的准备
		fc.read(buff);
		buff.flip();
//		一个字节一个字节地读取
		while(buff.hasRemaining()){
			System.out.print((char)buff.get());
		}
	}
}
