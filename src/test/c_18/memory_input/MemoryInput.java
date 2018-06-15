package test.c_18.memory_input;

import java.io.IOException;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * ¥”ƒ⁄¥Ê ‰»Î
 * @author mohan
 *
 */
public class MemoryInput {
	public static void main(String[] args) throws IOException{
		StringReader in=new StringReader(BufferedInputFile.read("do not go gentle into that good night.txt"));
		int c;
		while((c=in.read())!=-1){
			System.out.print((char)c);
		}
	}
}
