//泛型类(坐标)
class Point<T extends Number>{ //T是受限的类型参数,必须是Number类或Number子类
	T x;
	T y;
	
	Point(){
		
	}
	
	Point(T x, T y){
		this.x=x;
		this.y=y;
	}
	
	void printInfo(){
		System.out.println(x+","+y);
	}
	//静态方法不可以使用该泛型类的类型参数
	static <K> void method(K x,K y){
		
	}
}

class MyClass{
	void m1(){
		
	}
	
	void m2(){
		
	}
	//泛型方法，T是类型参数,<T>表示该方法是泛型方法
	public <T> T evaluate(T a,T b){
		return a;
	}
}
public class GenericDemo3 {
	public static void main(String[] args) {
		//第一次传递的类型参数是Integer
		Point<Integer> p1=new Point<Integer>(new Integer(10),new Integer(15));
		p1.printInfo();
		//第二次传递的类型参数是Double
		Point<Double> p2=new Point<Double>(new Double(3.126),new Double(4.784));
		p2.printInfo();
		
		//String类不是Number类的子类，编译错误
		//Point<String> p3=new Point<String>("Hello","world");
		
		MyClass mc=new MyClass();
		System.out.println(mc.evaluate("Hello", "Welcome")); //打印Hello
		System.out.println(mc.evaluate(new Integer(100), new Integer(200))); //打印100
	}
}
