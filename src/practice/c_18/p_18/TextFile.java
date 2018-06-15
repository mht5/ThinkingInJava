package practice.c_18.p_18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import test.c_18.buffered_input_file.BufferedInputFile;

public class TextFile extends ArrayList<String>{
	public static String read(String filename) throws IOException{
		StringBuilder sb=new StringBuilder();
		BufferedReader in=new BufferedReader(
				new FileReader(
						new File(filename).getAbsoluteFile()));
		try{
			String s;
			while((s=in.readLine())!=null){
				sb.append(s);
				sb.append("\n");
			}
		}finally{
			in.close();
		}
		return sb.toString();
	}
	
	public static void write(String filename, String text) throws IOException{
		PrintWriter out=new PrintWriter(
				new File(filename).getAbsoluteFile());
		try{
			out.print(text);
		}finally{
			out.close();
		}
	}
	
	public TextFile(String filename, String splitter) throws IOException{
		super(Arrays.asList(read(filename).split(splitter)));
	}
	
	public TextFile(String filename) throws IOException{
		this(filename, "\n");
	}
	
	public void write(String filename) throws IOException{
		PrintWriter out=new PrintWriter(
				new File(filename).getAbsoluteFile());
		try{
			for(String item : this){
				out.println(item);
			}
		}finally{
			out.close();
		}
	}
	
	public static void main(String[] args) throws IOException{
		String file=read("题都城南庄.txt");
		write("TextFile.dat", file);
		TextFile text=new TextFile("TextFile.dat");
		text.write("TextFile1.dat");
		System.out.println(BufferedInputFile.read("TextFile.dat"));
		System.out.println(BufferedInputFile.read("TextFile1.dat"));
//		TreeSet会自动排序
		TreeSet<String> words=new TreeSet<String>(
				new TextFile("do not go gentle into that good night.txt", "\\W+"));
//		TreeSet.headSet(int)返回此Set中小于参数的部分
//		TreeSet.headSet(int, boolean)如果boolean值为true则返回不大于int的部分
		System.out.println(words.headSet("d"));
		
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set.headSet(4));
	}
}
