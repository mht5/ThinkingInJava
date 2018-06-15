package test.c_11.test_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * add��Listβ����ArrayList��LinkedList��Ҫ��ʱ�䶼�ǳ���ʱ�䣬ArrayList����
 * add��Listͷ����ArrayList�Ὣ����Ԫ�غ��ƣ�ʱ�临�Ӷ�ΪO(n)��LinkedList��addFirst()������ʱ���ǳ���ʱ�䡣LinkedList����
 * add��List�м䣺ArrayList����
 * @author mohan
 *
 */
public class TestList {
	public static void main(String[] args) {
    testAddFirst();
    testAddMiddle();
    testAdd();
  }

  //��������Ϊ10w
  public static int DEFAULTLEVEL=100000;
  
  public static void testAddFirst() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
    //arrayList
    long before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
      arrayList.add(0,i);
    }
    long after = System.currentTimeMillis();
    System.out.println("arrayList����0λ�ú�ʱ:" + (after - before));
    
    //linkedList
    before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
      linkedList.add(0,i);
    }
    after = System.currentTimeMillis();
    System.out.println("linkedList����0λ�ú�ʱ:" + (after - before));
    
    //linkedList addFirst()
    LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
    before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i++) {
      linkedList2.addFirst(i);
    }
    after = System.currentTimeMillis();
    System.out.println("linked addFirst()��ʱ:" + (after - before));
    
  }
  
  public static void testAddMiddle() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
    	//arrayList
        long before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
          arrayList.add(arrayList.size()/2,i);
        }
        long after = System.currentTimeMillis();
        System.out.println("arrayList�����м�λ�ú�ʱ:" + (after - before));
        
        //linkedList
        before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
          linkedList.add(linkedList.size()/2,i);
        }
        after = System.currentTimeMillis();
        System.out.println("linkedList�����м�λ�ú�ʱ:" + (after - before));
  }
  
  public static void testAdd() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
		//arrayList
        long before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
          arrayList.add(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("arrayList����β����ʱ:" + (after - before));
        
        //linkedList
        before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
          linkedList.add(i);
        }
        after = System.currentTimeMillis();
        System.out.println("linkedList����β����ʱ:" + (after - before));
  }
  
}