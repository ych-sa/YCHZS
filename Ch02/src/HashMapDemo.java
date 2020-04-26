import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("S001","李红");
		hm.put("S002","王浩");
		hm.put("S003","张媛");
		//hm.put(null, "aaa");
		
		//hm.remove("S002");//根据键移除元素
		System.out.println(hm);
		
		Iterator it=hm.keySet().iterator(); //获得键的集合的迭代器
		while(it.hasNext()){ //是否还有下一个键
			String key=(String)it.next();//获得下一个键
			String value=(String)hm.get(key); //根据键获取值
			System.out.println(key+"<==>"+value);
		}
	}

}
