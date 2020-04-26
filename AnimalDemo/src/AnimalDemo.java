abstract class Animal{
	boolean mammal; //哺乳动物
	boolean carnivorous;  // 肉食动物
	int  mood;  //心情
	Animal(){
		
	}
	Animal(boolean mammal,boolean carnivorous, int mood)
	{
		this.mammal=mammal;
		this.carnivorous=carnivorous;
		this.mood=mood;
	}
	boolean isMammal()
	{
		return mammal;
	}
	boolean iscarnivorous()
	{
		return carnivorous;
	}
	abstract void sayHello();
	abstract void sayHello(int moodVal);
}
//定义接口
interface LandAnimal{
	int getNumberOfLegs();//腿的条数
}
interface WaterAnimal{
	boolean getGillflag();//有腮
	boolean getLaysEggs();//产卵
}

//子类
class Dog extends Animal implements LandAnimal{
	int numberOfLegs=4;
	public String numberOflegs;
	Dog(){
		
	}
	Dog(boolean mammal,boolean carnivorous,int mood){
		super(mammal,carnivorous,mood);
	}
	void sayHello(){
		System.out.println("狗通常情况下，和人打招呼的方式为：摇尾巴");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("狗在被抚摸情绪好的情况下，打招呼的方式为：汪汪叫");
		}	
		else if(moodVal==2)
		{
			System.out.println("狗在烦躁的时候，会：呜呜叫");
		}
		
	}
	public int getNumberOfLegs()
	{
		System.out.println("狗有4条腿");
		return  numberOfLegs;
	}
}
class Cat extends Animal implements LandAnimal{
	int numberOfLegs=4;
	public String numberOflegs;
	Cat(){
		
	}
	Cat(boolean mammal,boolean carnivorous,int mood){
			super(mammal,carnivorous,mood);
	}
	void sayHello(){
		System.out.println("猫通常情况下，和人打招呼的方式为：喵喵叫");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("猫被抚摸情绪好的情况下，打招呼的方式为：咕噜咕噜叫");
		}
		else if(moodVal==2)
		{
			System.out.println("猫烦躁的时候，会：嘶嘶叫");
		}
	}
	public int getNumberOfLegs()
	{
		System.out.println("猫有4条腿");
		return  true;
	}
}
class Frog extends Animal implements LandAnimal,WaterAnimal{
	int numberOflegs=4;
	Frog(){
		
	}
	Frog(boolean mammal,boolean carnivorous,int mood){
		super(mammal,carnivorous,mood);
	}
	void sayHello(){
		System.out.println("青蛙通常情况下，和人打招呼的方式为：呱呱叫");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("青蛙情绪好的情况下，打招呼的方式为：呱呱叫");
		}
		else if(moodVal==2)
		{
			System.out.println("青蛙烦躁的时候，会：扑通一声跳入水中");
		}
		}	
		public int getNumberOfLegs()
		{
			System.out.println("青蛙有4条腿");
			return numberOflegs;
		}
		public boolean getLaysEggs()
		{
			System.out.println("青蛙产卵");
			return true;
		}
		public boolean getGillflag()
		{
			System.out.println("青蛙有腮");
			return true;
		}
		
		
}
public class AnimalDemo {
	
	public static void main(String[] args) {
			Dog dog=new Dog();
			dog.mammal=true;
			dog.carnivorous=true;
			if(dog.isMammal()){
				System.out.println("狗是哺乳动物");
			}
			else{
				System.out.println("狗不是哺乳动物");
			}
			if(dog.iscarnivorous())
			{
				System.out.println("狗是肉食动物");
			}
			else{
				System.out.println("狗不是肉食动物");
			}
			
			dog.sayHello();
			dog.sayHello(1);
			dog.sayHello(2);
			System.out.println("狗有"+dog.numberOfLegs+"条腿");
			System.out.println("===================================");
			
			Cat cat=new Cat();
			cat.mammal=true;
			cat.carnivorous=true;
			if(cat.isMammal()){
				System.out.println("猫是哺乳动物");
			}
			else{
				System.out.println("猫不是哺乳动物");
			}
			if(cat.iscarnivorous())
			{
				System.out.println("猫是肉食动物");
			}
			else{
				System.out.println("猫不是肉食动物");
			}
			cat.sayHello();
			cat.sayHello(1);
			cat.sayHello(2);
			System.out.println("猫有"+cat.numberOfLegs+"条腿");
			System.out.println("=====================================");
			
			Frog frog=new Frog();
			frog.mammal=false;
			frog.carnivorous=false;
			if(frog.isMammal()){
				System.out.println("青蛙是哺乳动物");
			}
			else
			{
				System.out.println("青蛙不是哺乳动物");
			}
			if(frog.iscarnivorous())
			{
				System.out.println("青蛙是肉食动物");
			}
			else
			{
				System.out.println("青蛙不是肉食动物");
			}
			frog.sayHello();
			frog.sayHello(1);
			frog.sayHello(2);
			System.out.println("青蛙有"+frog.numberOflegs+"条腿");
			frog.getLaysEggs();
			frog.getGillflag();
		}
	}
