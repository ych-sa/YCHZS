import java.util.*;

//成绩类
/*
class Grade implements Comparable<Grade>{
	String courseName; 
	int avg;
	
	Grade(){
		
	}
	
	Grade(String courseName,int avg){
		this.courseName=courseName;
		this.avg=avg;
	}
	
	void printInfo(){
		System.out.println(courseName+"\t"+avg);
	}
	//重写Comparable接口里的compareTo方法
	@Override
	public int compareTo(Grade g){
		return g.avg-this.avg; //降序
	}
}*/

class Grade{
	String courseName; 
	int avg;
	
	Grade(){
		
	}
	
	Grade(String courseName,int avg){
		this.courseName=courseName;
		this.avg=avg;
	}
	void printInfo(){
		System.out.println(courseName+"\t"+avg);
	}
}


class AvgComp implements Comparator<Grade>{

	@Override
	public int compare(Grade g1, Grade g2) {
		return g2.avg-g1.avg;
	}
	
}

public class GenericDemo4 {
	public static void main(String[] args) {
		//泛型集合
		ArrayList<Grade> list = new ArrayList<Grade>();
		Grade g1=new Grade("Java",82);
		Grade g2=new Grade("数据库",68);
		Grade g3=new Grade("C语言",75);
		
		list.add(g1);
		list.add(g2);
		list.add(g3);
		
		//实例化一个比较器类的对象
		AvgComp ac=new AvgComp();
		Collections.sort(list,ac); //排序。自动调用AvgComp类中重写的compare方法
		
		System.out.println("课程名称\t平均分");
		//打印
		for(Grade g:list){//无需类型转换
			g.printInfo();
		}
		
		System.out.println("===================");
		System.out.println("课程名称\t平均分");
		//泛型接口
		Iterator<Grade> it=list.iterator();//无需类型转换
		while(it.hasNext()){
			Grade g=it.next(); //无需类型转换
			g.printInfo();
		}
	}
}
