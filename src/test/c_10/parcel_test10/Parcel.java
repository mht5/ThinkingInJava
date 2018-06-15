package test.c_10.parcel_test10;

import test.c_10.parcel_test04.Destination;

/**
 * ��ʵ����ʼ���������ڲ���
 * @author mohan
 *
 */
public class Parcel {
	//���������ڲ���ʱ��ʼ���ֶΣ����������ڲ�ʹ�õĲ���Ҫ��final
	public Destination destination(final String s, final float c){
		return new Destination(){
			private String label=s;
			private int cost;
			
			{
				this.cost=Math.round(c);
				if(cost>100){
					System.out.println("Over budget!");
				}
			}
			
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea",12.26f).readLabel());
	}
}
