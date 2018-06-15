package test.c_10.parcel_test05;

import test.c_10.parcel_test04.Destination;

/**
 * �ֲ��ڲ��ࣺ�����ڷ����ڲ�����
 * @author mohan
 *
 */
public class Parcel {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			
			private PDestination(String whereTo){
				this.label=whereTo;
			}
			
			public String readLabel(){
				return label;
			}
		}
		return (new PDestination(s));
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().destination("Smoky sea").readLabel());
	}
}
