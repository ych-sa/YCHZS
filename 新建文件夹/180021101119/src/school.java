import java.util.*;

class University implements Comparable<University>{
	String sname;//ѧУ����
	int pop;//ѧ������
	University(){
		
	}
	University(String sname,int pop){
		this.sname = sname;
		this.pop = pop;
	}
	
	void printInfo() {
		System.out.println(sname+"\t"+pop+"��");
	}
	public int compareTo(University u) {
		return u.pop - this.pop;
	}
}
public class school {

	public static void main(String[] args) {
		University u1 = new University("����ʦ����ѧ�麣ѧԺ",25000);
		University u2 = new University("��������ѧ�麣ѧԺ",21000);
		University u3 = new University("���ִ�ѧ�麣ѧԺ\t",20000);
		University u4 = new University("��ɽ��ѧ�麣��У\t",18000);
		University u5 = new University("���ϴ�ѧ�麣��У\t",7000);
		ArrayList<University> sch = new ArrayList<University>();
		
		sch.add(u1);
		sch.add(u2);
		sch.add(u3);
		sch.add(u4);
		sch.add(u5);
		
		System.out.println("  ѧУ����\t\tѧ������        ");
		System.out.println("=================================");
		Collections.sort(sch);
		for(University u:sch) {
			u.printInfo();
		}
	}
}


