package test.c_08.poly_constructors;

public class RoundGlyph extends Glyph{
	private int radius=1;
	
	public RoundGlyph(int r){
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph(), radius="+radius);
	}
	
	public void test(){
		//在基类中调用此方法，此时radius还未被初始化
		System.out.println("RoundGlyph.draw(), radius="+radius);
	}
}
