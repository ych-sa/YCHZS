import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		//��ջ
		Stack sc=new Stack();
		sc.add("Jack"); //add�������ص���boolean, true��ʾ��ӳɹ���false��ʾ���ʧ��
		sc.add(0, "Annie");//������Ϊ0��λ�������Ԫ��
		sc.push("Frank"); // ���Ԫ�أ�����ѹ��ջ�ڷ�ʽ��push�������ص�����ӵ�Ԫ��
		sc.addElement("William");// ���Ԫ�أ�û�з���ֵ
		
		System.out.println(sc);
		
		//ȡ��Ԫ��
		System.out.println("================");
		System.out.println(sc.size());
		for(int i=0;i<sc.size();i++){ //�� i=2,sc.size()==>2   2<2������
			System.out.println(sc.pop()); //���ѹ��ȥ�ģ�����ȡ������ȡ�����һ��Ԫ��
		
		}
	}
}
