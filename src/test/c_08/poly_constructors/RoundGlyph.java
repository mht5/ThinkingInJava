package test.c_08.poly_constructors;

public class RoundGlyph extends Glyph{
	private int radius=1;
	
	public RoundGlyph(int r){
		radius=r;
		System.out.println("RoundGlyph.RoundGlyph(), radius="+radius);
	}
	
	public void test(){
		//�ڻ����е��ô˷�������ʱradius��δ����ʼ��
		System.out.println("RoundGlyph.draw(), radius="+radius);
	}
}
