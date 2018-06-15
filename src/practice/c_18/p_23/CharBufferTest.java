package practice.c_18.p_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CharBufferTest {
	public static void main(String[] args) throws IOException{
		FileChannel fc=new FileOutputStream("charBufferTest.dat").getChannel();
		ByteBuffer buff=ByteBuffer.allocate(124);
		buff.asCharBuffer().put("Hello, world!\nThis should be in the 2nd line.\nThat's it.");
		fc.write(buff);
		fc.close();
		fc=new FileInputStream("charBufferTest.dat").getChannel();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}
}
