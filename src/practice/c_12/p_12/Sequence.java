package practice.c_12.p_12;

/**
 * ��ӹ���Ԫ��ʱ�׳��쳣
 * @author mohan
 *
 */
public class Sequence {
	private static Object[] items;
	private int next=0;
	
	public Sequence(int size){
		items=new Object[size];
	}
	
	public void add(Object x){
		if(next<items.length){
			items[next++]=x;
		}
	}
	
	private static class SequenceSelector implements Selector{
		private int i=0;
		
		@Override
		public boolean end() {
			//������Χ�����private�ֶ�
			return (i==items.length);
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i<items.length){
				i++;
			}
		}
	}
	
	public static Selector selector(){
		return (new SequenceSelector());
	}
	
	public static Sequence fill(Sequence sequence){
		for(int i=0;i<20;i++){
			if(i>items.length){
				throw new ArrayIndexOutOfBoundsException("Too much element for items.");
			}
			sequence.add(Integer.toString(i));
		}
		return sequence;
	}
	
	public static void main(String[] args){
		Sequence sequence=new Sequence(10);
		sequence=fill(sequence);
		Selector selector=Sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current()+" ");
			selector.next();
		}
	}
}
