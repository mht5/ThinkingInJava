package test.c_18.using_buffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * 使用ByteBuffer调换相邻字符的位置(必须为偶数个？)
 * @author mohan
 *
 */
public class UsingBuffers {
	private static void symmetricScramble(CharBuffer buffer){
		while(buffer.hasRemaining()){
			buffer.mark();
			char c1=buffer.get();
			char c2 = buffer.get();
//			reset到mark()的位置
			buffer.reset();
			buffer.put(c2).put(c1);
		}
	}
	
	public static void main(String[] args){
		char[] data="UsingBuffers".toCharArray();
		ByteBuffer bb=ByteBuffer.allocate(data.length*2);
		CharBuffer cb=bb.asCharBuffer();
		cb.put(data);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
		symmetricScramble(cb);
		System.out.println(cb.rewind());
	}
}
