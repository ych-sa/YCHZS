import java.util.*;

public class GenericDemo2 {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		Student xm=new Student("С��", 20);
		Student xh=new Student("С��", 19);
		Student xj=new Student("С��", 18);
		students.add(xm);
		students.add(xh);
		students.add(xj);
		
		Teacher jacky = new Teacher("����", 40);
		//students.add(jacky); //�﷨���ͱ���
		
		for(Student s:students){ //����Ҫ��������ת��
			s.printInfo();
		}
	}
}
