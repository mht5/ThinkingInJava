package test.c_18.change_system_out;

import java.io.PrintWriter;

/**
 * 将System.out转换为PrintWriter
 * System.out是一个PrintStream，PrintStream是一个OutputStream，PrintWriter有接受OutputStream的构造器
 * @author mohan
 *
 */
public class ChangeSystemOut {
	public static void main(String[] args){
//		boolean参数为是否自动清空，不设置或设置为false可能导致无法看到输出
		PrintWriter out=new PrintWriter(System.out, true);
		out.println("Hello, world!");
	}
}
