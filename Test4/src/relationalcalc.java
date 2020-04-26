import java.util.*;
public class relationalcalc {

	public static void main(String[] args) {
		//定义集合A
		HashSet<Integer> s1=new HashSet<Integer>();
		//定义集合B
		HashSet<Integer> s2=new HashSet<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s2.add(1);
		s2.add(3);
		s2.add(7);
		s2.add(9);
		s2.add(11);
		//定义关系运算后的集合
		HashSet<Integer> s=new HashSet<Integer>();
		

		//并集
		s.addAll(s1);
		s.addAll(s2);
		System.out.print("A和B的并集：");
		
		//泛型
		Iterator<Integer> i1=s.iterator();
		while(i1.hasNext()){
			System.out.print(i1.next()+(i1.hasNext()==true?"	":"\n"));
		}
		System.out.println();
		
		s.clear();//清空
		
		//交集
		s.addAll(s1);
		s.retainAll(s2);
		System.out.print("A和B的交集：");
		
		//增强for循环打印
		for(Integer o:s) {
			System.out.print(o+"	");
		}
		System.out.println();
		System.out.println();
		
		//不使用清空,用克隆clone
		s=(HashSet)s1.clone();
		
		//差集
		s.addAll(s1);
		s.removeAll(s2);
		System.out.print("A和B的差集：");
		Iterator<Integer> i3 = s.iterator();
		//迭代器打印
		while (i3.hasNext()) {
			Object o = i3.next();
			int k = Integer.parseInt(o.toString());
			System.out.print(k + (i3.hasNext() == true ? "	" : "\n"));
			System.out.print(i3.next()+(i3.hasNext()==true?"	":"\n"));
		}
		System.out.println();
	}

}
