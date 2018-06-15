package practice.c_18.p_02;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
	private File path;
	
	public SortedDirList(){
		path=new File("C:\\mohan\\Code\\Java\\Thinking in Java\\src\\util");
	}
	
	public SortedDirList(File path){
		this.path=path;
	}
	
	public String[] list(){
		String[] list=path.list();
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
	
	public String[] list(final String fn_regex){
		String[] list=path.list(new FilenameFilter(){
			private Pattern pattern=Pattern.compile(fn_regex);
			public boolean accept(File dir, String name){
				return pattern.matcher(name).matches();
			}
		});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		return list;
	}
	
	public static void main(String[] args){
		SortedDirList dir=new SortedDirList();
//		获取后缀名为"java的文件"
		System.out.println(Arrays.asList(dir.list(".*\\.java")));
	}
}
