package test.c_18.channel_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 使用通道复制文件
 * 一旦调用read()来告诉FileChannel向ByteBuffer存储字节，就必须调用ByteBuffer的flip()，让它做好让别人读取字节的准备
 * 如果要使用缓冲器执行进一步的read()，需要先调用clear()来为read()做好准备
 * @author mohan
 *
 */
public class ChannelCopy {
	private static final int BSIZE=1024;
	
	public static void main(String[] args) throws Exception{
		args=new String[]{"data.dat","dataCopy.dat"};
		if(args.length!=2){
			System.out.println("arguments: sourcefile  destfile");
			System.exit(1);
		}
		FileChannel in=new FileInputStream(args[0]).getChannel(),
						  out=new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(BSIZE);
//		返回值为-1时说明已到文件末尾
		while(in.read(buffer)!=-1){
			buffer.flip();			//准备缓冲器一边它的信息可以由write()提取
			out.write(buffer);
			buffer.clear();		//write()之后信息仍然在缓冲器中，clear()对所有内部指针进行重排，一边缓冲器在另一个read()操作期间能够做好接收数据的准备
		}
		System.out.println(BufferedInputFile.read(args[1]));
	}
}
