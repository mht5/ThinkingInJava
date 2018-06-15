package test.c_10.parcel_test04;

public class Tester {
	public static void main(String[] args){
		Parcel p=new Parcel();
		Contents c=p.contents();
		Destination d=p.destination("Smoky sea");
	}
}
