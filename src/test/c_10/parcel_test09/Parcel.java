package test.c_10.parcel_test09;

import test.c_10.parcel_test04.Destination;

/**
 * �����ڲ���
 * @author mohan
 *
 */
public class Parcel {
	//���������ڲ���ʱ��ʼ���ֶΣ����������ڲ�ʹ�õĲ���Ҫ��final
	public Destination destination(final String s){
		return new Destination(){
			private String label=s;
			
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea").readLabel());
	}
}
