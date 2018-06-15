package test.c_18.test_eof;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 使用available()检查还有多少可供存取的字符
 * @author mohan
 *
 */
public class TestEOF {
	public static void main(String[] args) throws IOException{
		DataInputStream in=new DataInputStream(
				new ByteArrayInputStream(
						BufferedInputFile.read(
								"do not go gentle into that good night.txt").getBytes()));
		while(in.available()!=0){
			System.out.print((char)in.read());
		}
	}
}
