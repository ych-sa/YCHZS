//������(����)
class Point<T extends Number>{ //T�����޵����Ͳ���,������Number���Number����
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
	//��̬����������ʹ�ø÷���������Ͳ���
	static <K> void method(K x,K y){
		
	}
}

class MyClass{
	void m1(){
		
	}
	
	void m2(){
		
	}
	//���ͷ�����T�����Ͳ���,<T>��ʾ�÷����Ƿ��ͷ���
	public <T> T evaluate(T a,T b){
		return a;
	}
}
public class GenericDemo3 {
	public static void main(String[] args) {
		//��һ�δ��ݵ����Ͳ�����Integer
		Point<Integer> p1=new Point<Integer>(new Integer(10),new Integer(15));
		p1.printInfo();
		//�ڶ��δ��ݵ����Ͳ�����Double
		Point<Double> p2=new Point<Double>(new Double(3.126),new Double(4.784));
		p2.printInfo();
		
		//String�಻��Number������࣬�������
		//Point<String> p3=new Point<String>("Hello","world");
		
		MyClass mc=new MyClass();
		System.out.println(mc.evaluate("Hello", "Welcome")); //��ӡHello
		System.out.println(mc.evaluate(new Integer(100), new Integer(200))); //��ӡ100
	}
}
