package test.c_03.UR_shift;

/**
 * 位运算
 * 左移操作符(<<)能按照操作符右侧指定的位数将操作符左边的操作数向左移动（低位补0）
 * "有符号"右移操作符(>>)按照操作符右侧指定的位数将操作符左边的操作数向右移动。使用“符号扩展”：若符号为正，则在高位插入0，反正插入1
 * "无符号"右移操作符(>>>)使用“零扩展”：无论正负，都在高位插入0
 * 在进行“无符号”右移位结合赋值操作时，可能会遇到一个问题：
 * 如果对byte或short值进行这样的移位运算，得到的可能不是正确的结果。
 * 它们首先会被转换成int类型，再进行右移操作，然后被截断，赋值给原来的类型，在这种情况下可能得到-1的结果
 * @author mohan
 *
 */
public class URShift {
	public static void main(String[] args){
		int i=-1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		long l=-1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(Long.toBinaryString(l));
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
//		这里使用了赋值操作
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));
		s=-1;
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(s>>>10));
		byte b=-1;
		System.out.println(Integer.toBinaryString(b));
//		这里也是用了赋值操作
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		b=-1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
	}
}
