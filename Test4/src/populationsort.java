import java.util.*;

//��ѧ��
class University implements Comparable<University>{
	String uniName;//ѧУ����
	int population;//ѧ������
	//�޲ι��췽��
	University(){
		
	}
	//���������췽��
	University(String uniName,int population){
		this.uniName=uniName;
		this.population=population;
	}
	
	public int compareTo(University o) {
		//���ý�������
		return o.population-this.population;
	}

	void print() {
		System.out.println(uniName+"\t"+"\t"+population);
	}
}


public class populationsort {

	public static void main(String[] args) {
		ArrayList<University> list=new ArrayList<University>();

		list.add(new University("��������ѧ�麣ѧԺ",21000));
		list.add(new University("����ʦ����ѧ�麣ѧԺ",25000));
		list.add(new University("���ִ�ѧ�麣ѧԺ",20000));
		list.add(new University("��ɽ��ѧ�麣��У",18000));
		list.add(new University("���ϴ�ѧ�麣��У",7000));
		
		//��������
		Collections.sort(list);

		System.out.println("ѧУ����"+"\t"+ "\t"+"\t"+"ѧ������");
        System.out.println("=====================================");
		
        //��������ӡ
      Iterator it=list.iterator();
      while(it.hasNext()){
      	University uni=(University)it.next();
      	uni.print();
	}

}
}
