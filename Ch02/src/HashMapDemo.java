import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("S001","���");
		hm.put("S002","����");
		hm.put("S003","����");
		//hm.put(null, "aaa");
		
		//hm.remove("S002");//���ݼ��Ƴ�Ԫ��
		System.out.println(hm);
		
		Iterator it=hm.keySet().iterator(); //��ü��ļ��ϵĵ�����
		while(it.hasNext()){ //�Ƿ�����һ����
			String key=(String)it.next();//�����һ����
			String value=(String)hm.get(key); //���ݼ���ȡֵ
			System.out.println(key+"<==>"+value);
		}
	}

}
