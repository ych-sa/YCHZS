import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		//堆栈
		Stack sc=new Stack();
		sc.add("Jack"); //add方法返回的是boolean, true表示添加成功，false表示添加失败
		sc.add(0, "Annie");//在索引为0的位置上添加元素
		sc.push("Frank"); // 添加元素，采用压入栈内方式，push方法返回的是添加的元素
		sc.addElement("William");// 添加元素，没有返回值
		
		System.out.println(sc);
		
		//取出元素
		System.out.println("================");
		System.out.println(sc.size());
		for(int i=0;i<sc.size();i++){ //当 i=2,sc.size()==>2   2<2不成立
			System.out.println(sc.pop()); //最后压进去的，最先取出来，取出最后一个元素
		
		}
	}
}
