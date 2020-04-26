import java.util.*;

//父类
class Fruit{
	String name;
	String color;
	Fruit(){
		
	}
	
	Fruit(String name,String color){
		this.name=name;
		this.color=color;
	}
	//打印方法
	void printInfo(){
		System.out.println(name+","+color);
	}
}
//子类：苹果
class Apple extends Fruit{
	Apple(){
		
	}
	
	Apple(String name,String color){
		super(name,color);
	}
}

class FujiApple extends Apple{
	FujiApple(){
		
	}
	
	FujiApple(String name,String color){
		super(name,color);
	}
}

//子类：香蕉
class Banana extends Fruit{
	Banana(){
		
	}
	
	Banana(String name,String color){
		super(name,color);
	}
}

public class GenericDemo5 {
	//参数是上限通配符，只能是Fruit或者Fruit子类泛型类参数才可以传进来
	static void method1(ArrayList<? extends Fruit> list){
		//可以get方法获取元素并打印
		for (int i = 0; i < list.size(); i++) {
			Fruit f=list.get(i);
			f.printInfo();
		}
		list.remove(0); //移除元素
		//list.add(new Fruit("梨子","黄色")); 报错
	}
	
	//参数是下限通配符
	static void method2(ArrayList<? super Apple> list){//只能是Apple或者Apple的父类泛型类参数才可以传进来
		//可以get方法获取元素并打印
		for (int i = 0; i < list.size(); i++) {
			Apple a=(Apple)list.get(i); //类型转换
			a.printInfo();
		}
		list.remove(0);//移除元素可以的
		//添加元素只能是Apple及Apple子类的对象
		list.add(new Apple("苹果","黄色"));
		list.add(new FujiApple("红富士苹果","红色"));
		//list.add(new Fruit("橙子","黄色"));
	}
	
	public static void main(String[] args) {
		ArrayList<Fruit> list1=new ArrayList<Fruit>();
		Fruit f1=new Fruit("草莓","红色");
		Fruit f2=new Fruit("芒果","黄色");
		Fruit f3=new Fruit("橙子","黄色");
		list1.add(f1);
		list1.add(f2);
		list1.add(f3);
		
		ArrayList<Apple> list2=new ArrayList<Apple>();
		Apple a1=new Apple("苹果1","红色");
		Apple a2=new Apple("苹果2","绿色");
		Apple a3=new Apple("苹果3","红色");
		list2.add(a1);
		list2.add(a2);
		list2.add(a3);
		
		ArrayList<Banana> list3=new ArrayList<Banana>();
		Banana b1=new Banana("香蕉1","黄色");
		Banana b2=new Banana("香蕉2","绿色");
		Banana b3=new Banana("香蕉3","黄色");
		list3.add(b1);
		list3.add(b2);
		list3.add(b3);
		
		//调用上限通配符方法
		method1(list1);
		System.out.println("------------");
		method1(list2);
		System.out.println("------------");
		method1(list3);
		ArrayList<Object> list=new ArrayList<Object>();
		//method1(list); 报错
		
		method2(list1);
		method2(list2);
		//method2(list3); 报错
		
		ArrayList<FujiApple> list4=new ArrayList<FujiApple>();
		FujiApple fa1=new FujiApple("红富士苹果1","红色");
		FujiApple fa2=new FujiApple("红富士苹果2","绿色");
		FujiApple fa3=new FujiApple("红富士苹果3","红色");
		list4.add(fa1);
		list4.add(fa2);
		list4.add(fa3);
		//method2(list4); 报错
	}

}
