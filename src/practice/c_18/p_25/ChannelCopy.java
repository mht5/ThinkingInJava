package practice.c_18.p_25;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ��ByteBuffer.allocate()��ΪByteBuffer.allocateDirect()������֤ʵ���ܵĲ��죬����Ҫע������ʱ���Ƿ������Ըı�
 * ByteBuffer.allocate()�������ڴ濪������JVM�У�ByteBuffer.allocateDirect()���ڴ濪����JVM֮�⣬Ҳ����ϵͳ�ڴ���䡣
 * ��Java������յ��ⲿ����������ʱ�����ȱ�ϵͳ�ڴ�����ȡ��Ȼ����ϵͳ�ڴ渴�ƿ�����JVM�й�Java����ʹ�ã����Եڶ��ַ�������ʡȥ������һ��������Ч���ϻ��������
 * ����ϵͳ���ڴ�ķ����JVM�ڴ�����ʱҪ�࣬����ByteBuffer.allocateDirect()�������κ�ʱ����Ч����ߵ�
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
		//����ֵΪ-1ʱ˵���ѵ��ļ�ĩβ
		while(in.read(buffer)!=-1){
			buffer.flip();			//׼��������һ��������Ϣ������write()��ȡ
			out.write(buffer);
			buffer.clear();		//write()֮����Ϣ��Ȼ�ڻ������У�clear()�������ڲ�ָ��������ţ�һ�߻���������һ��read()�����ڼ��ܹ����ý������ݵ�׼��
		}
		in.close();
		System.out.println("test1.process: "+(System.currentTimeMillis()-t1));
	}
	
	public static void test2(String[] args) throws IOException{
		long t1=System.currentTimeMillis();
		FileChannel in=new FileInputStream(args[0]).getChannel(),
				  out=new FileOutputStream(args[1]).getChannel();
//		ʹ��ByteBuffer.allocateDirect()
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
