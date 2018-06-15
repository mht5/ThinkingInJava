package practice.c_18.p_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 将ByteBuffer.allocate()改为ByteBuffer.allocateDirect()，用以证实性能的差异，但是要注意启动时间是否发生明显改变
 * ByteBuffer.allocate()产生的内存开销是在JVM中，ByteBuffer.allocateDirect()的内存开销在JVM之外，也就是系统内存分配。
 * 当Java程序接收到外部传来的数据时，首先被系统内存所存取，然后由系统内存复制拷贝到JVM中供Java程序使用，所以第二种方法可以省去复制这一步操作，效率上会有所提高
 * 但是系统级内存的分配比JVM内存分配耗时要多，所以ByteBuffer.allocateDirect()并不是任何时候都是效率最高的
 * @author mohan
 *
 */
public class ChannelCopy {
	private static final int BSIZE=1024;
	
	public static void test1(String[] args) throws IOException{
		long t1=System.currentTimeMillis();
		FileChannel in=new FileInputStream(args[0]).getChannel(),
				  out=new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(BSIZE);
		System.out.println("test1.init: "+(System.currentTimeMillis()-t1));
		//返回值为-1时说明已到文件末尾
		while(in.read(buffer)!=-1){
			buffer.flip();			//准备缓冲器一边它的信息可以由write()提取
			out.write(buffer);
			buffer.clear();		//write()之后信息仍然在缓冲器中，clear()对所有内部指针进行重排，一边缓冲器在另一个read()操作期间能够做好接收数据的准备
		}
		in.close();
		System.out.println("test1.process: "+(System.currentTimeMillis()-t1));
	}
	
	public static void test2(String[] args) throws IOException{
		long t1=System.currentTimeMillis();
		FileChannel in=new FileInputStream(args[0]).getChannel(),
				  out=new FileOutputStream(args[1]).getChannel();
//		使用ByteBuffer.allocateDirect()
		ByteBuffer buffer=ByteBuffer.allocateDirect(BSIZE);
		System.out.println("test2.init: "+(System.currentTimeMillis()-t1));
		while(in.read(buffer)!=-1){
			buffer.flip();		
			out.write(buffer);
			buffer.clear();	
		}
		in.close();
		System.out.println("test2.process: "+(System.currentTimeMillis()-t1));
	}
	
	public static void main(String[] args) throws Exception{
		args=new String[]{"data.dat","dataCopy.dat"};
		if(args.length!=2){
			System.out.println("arguments: sourcefile  destfile");
			System.exit(1);
		}
		test1(args);
		test2(args);
	}
}
