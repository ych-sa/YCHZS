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
	//��ӡѧ����Ϣ�ķ���
	void printInfo(){
		System.out.println(name+"\t"+age);
	}
	
	//��дcompareTo����
	public int compareTo(Object o){
		//����ת������oת��ΪStudent��Ķ���
		Student s=(Student)o; //ǿ����ת��
		return this.age-s.age; //������������
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
		//�Զ�����Comparable��compareTo������
		//����Studentû��ʵ��Comparable�ӿڣ������ClassCastException���Ͳ����ݵ��쳣
		//System.out.println(ts2); //ÿ��Studnet���Ͷ������toString()����
		
		for(Object o:ts2){
			Student s=(Student)o; //ǿ����ת��
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
