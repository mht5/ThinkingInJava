package test.c_18.memory_input_formatted;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 可以使用DataInputStream读取格式化数据，它是一个面向字节的I/O类，因此必须使用InputStream类而不是Reader类
 * 可以用DataInputStream类以字节形式读取任何数据(例如一个文件)，这里我们用来读取字符串
 * @author mohan
 *
 */
public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException{
		try{
//			需要将BufferedInputFile读取的内容转换为ByteArrayInputStream，然后才能传递给DataInputStream
			DataInputStream in=new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read(
									"do not go gentle into that good night.txt").getBytes()));
			while(true){
				System.out.print((char)in.readByte());
			}
		}catch(EOFException e){
			System.err.println("End of stream");
		}
	}
}
