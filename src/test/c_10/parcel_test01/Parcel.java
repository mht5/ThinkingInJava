package test.c_10.parcel_test01;

public class Parcel {
	class Contents{
		private int i=11;
		
		public int value(){
			return i;
		}
	}
	
	class Destination{
		private String label;
		
		public Destination(String dest){
			this.label=dest;
		}
		
		public String readLabel(){
			return label;
		}
	}
	
	public static void ship(String dest, Parcel p){
		Contents c=p.new Contents();
		System.out.println(c.value());
		Destination d=p.new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args){
		ship("Smoky sea",new Parcel());
	}
}
