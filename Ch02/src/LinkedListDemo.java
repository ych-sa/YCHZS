import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		//����
		LinkedList ll=new LinkedList();
		ll.add("Jack");
		ll.add("Frank");
		ll.addFirst("Annie"); //addFirst�ڵ�һ��������Ϊ0�ģ�λ�������Ԫ��
		ll.addLast("William"); //addList�����һ��������Ϊll.size()�ģ�λ�������Ԫ��
		
		System.out.println(ll);
		System.out.println(ll.getFirst()); //��ȡ��һ��Ԫ��
		System.out.println(ll.getLast()); //��ȡ���һ��Ԫ��
		System.out.println(ll.get(1));
	}

}
