import java.util.*;
@SuppressWarnings({"unchecked"}) //���������ע��
public class GenericDemo {

	public static void main(String[] args) {
		ArrayList students=new ArrayList();
		Student xm=new Student("С��", 20);
		Student xh=new Student("С��", 19);
		Student xj=new Student("С��", 18);
		students.add(xm);
		students.add(xh);
		students.add(xj);
		
		Teacher jacky = new Teacher("����", 40);
		students.add(jacky);
		
		for(Object o:students){
			Student s=(Student)o;
			s.printInfo();
		}
	}
}
