import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("S003", "Frank");
		tm.put("S001","Jack");
		tm.put("S002","Annie");
		
		
		System.out.println(tm);
		
		Iterator it=tm.keySet().iterator();
		while(it.hasNext()){//是否还有下一个键
			String key=(String)it.next();//获得下一个键
			//根据键获得值
			String value=(String)tm.get(key);
			System.out.println(key+"<==>"+value);
		}

	}

}
