import java.util.*;
@SuppressWarnings({"unchecked"}) //消除警告的注解
public class GenericDemo {

	public static void main(String[] args) {
		ArrayList students=new ArrayList();
		Student xm=new Student("小明", 20);
		Student xh=new Student("小红", 19);
		Student xj=new Student("小杰", 18);
		students.add(xm);
		students.add(xh);
		students.add(xj);
		
		Teacher jacky = new Teacher("成龙", 40);
		students.add(jacky);
		
		for(Object o:students){
			Student s=(Student)o;
			s.printInfo();
		}
	}
}
