package test.c_18.file_output_shortcut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 文本文件输出的快捷方式
 * Java SE5在PrintWriter中添加了一个辅助构造器，在每次希望创建文本并向其中写入时不必再执行所有的装饰工作
 * 要为out显示调用close()，如果不为所有输出文件调用close()，就会发现缓冲区内容不会被刷新清空，那么它们就会不完整
 * @author mohan
 *
 */
public class FileOutputShortcut {
	private static String file="FileOutputShortcut.txt";
	
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("题都城南庄.txt")));
//		这里是快捷方式
		PrintWriter out=new PrintWriter(file);
		int lineCount=1;
		String s;
		while((s=in.readLine())!=null){
			out.println(lineCount++ +": "+s);
		}
		in.close();
//		这句必须要加！！！
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
