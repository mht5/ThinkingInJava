package test.c_10.parcel_test07;

import test.c_10.parcel_test04.Destination;

/**
 * �����ڲ��ࣺû�й�����
 * @author mohan
 *
 */
public class Parcel {
	//����һ���̳���Destination�����������
	public Destination destination(String s){
		return new Destination(){
			private String label;
			
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea").readLabel());
	}
}
