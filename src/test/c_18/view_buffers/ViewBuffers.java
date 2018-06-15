package test.c_18.view_buffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * ͨ����ͬ��ͼ��ȡͬһ������
 * ����������ռ�õ��ֽ�����ͬ->��ʾ����������������ͬ
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
		
//		һ��Charռ2���ֽڣ�����һ��ֻ��4��Char
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

//		һ��Intռ4���ֽڣ�����ֻ��2��Int
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

//		һ��Longռ8���ֽڣ�����ֻ��һ��Long
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
