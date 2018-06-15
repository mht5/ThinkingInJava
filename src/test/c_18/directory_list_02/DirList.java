package test.c_18.directory_list_02;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 使用匿名内部类改写DirList
 * @author mohan
 *
 */
public class DirList {
//	参数必须为final的，不然无法使用
	public static FilenameFilter filter(final String regex){
		return new FilenameFilter(){
			private Pattern pattern=Pattern.compile(regex);
			public boolean accept(File dir, String name){
				return pattern.matcher(name).matches();
			}
		};
	}
	
	public static void main(String[] args){
		File path=new File(".");
		String[] list;
		if(args.length==0){
			list=path.list();
		}
		else{
			list=path.list(filter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list){
			System.out.println(dirItem);
		}
	}
}
