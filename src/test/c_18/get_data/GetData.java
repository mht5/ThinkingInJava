package test.c_18.get_data;

import java.nio.ByteBuffer;

/**
 * 使用ByteBuffer获取基本类型数据
 * @author mohan
 *
 */
public class GetData {
	public static void main(String[] args){
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		int i=0;
		while(i++ <buffer.limit()){
			if(buffer.get()!=0){
				System.out.print("noZero");
			}
		}
		System.out.println("i="+i);
		buffer.rewind();
		
		buffer.asCharBuffer().put("Howdy!");
		char c;
		while((c=buffer.getChar())!=0){
			System.out.print(c+" ");
		}
		System.out.println();
		buffer.rewind();
		
		buffer.asShortBuffer().put((short)12345);
		System.out.println(buffer.getShort());
		buffer.rewind();
		
		buffer.asIntBuffer().put(1234567);
		System.out.println(buffer.getInt());
		buffer.rewind();
		
		buffer.asLongBuffer().put(12345678l);
		System.out.println(buffer.getLong());
		buffer.rewind();
		
		buffer.asFloatBuffer().put(10.24f);
		System.out.println(buffer.getFloat());
		buffer.rewind();
		
		buffer.asDoubleBuffer().put(1024.4201d);
		System.out.println(buffer.getDouble());
	}
}
