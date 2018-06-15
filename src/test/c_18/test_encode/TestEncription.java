package test.c_18.test_encode;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TestEncription {
	public static ByteBuffer encode(String s){
		ByteBuffer bb=ByteBuffer.wrap(new byte[s.length()*2]);
		bb.asCharBuffer().put(s);
		System.out.println("*****************************");
		System.out.println("Before encription: ");
		System.out.println("*****************************");
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		System.out.println();
		
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		System.out.println("*****************************");
		System.out.println("After encription: ");
		System.out.println("*****************************");
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		System.out.println();
		return bb;
	}
	
	public static String decode(ByteBuffer bb){
		bb.rewind();
		System.out.println("*****************************");
		System.out.println("Before dncription: ");
		System.out.println("*****************************");
		while(bb.hasRemaining()){
			System.out.print(bb.getChar());
		}
		System.out.println();
		
		StringBuilder sb=new StringBuilder();
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		while(bb.hasRemaining()){
			sb.append(bb.getChar());
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
//		System.out.println(decode(encode("Hey, what's going on?")));
		String s=decode(encode(
				"Hey, what's going on?\n1234567\n≤‚ ‘≤‚ ‘"));
		System.out.println("*****************************");
		System.out.println("After decription: ");
		System.out.println("*****************************");
		System.out.println(s);
	}
}
