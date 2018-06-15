package test.c_18.file_locking;

import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * 文件加锁
 * 通过对FileChannel使用tryLock()或lock()，就可以获得整个文件的FileLock
 * tryLock()是非阻塞式的，它会设法获取锁，但是如果不能获得（当其它一些进程已经持有相同的锁，并且不共享时），它将直接从方法调用返回
 * lock()是阻塞式的，它要阻塞进程直至锁可以获得 | 调用lock()的线程中断 | 调用lock()的通道关闭
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
