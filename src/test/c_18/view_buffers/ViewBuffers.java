package test.c_18.view_buffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * 通过不同视图读取同一组数据
 * 各基本类型占用的字节数不同->显示出来的数据数量不同
 * @author mohan
 *
 */
public class ViewBuffers {
	public static void main(String[] args){
		ByteBuffer bb=ByteBuffer.wrap(new byte[]{0,0,0,0,0,0,0,'a'});
		bb.rewind();
		System.out.print("Byte buffer: ");
		while(bb.hasRemaining()){
			System.out.print(bb.position()+"->"+bb.get()+", ");
		}
		System.out.println();
		
//		一个Char占2个字节，所以一共只有4个Char
		CharBuffer cb=((ByteBuffer)bb.rewind()).asCharBuffer();
		System.out.print("Char buffer:");
		while(cb.hasRemaining()){
			System.out.print(cb.position()+"->"+cb.get()+", ");
		}
		System.out.println();

		ShortBuffer sb=((ByteBuffer)bb.rewind()).asShortBuffer();
		System.out.print("Short buffer:");
		while(sb.hasRemaining()){
			System.out.print(sb.position()+"->"+sb.get()+", ");
		}
		System.out.println();

//		一个Int占4个字节，所以只有2个Int
		IntBuffer ib=((ByteBuffer)bb.rewind()).asIntBuffer();
		System.out.print("Int buffer:");
		while(ib.hasRemaining()){
			System.out.print(ib.position()+"->"+ib.get()+", ");
		}
		System.out.println();

		FloatBuffer fb=((ByteBuffer)bb.rewind()).asFloatBuffer();
		System.out.print("Float buffer:");
		while(fb.hasRemaining()){
			System.out.print(fb.position()+"->"+fb.get()+", ");
		}
		System.out.println();

//		一个Long占8个字节，所以只有一个Long
		LongBuffer lb=((ByteBuffer)bb.rewind()).asLongBuffer();
		System.out.print("Long buffer:");
		while(lb.hasRemaining()){
			System.out.print(lb.position()+"->"+lb.get()+", ");
		}
		System.out.println();

		DoubleBuffer db=((ByteBuffer)bb.rewind()).asDoubleBuffer();
		System.out.print("Double buffer:");
		while(db.hasRemaining()){
			System.out.print(db.position()+"->"+db.get()+", ");
		}
		System.out.println();
	}
}
