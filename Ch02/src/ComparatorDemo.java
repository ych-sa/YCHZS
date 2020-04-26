import java.util.*;

class Students{
	String name;
	int age;
	Students(){
		
	}
	Students(String name,int age){
		this.name=name;
		this.age=age;
	}
	//打印学生信息的方法
	void printInfo(){
		System.out.println(name+"\t"+age);
	}
}

//定义年龄的比较器类,实现Comparator接口
class AgeComp implements Comparator{

	@Override  //重写
	public int compare(Object o1, Object o2) {
		Students s1=(Students)o1;
		Students s2=(Students)o2;
		return s1.age-s2.age;
	}
}


public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Students s1=new Students("Jack",21);
		Students s2=new Students("Annie",20);
		Students s3=new Students("Frank",18);
		al.add(s1);
		al.add(s2);
		al.add(s3);

		//实例化年龄比较器类的对象
		AgeComp ac=new AgeComp();
		Collections.sort(al,ac);//自动调用compare方法对al集合中的对象按照年龄排序
		
		
		for(Object o:al){
			Students s=(Students)o; //强制性转换
			s.printInfo();
		}
		System.out.println("======================");
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			Students s=(Students)it.next();
			s.printInfo();
		}
	}
}
