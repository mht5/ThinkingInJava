package test.c_18.endians;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * 当数据所占字节数大于1时，需要考虑字节的顺序
 * ByteBuffer默认是按高位优先的形式存储数据的
 * @author mohan
 *
 */
public class Endians {
	public static void main(String[] args){
		ByteBuffer bb=ByteBuffer.wrap(new byte[12]);
		bb.asCharBuffer().put("abcdef");
		System.out.println(Arrays.toString(bb.array()));
		IntBuffer ib=bb.asIntBuffer();
		while(ib.hasRemaining()){
			System.out.print(ib.get()+" ");
		}
		System.out.println();
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		System.out.println();
		bb.rewind();
		
		bb.asCharBuffer().put("abcdef");
		bb.order(ByteOrder.BIG_ENDIAN);
		System.out.println(Arrays.toString(bb.array()));
		ib=bb.asIntBuffer();
		while(ib.hasRemaining()){
			System.out.print(ib.get()+" ");
		}
		System.out.println();
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		System.out.println();
		bb.rewind();
		
		bb.asCharBuffer().put("abcdef");
		bb.order(ByteOrder.LITTLE_ENDIAN);
		System.out.println(Arrays.toString(bb.array()));
		ib=bb.asIntBuffer();
		while(ib.hasRemaining()){
			System.out.print(ib.get()+" ");
		}
		System.out.println();
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		System.out.println();
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
	}
}
