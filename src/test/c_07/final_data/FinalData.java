package test.c_07.final_data;

/**
 * 对于基本类型，final使其值恒定
 * 对于对象引用，final使其引用的指向不变
 */
import java.util.Random;

class Value{
	int i;
	public Value(int i){
		this.i=i;
	}
}

public class FinalData {
	private static Random rand=new Random(47);
	private String id;
	
	public FinalData(String id){
		this.id=id;
	}
	
	private final int valueOne=9;
	private static final int VALUE_TWO=99;
	public static final int VALUE_THREE=73;
	private final int i4=rand.nextInt(100);
	static final int INT_5=rand.nextInt(100);
	private Value v1=new Value(13);
	private final Value v2=new Value(17);
	private static final  Value VAL_3=new Value(23);
	private final int[] a={1,2,3,4,5,6};
	
	public String toString(){
		return id+": i4="+i4+", INT_5="+INT_5;
	}
	
	public static void main(String[] args){
		FinalData fd=new FinalData("finalData");
		fd.v2.i++;
		fd.v1=new Value(9);
		for(int i=0;i<fd.a.length;i++){
			fd.a[i]++;
		}
		System.out.println(fd);
		System.out.println("Creating a new FinalData...");
		FinalData fd1=new FinalData("finalData1");
		System.out.println(fd);
		System.out.println(fd1);
	}
}
