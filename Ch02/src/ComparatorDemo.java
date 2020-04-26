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
	//��ӡѧ����Ϣ�ķ���
	void printInfo(){
		System.out.println(name+"\t"+age);
	}
}

//��������ıȽ�����,ʵ��Comparator�ӿ�
class AgeComp implements Comparator{

	@Override  //��д
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

		//ʵ��������Ƚ�����Ķ���
		AgeComp ac=new AgeComp();
		Collections.sort(al,ac);//�Զ�����compare������al�����еĶ�������������
		
		
		for(Object o:al){
			Students s=(Students)o; //ǿ����ת��
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
