import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		//链表
		LinkedList ll=new LinkedList();
		ll.add("Jack");
		ll.add("Frank");
		ll.addFirst("Annie"); //addFirst在第一个（索引为0的）位置来添加元素
		ll.addLast("William"); //addList在最后一个（索引为ll.size()的）位置来添加元素
		
		System.out.println(ll);
		System.out.println(ll.getFirst()); //获取第一个元素
		System.out.println(ll.getLast()); //获取最后一个元素
		System.out.println(ll.get(1));
	}

}
