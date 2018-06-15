package test.c_10.parcel_test04;

public class Parcel {
	private class PContents implements Contents{
		int i=13;
		
		public int value(){
			return i;
		}
	}
	
	protected class PDestination implements Destination{
		private String label;
		
		private PDestination(String whereTo){
			this.label=whereTo;
		}
		
		public String readLabel(){
			return label;
		}
	}
	
	public Contents contents(){
		return (new PContents());
	}
	
	public Destination destination(String s){
		return (new PDestination(s));
	}
}
