package test.c_18.change_system_out;

import java.io.PrintWriter;

/**
 * ��System.outת��ΪPrintWriter
 * System.out��һ��PrintStream��PrintStream��һ��OutputStream��PrintWriter�н���OutputStream�Ĺ�����
 * @author mohan
 *
 */
public class ChangeSystemOut {
	public static void main(String[] args){
//		boolean����Ϊ�Ƿ��Զ���գ������û�����Ϊfalse���ܵ����޷��������
		PrintWriter out=new PrintWriter(System.out, true);
		out.println("Hello, world!");
	}
}
