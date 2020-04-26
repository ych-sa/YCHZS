import java.util.*;

//�ɼ���
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
	//��дComparable�ӿ����compareTo����
	@Override
	public int compareTo(Grade g){
		return g.avg-this.avg; //����
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
		//���ͼ���
		ArrayList<Grade> list = new ArrayList<Grade>();
		Grade g1=new Grade("Java",82);
		Grade g2=new Grade("���ݿ�",68);
		Grade g3=new Grade("C����",75);
		
		list.add(g1);
		list.add(g2);
		list.add(g3);
		
		//ʵ����һ���Ƚ�����Ķ���
		AvgComp ac=new AvgComp();
		Collections.sort(list,ac); //�����Զ�����AvgComp������д��compare����
		
		System.out.println("�γ�����\tƽ����");
		//��ӡ
		for(Grade g:list){//��������ת��
			g.printInfo();
		}
		
		System.out.println("===================");
		System.out.println("�γ�����\tƽ����");
		//���ͽӿ�
		Iterator<Grade> it=list.iterator();//��������ת��
		while(it.hasNext()){
			Grade g=it.next(); //��������ת��
			g.printInfo();
		}
	}
}
