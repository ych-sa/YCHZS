import java.util.*;

//大学类
class University implements Comparable<University>{
	String uniName;//学校名称
	int population;//学生人数
	//无参构造方法
	University(){
		
	}
	//带参数构造方法
	University(String uniName,int population){
		this.uniName=uniName;
		this.population=population;
	}
	
	public int compareTo(University o) {
		//采用降序排序
		return o.population-this.population;
	}

	void print() {
		System.out.println(uniName+"\t"+"\t"+population);
	}
}


public class populationsort {

	public static void main(String[] args) {
		ArrayList<University> list=new ArrayList<University>();

		list.add(new University("北京理工大学珠海学院",21000));
		list.add(new University("北京师范大学珠海学院",25000));
		list.add(new University("吉林大学珠海学院",20000));
		list.add(new University("中山大学珠海分校",18000));
		list.add(new University("暨南大学珠海分校",7000));
		
		//进行排序
		Collections.sort(list);

		System.out.println("学校名称"+"\t"+ "\t"+"\t"+"学生人数");
        System.out.println("=====================================");
		
        //迭代器打印
      Iterator it=list.iterator();
      while(it.hasNext()){
      	University uni=(University)it.next();
      	uni.print();
	}

}
}
