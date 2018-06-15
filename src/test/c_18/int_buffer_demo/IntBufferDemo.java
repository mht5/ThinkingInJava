package test.c_18.int_buffer_demo;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * 使用IntBuffer读取数据
 * @author mohan
 *
 */
public class IntBufferDemo {
	public static void main(String[] args){
		ByteBuffer bb=ByteBuffer.allocate(1024);
		IntBuffer buffer=bb.asIntBuffer();
		buffer.put(new int[]{1,4,9,16,25,36,49,64,91,100});
		System.out.println(buffer.get(2));
//		将序号为'2'的值改为'23'
		buffer.put(2,23);
		buffer.flip();
		while(buffer.hasRemaining()){
			System.out.print(buffer.get()+" ");
		}
	}
}
