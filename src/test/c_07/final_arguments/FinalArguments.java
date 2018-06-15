package test.c_07.final_arguments;

/**
 * �޷��ڷ����и���final����
 * @author mohan
 *
 */

class Gizmo{
	
}

public class FinalArguments {
	void with(final Gizmo g){
		System.out.println("with final.");
//		g=new Gizmo();
	}
	
	void without(Gizmo g){
		System.out.println("without final.");
		g=new Gizmo();
	}
	
	public static void main(String[] args){
		FinalArguments fa=new FinalArguments();
		Gizmo g=new Gizmo();
		fa.with(g);
		fa.without(g);
	}
}
