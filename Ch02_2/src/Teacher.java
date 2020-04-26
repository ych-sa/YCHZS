
public class Teacher {
	String name;
	int age;
	
	Teacher(){
		
	}
	Teacher(String name,int age){
		this.name=name;
		this.age=age;
	}
	void printInfo(){
		System.out.println(name+","+age);
	}
}
