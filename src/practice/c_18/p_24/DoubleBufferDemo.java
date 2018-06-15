package practice.c_18.p_24;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

/**
 * ʹ��DoubleBuffer��ȡ����
 * @author mohan
 *
 */
public class DoubleBufferDemo {
	public static void main(String[] args){
		ByteBuffer bb=ByteBuffer.allocate(1024);
		DoubleBuffer buffer=bb.asDoubleBuffer();
		buffer.put(new double[]{1,4,9,16,25,36,49,64,91,100});
		System.out.println(buffer.get(2));
//		�����Ϊ'2'��ֵ��Ϊ'23'
		buffer.put(2,23);
		buffer.flip();
		while(buffer.hasRemaining()){
			System.out.print(buffer.get()+" ");
		}
	}
}
