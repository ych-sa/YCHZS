import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Jack");
		hs.add("Annie");
		hs.add("William");
		hs.add("Frank");
		hs.add("Jack"); //不会有编译错误，但是不会添加重复元素
		hs.add(null);
		System.out.println(hs);
		//移除元素
		//hs.remove(2); //不可以根据索引来移除元素，Set接口里的元素是没有索引
		hs.remove("William"); //只能根据元素名称来移除元素
		System.out.println(hs);
		
		//遍历元素，打印
		for(Object o:hs){
			System.out.println(o);
		}
		
		System.out.println("==========================");
		Iterator it=hs.iterator(); //获得hs的迭代器
		while(it.hasNext()){
			String s=(String)it.next(); //取出下一个元素
			System.out.println(s);
		}
	}

}
