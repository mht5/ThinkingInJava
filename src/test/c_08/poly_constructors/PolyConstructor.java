package test.c_08.poly_constructors;

/**
 * 一个动态绑定的方法调用会向外深入到继承层次结构内部，它可以调用导出类里的方法
 * Glyph.draw()被RoundGlyph.draw()覆盖，这种覆盖实在RoundGlyph中发生的。但是在Glyph中调用这个方法，结果导致了对RoungGlyph.draw()的调用
 * @author mohan
 *
 */
public class PolyConstructor {
	public static void main(String[] args){
		new RoundGlyph(23);
	}
}
