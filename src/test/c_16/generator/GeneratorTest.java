package test.c_16.generator;

public class GeneratorTest {
	private static int size=10;
	
	public static void test(Class<?> surroundingClass){
		for(Class<?> type : surroundingClass.getClasses()){
			System.out.print(type.getSimpleName()+": ");
			try{
				Generator<?> g=(Generator<?>)type.newInstance();
				for(int i=0;i<size;i++){
					System.out.print(g.next()+" ");
				}
				System.out.println();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	
	public static void main(String[] args){
		test(CoutingGenerator.class);
	}
}
