package test.c_13.using_string_builder;

import java.util.Random;

public class UsingStringBuilder {
	public static Random rand=new Random(47);
	
	public String toString(){
		StringBuilder s=new StringBuilder("[");
		for(int i=0;i<6;i++){
			s.append(rand.nextInt(20));
		}
		s.delete(2,5);
		s.append("]");
		return s.toString();
	}
	
	public static void main(String[] args){
		UsingStringBuilder usb=new UsingStringBuilder();
		System.out.println(usb);
	}
}
