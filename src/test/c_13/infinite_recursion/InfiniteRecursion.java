package test.c_13.infinite_recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * ���޵ݹ�
 * @author mohan
 *
 */
public class InfiniteRecursion {
	public String toString(){
//		���ڼӺź������������ͼ��thisת��ΪString���ͣ�Ҫת��ΪString���;��ǵ���toString()���Ӷ�������ѭ��������ʹ��super.toString()���޸������practice.c_13.p_02
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
