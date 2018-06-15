package test.c_18.channel_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * ʹ��ͨ�������ļ�
 * һ������read()������FileChannel��ByteBuffer�洢�ֽڣ��ͱ������ByteBuffer��flip()�����������ñ��˶�ȡ�ֽڵ�׼��
 * ���Ҫʹ�û�����ִ�н�һ����read()����Ҫ�ȵ���clear()��Ϊread()����׼��
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
//		����ֵΪ-1ʱ˵���ѵ��ļ�ĩβ
		while(in.read(buffer)!=-1){
			buffer.flip();			//׼��������һ��������Ϣ������write()��ȡ
			out.write(buffer);
			buffer.clear();		//write()֮����Ϣ��Ȼ�ڻ������У�clear()�������ڲ�ָ��������ţ�һ�߻���������һ��read()�����ڼ��ܹ����ý������ݵ�׼��
		}
		System.out.println(BufferedInputFile.read(args[1]));
	}
}
