package test.c_08.private_override;

/**
 * private����Ĭ����final�ģ����ҶԵ����������εġ�
 * Derived���е�f()��һ��ȫ�µķ����������f()��Derived���ǲ��ɼ��ģ����Բ�������
 * @author mohan
 *
 */
public class PrivateOverride {
	private void f(){
		System.out.println("private f()");
	}
	
	public static void main(String[] args){
		PrivateOverride po=new Derived();
		po.f();
	}
}
