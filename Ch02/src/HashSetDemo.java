import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Jack");
		hs.add("Annie");
		hs.add("William");
		hs.add("Frank");
		hs.add("Jack"); //�����б�����󣬵��ǲ�������ظ�Ԫ��
		hs.add(null);
		System.out.println(hs);
		//�Ƴ�Ԫ��
		//hs.remove(2); //�����Ը����������Ƴ�Ԫ�أ�Set�ӿ����Ԫ����û������
		hs.remove("William"); //ֻ�ܸ���Ԫ���������Ƴ�Ԫ��
		System.out.println(hs);
		
		//����Ԫ�أ���ӡ
		for(Object o:hs){
			System.out.println(o);
		}
		
		System.out.println("==========================");
		Iterator it=hs.iterator(); //���hs�ĵ�����
		while(it.hasNext()){
			String s=(String)it.next(); //ȡ����һ��Ԫ��
			System.out.println(s);
		}
	}

}
