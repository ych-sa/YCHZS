import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("S003", "Frank");
		tm.put("S001","Jack");
		tm.put("S002","Annie");
		
		
		System.out.println(tm);
		
		Iterator it=tm.keySet().iterator();
		while(it.hasNext()){//�Ƿ�����һ����
			String key=(String)it.next();//�����һ����
			//���ݼ����ֵ
			String value=(String)tm.get(key);
			System.out.println(key+"<==>"+value);
		}

	}

}
