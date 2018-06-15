package test.c_13.infinite_recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * 无限递归
 * @author mohan
 *
 */
public class InfiniteRecursion {
	public String toString(){
//		跟在加号后面编译器会试图将this转换为String类型，要转换为String类型就是调用toString()，从而产生死循环。可以使用super.toString()，修复结果见practice.c_13.p_02
		return "InfiniteRecursion address: "+this+"\n";
	}
	
	public static void main(String[] args){
		List<InfiniteRecursion> v=new ArrayList<InfiniteRecursion>();
		for(int i=0;i<6;i++){
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
}
