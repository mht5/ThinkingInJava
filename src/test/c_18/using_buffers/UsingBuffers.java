package test.c_18.using_buffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * ʹ��ByteBuffer���������ַ���λ��(����Ϊż������)
 * @author mohan
 *
 */
public class UsingBuffers {
	private static void symmetricScramble(CharBuffer buffer){
		while(buffer.hasRemaining()){
			buffer.mark();
			char c1=buffer.get();
			char c2 = buffer.get();
//			reset��mark()��λ��
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
