package test.c_18.file_locking;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * �ļ�����
 * ͨ����FileChannelʹ��tryLock()��lock()���Ϳ��Ի�������ļ���FileLock
 * tryLock()�Ƿ�����ʽ�ģ������跨��ȡ��������������ܻ�ã�������һЩ�����Ѿ�������ͬ���������Ҳ�����ʱ��������ֱ�Ӵӷ������÷���
 * lock()������ʽ�ģ���Ҫ��������ֱ�������Ի�� | ����lock()���߳��ж� | ����lock()��ͨ���ر�
 * @author mohan
 *
 */
public class FileLocking {
	public static void main(String[] args) throws Exception{
		FileOutputStream out=new FileOutputStream("file.txt");
		FileLock fl=out.getChannel().tryLock();
		if(fl!=null){
			System.out.println("File locked.");
			TimeUnit.MILLISECONDS.sleep(1000);
			fl.release();
			System.out.println("Lock released");
		}
		out.close();
	}
}
