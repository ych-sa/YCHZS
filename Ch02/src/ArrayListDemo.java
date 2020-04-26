import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//实例化Arrayist的对象
		ArrayList al=new ArrayList();
		al.add("Jack"); //--0
		al.add("Annie"); //--1
		al.add("Frank"); //--2
		al.add(1,"William");
		al.add("Jack"); //添加重复元素
		al.remove("Frank");//移除元素
		//al.remove(3);
		
		//打印方式一
		System.out.println(al);
		
		System.out.println("======================");
		//打印方式二
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); //get方法取出的元素都是Object类型
		}
		
		System.out.println("======================");
		//打印方式三：foreach循环（增强for循环）
		for(Object o:al){
			String s=(String)o;
			System.out.println(o); //默认调用Object的toString()方法 
		}
	}
}
