package test.c_10.parcel_test03;

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
			System.out.println("Sailing for "+dest);
			this.label=dest;
		}
		
		public String readLabel(){
			return label;
		}
	}
	
	public Contents contents(){
		return (new Contents());
	}
	
	public Destination to(String dest){
		return (new Destination(dest));
	}
	
	public static void ship(String dest,Parcel p){
		Contents c=p.new Contents();
		System.out.println(c.value());
		Destination d=p.new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args){
		Parcel p=new Parcel();
		ship("Smoky sea",p);
		Parcel.Contents c=p.contents();
		Parcel.Destination d=p.to("Dragonstone");
	}
}
