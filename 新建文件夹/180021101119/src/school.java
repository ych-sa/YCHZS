import java.util.*;

class University implements Comparable<University>{
	String sname;//学校名称
	int pop;//学生人数
	University(){
		
	}
	University(String sname,int pop){
		this.sname = sname;
		this.pop = pop;
	}
	
	void printInfo() {
		System.out.println(sname+"\t"+pop+"人");
	}
	public int compareTo(University u) {
		return u.pop - this.pop;
	}
}
public class school {

	public static void main(String[] args) {
		University u1 = new University("北京师范大学珠海学院",25000);
		University u2 = new University("北京理工大学珠海学院",21000);
		University u3 = new University("吉林大学珠海学院\t",20000);
		University u4 = new University("中山大学珠海分校\t",18000);
		University u5 = new University("暨南大学珠海分校\t",7000);
		ArrayList<University> sch = new ArrayList<University>();
		
		sch.add(u1);
		sch.add(u2);
		sch.add(u3);
		sch.add(u4);
		sch.add(u5);
		
		System.out.println("  学校名称\t\t学生人数        ");
		System.out.println("=================================");
		Collections.sort(sch);
		for(University u:sch) {
			u.printInfo();
		}
	}
}


