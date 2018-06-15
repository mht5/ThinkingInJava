package test.c_05.array_of_primitives;

public class ArrayOfPrimitives {
	public static void main(String[] args){
		int[] array1={1,2,3,4,5,6};
		int[] array2;
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		//这是是复制了指向同一个数组的引用
		array2=array1;
		System.out.println();
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		array1[5]=7;
		System.out.println();
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array1.length;i++){
			System.out.print(array2[i]+" ");
		}
		array2[0]=0;
		System.out.println();
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<array1.length;i++){
			System.out.print(array2[i]+" ");
		}
	}
}
