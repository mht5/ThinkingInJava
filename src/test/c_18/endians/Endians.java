package test.c_18.endians;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * ��������ռ�ֽ�������1ʱ����Ҫ�����ֽڵ�˳��
 * ByteBufferĬ���ǰ���λ���ȵ���ʽ�洢���ݵ�
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
