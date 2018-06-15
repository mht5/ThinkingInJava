package practice.c_18.p_03;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 计算当前目录下File的大小
 * @author mohan
 *
 */
public class DirSize {
	public static void main(final String[] args){
		File path=new File(".");
		String[] list;
		if(args.length==0){
			list=path.list();
		}
		else{
			list=path.list(new FilenameFilter(){
				private Pattern pattern=Pattern.compile(args[0]);
				public boolean accept(File dir, String name){
					return pattern.matcher(name).matches();
				}
			});
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		long total=0;
		long fs;
//		遍历取得当前目录下所有File的大小
		for(String dirItem : list){
			fs=new File(path, dirItem).length();
			System.out.println(dirItem+", "+fs+" byte(s)");
			total+=fs;
		}
		System.out.println("===================================");
		System.out.println(list.length+" file(s), "+total+" byte(s)");
	}
}
