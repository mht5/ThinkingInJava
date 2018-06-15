package test.c_07.cad_system;

public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines=new Line[3];
	
	public CADSystem(int i){
		super(i);
		c=new Circle(1);
		t=new Triangle(2);
		for(int n=0;n<lines.length;n++){
			lines[n]=new Line(n,n*2);
		}
		System.out.println("Combined constructor.");
	}
	
	public void dispose(){
		System.out.println("CADSystem.dispose()");
		for(int i=lines.length-1;i>=0;i--){
			lines[i].dispose();
		}
		t.dispose();
		c.dispose();
		super.dispose();
	}
	
	public static void main(String[] args){
		CADSystem x=new CADSystem(1);
		try{
			System.out.println("hahaha");
		}
		finally{
			x.dispose();
		}
	}
}
