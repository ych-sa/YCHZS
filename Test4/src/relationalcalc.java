import java.util.*;
public class relationalcalc {

	public static void main(String[] args) {
		//���弯��A
		HashSet<Integer> s1=new HashSet<Integer>();
		//���弯��B
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
		//�����ϵ�����ļ���
		HashSet<Integer> s=new HashSet<Integer>();
		

		//����
		s.addAll(s1);
		s.addAll(s2);
		System.out.print("A��B�Ĳ�����");
		
		//����
		Iterator<Integer> i1=s.iterator();
		while(i1.hasNext()){
			System.out.print(i1.next()+(i1.hasNext()==true?"	":"\n"));
		}
		System.out.println();
		
		s.clear();//���
		
		//����
		s.addAll(s1);
		s.retainAll(s2);
		System.out.print("A��B�Ľ�����");
		
		//��ǿforѭ����ӡ
		for(Integer o:s) {
			System.out.print(o+"	");
		}
		System.out.println();
		System.out.println();
		
		//��ʹ�����,�ÿ�¡clone
		s=(HashSet)s1.clone();
		
		//�
		s.addAll(s1);
		s.removeAll(s2);
		System.out.print("A��B�Ĳ��");
		Iterator<Integer> i3 = s.iterator();
		//��������ӡ
		while (i3.hasNext()) {
			Object o = i3.next();
			int k = Integer.parseInt(o.toString());
			System.out.print(k + (i3.hasNext() == true ? "	" : "\n"));
			System.out.print(i3.next()+(i3.hasNext()==true?"	":"\n"));
		}
		System.out.println();
	}

}
