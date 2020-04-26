import java.util.*;

//����
class Fruit{
	String name;
	String color;
	Fruit(){
		
	}
	
	Fruit(String name,String color){
		this.name=name;
		this.color=color;
	}
	//��ӡ����
	void printInfo(){
		System.out.println(name+","+color);
	}
}
//���ࣺƻ��
class Apple extends Fruit{
	Apple(){
		
	}
	
	Apple(String name,String color){
		super(name,color);
	}
}

class FujiApple extends Apple{
	FujiApple(){
		
	}
	
	FujiApple(String name,String color){
		super(name,color);
	}
}

//���ࣺ�㽶
class Banana extends Fruit{
	Banana(){
		
	}
	
	Banana(String name,String color){
		super(name,color);
	}
}

public class GenericDemo5 {
	//����������ͨ�����ֻ����Fruit����Fruit���෺��������ſ��Դ�����
	static void method1(ArrayList<? extends Fruit> list){
		//����get������ȡԪ�ز���ӡ
		for (int i = 0; i < list.size(); i++) {
			Fruit f=list.get(i);
			f.printInfo();
		}
		list.remove(0); //�Ƴ�Ԫ��
		//list.add(new Fruit("����","��ɫ")); ����
	}
	
	//����������ͨ���
	static void method2(ArrayList<? super Apple> list){//ֻ����Apple����Apple�ĸ��෺��������ſ��Դ�����
		//����get������ȡԪ�ز���ӡ
		for (int i = 0; i < list.size(); i++) {
			Apple a=(Apple)list.get(i); //����ת��
			a.printInfo();
		}
		list.remove(0);//�Ƴ�Ԫ�ؿ��Ե�
		//���Ԫ��ֻ����Apple��Apple����Ķ���
		list.add(new Apple("ƻ��","��ɫ"));
		list.add(new FujiApple("�츻ʿƻ��","��ɫ"));
		//list.add(new Fruit("����","��ɫ"));
	}
	
	public static void main(String[] args) {
		ArrayList<Fruit> list1=new ArrayList<Fruit>();
		Fruit f1=new Fruit("��ݮ","��ɫ");
		Fruit f2=new Fruit("â��","��ɫ");
		Fruit f3=new Fruit("����","��ɫ");
		list1.add(f1);
		list1.add(f2);
		list1.add(f3);
		
		ArrayList<Apple> list2=new ArrayList<Apple>();
		Apple a1=new Apple("ƻ��1","��ɫ");
		Apple a2=new Apple("ƻ��2","��ɫ");
		Apple a3=new Apple("ƻ��3","��ɫ");
		list2.add(a1);
		list2.add(a2);
		list2.add(a3);
		
		ArrayList<Banana> list3=new ArrayList<Banana>();
		Banana b1=new Banana("�㽶1","��ɫ");
		Banana b2=new Banana("�㽶2","��ɫ");
		Banana b3=new Banana("�㽶3","��ɫ");
		list3.add(b1);
		list3.add(b2);
		list3.add(b3);
		
		//��������ͨ�������
		method1(list1);
		System.out.println("------------");
		method1(list2);
		System.out.println("------------");
		method1(list3);
		ArrayList<Object> list=new ArrayList<Object>();
		//method1(list); ����
		
		method2(list1);
		method2(list2);
		//method2(list3); ����
		
		ArrayList<FujiApple> list4=new ArrayList<FujiApple>();
		FujiApple fa1=new FujiApple("�츻ʿƻ��1","��ɫ");
		FujiApple fa2=new FujiApple("�츻ʿƻ��2","��ɫ");
		FujiApple fa3=new FujiApple("�츻ʿƻ��3","��ɫ");
		list4.add(fa1);
		list4.add(fa2);
		list4.add(fa3);
		//method2(list4); ����
	}

}
