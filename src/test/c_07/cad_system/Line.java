package test.c_07.cad_system;

public class Line extends Shape{
	int start,end;
	public Line(int start, int end){
		super(start);
		this.start=start;
		this.end=end;
		System.out.println("Drawing ling: "+start+" to "+end);
	}
	
	public void dispose(){
		System.out.println("Erasing line...");
		super.dispose();
	}
}
