import java.util.*;

public class GenericDemo2 {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		Student xm=new Student("小明", 20);
		Student xh=new Student("小红", 19);
		Student xj=new Student("小杰", 18);
		students.add(xm);
		students.add(xh);
		students.add(xj);
		
		Teacher jacky = new Teacher("成龙", 40);
		//students.add(jacky); //语法检查就报错
		
		for(Student s:students){ //不需要进行类型转换
			s.printInfo();
		}
	}
}
