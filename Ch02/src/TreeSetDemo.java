import java.util.*;

class Student implements Comparable{
	String name;
	int age;
	Student(){
		
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	//打印学生信息的方法
	void printInfo(){
		System.out.println(name+"\t"+age);
	}
	
	//重写compareTo方法
	public int compareTo(Object o){
		//类型转换：把o转换为Student类的对象
		Student s=(Student)o; //强制性转换
		return this.age-s.age; //按照年龄排序
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Jack");
		ts.add("Annie");
		ts.add("Frank");
		ts.add("William");
		ts.add("Tom");
		System.out.println(ts);

		TreeSet ts2=new TreeSet();
		Student s1=new Student("Jack",21);
		Student s2=new Student("Annie",20);
		Student s3=new Student("Frank",18);
		ts2.add(s1);
		ts2.add(s2);
		ts2.add(s3);
		//自动调用Comparable的compareTo方法，
		//由于Student没有实现Comparable接口，会出现ClassCastException类型不兼容的异常
		//System.out.println(ts2); //每个Studnet类型对象调用toString()方法
		
		for(Object o:ts2){
			Student s=(Student)o; //强制性转换
			s.printInfo();
		}
		System.out.println("======================");
		Iterator it=ts2.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			s.printInfo();
		}
	}
}
