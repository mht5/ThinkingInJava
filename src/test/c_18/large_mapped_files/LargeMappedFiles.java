package test.c_18.large_mapped_files;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 内存映射文件允许我们创建和修改那些因为太大而不能放入内存的文件。有了内存映射文件，我们就可以假定整个文件都放在内存中，而且可以完全把它当作非常大的数组来访问
 * MappedByteBuffer是一种特殊的直接缓冲器。必须指定映射文件的初始位置和映射区域的长度，这意味着我们可以映射一个大文件的某个部分
 * 这个程序创建的文件为128M，这可能比操作系统允许一次载入内存的空间大。但似乎我们可以访问整个文件，因为很只有一部分文件放入了内存，文件的其他部分被交换了出去
 * @author mohan
 *
 */
public class LargeMappedFiles {
	private static int length=0x8FFFFFF;	//128M
	
	public static void main(String[] args) throws IOException{
		MappedByteBuffer out=new RandomAccessFile("data.dat","rw").getChannel()
				.map(FileChannel.MapMode.READ_WRITE, 0, length);
		for(int i=0;i<length;i++){
			out.put((byte)'x');
		}
		System.out.println("Finished writing");
		for(int i=length/2;i<length/2+6;i++){
			System.out.println((char)out.get(i));
		}
	}
}
