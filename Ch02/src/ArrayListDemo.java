import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ʵ����Arrayist�Ķ���
		ArrayList al=new ArrayList();
		al.add("Jack"); //--0
		al.add("Annie"); //--1
		al.add("Frank"); //--2
		al.add(1,"William");
		al.add("Jack"); //����ظ�Ԫ��
		al.remove("Frank");//�Ƴ�Ԫ��
		//al.remove(3);
		
		//��ӡ��ʽһ
		System.out.println(al);
		
		System.out.println("======================");
		//��ӡ��ʽ��
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i)); //get����ȡ����Ԫ�ض���Object����
		}
		
		System.out.println("======================");
		//��ӡ��ʽ����foreachѭ������ǿforѭ����
		for(Object o:al){
			String s=(String)o;
			System.out.println(o); //Ĭ�ϵ���Object��toString()���� 
		}
	}
}
