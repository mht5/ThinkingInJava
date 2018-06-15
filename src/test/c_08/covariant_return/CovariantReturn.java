package test.c_08.covariant_return;

/**
 * 协变返回类型：导出类中的被覆盖方法可以返回基类方法返回类型的导出类型
 * WheatMill.process()可以返回Mill.process()返回类型Grain的导出类型Wheat
 * @author mohan
 *
 */
public class CovariantReturn {
	public static void main(String[] args){
		System.out.println((new Mill()).process());
		System.out.println((new WheatMill()).process());
	}
}
