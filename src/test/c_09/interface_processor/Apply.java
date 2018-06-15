package test.c_09.interface_processor;

/**
 * 策略设计模式：能够根据所传递的参数对象不同而具有不同行为的方法
 * 这类方法包含所要执行的算法中不变的成分，"策略"包含变化的部分
 * 策略就是传进去的对象参数，它包含要执行的代码
 * @author mohan
 *
 */
public class Apply {
	public static void process(Processor p, Object o){
		System.out.println("Using processor "+p);
		System.out.println(p.process(o));
	}
}
