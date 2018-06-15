package test.c_05.var_arg_type;

/**
 * �ɱ�����б��Զ��Ѳ���ת��������
 * @author MOHAN
 *
 */
public class VarArgType {
	static void f(Character... args){
		System.out.print(args.getClass()+"  "+args.length+"\n");
	}
	
	static void g(int... args){
		System.out.print(args.getClass()+"  "+args.length+"\n");
	}
	
	public static void main(String[] args){
		f('x');
		f('x','y','z');
		f();
		g(1);
		g(1,2,3);
		g();
	}
}
