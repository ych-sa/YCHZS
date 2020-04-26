public class Student{
	String name;
	int age;
	Student(){
		
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	void printInfo(){
		System.out.println(name+","+age);
	}
}