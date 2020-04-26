abstract class Animal{
	boolean mammal; //���鶯��
	boolean carnivorous;  // ��ʳ����
	int  mood;  //����
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
//����ӿ�
interface LandAnimal{
	int getNumberOfLegs();//�ȵ�����
}
interface WaterAnimal{
	boolean getGillflag();//����
	boolean getLaysEggs();//����
}

//����
class Dog extends Animal implements LandAnimal{
	int numberOfLegs=4;
	public String numberOflegs;
	Dog(){
		
	}
	Dog(boolean mammal,boolean carnivorous,int mood){
		super(mammal,carnivorous,mood);
	}
	void sayHello(){
		System.out.println("��ͨ������£����˴��к��ķ�ʽΪ��ҡβ��");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("���ڱ����������õ�����£����к��ķ�ʽΪ��������");
		}	
		else if(moodVal==2)
		{
			System.out.println("���ڷ����ʱ�򣬻᣺���ؽ�");
		}
		
	}
	public int getNumberOfLegs()
	{
		System.out.println("����4����");
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
		System.out.println("èͨ������£����˴��к��ķ�ʽΪ��������");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("è�����������õ�����£����к��ķ�ʽΪ�����๾���");
		}
		else if(moodVal==2)
		{
			System.out.println("è�����ʱ�򣬻᣺˻˻��");
		}
	}
	public int getNumberOfLegs()
	{
		System.out.println("è��4����");
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
		System.out.println("����ͨ������£����˴��к��ķ�ʽΪ�����ɽ�");
	}
	void sayHello(int moodVal){
		if(moodVal==1)
		{
			System.out.println("���������õ�����£����к��ķ�ʽΪ�����ɽ�");
		}
		else if(moodVal==2)
		{
			System.out.println("���ܷ����ʱ�򣬻᣺��ͨһ������ˮ��");
		}
		}	
		public int getNumberOfLegs()
		{
			System.out.println("������4����");
			return numberOflegs;
		}
		public boolean getLaysEggs()
		{
			System.out.println("���ܲ���");
			return true;
		}
		public boolean getGillflag()
		{
			System.out.println("��������");
			return true;
		}
		
		
}
public class AnimalDemo {
	
	public static void main(String[] args) {
			Dog dog=new Dog();
			dog.mammal=true;
			dog.carnivorous=true;
			if(dog.isMammal()){
				System.out.println("���ǲ��鶯��");
			}
			else{
				System.out.println("�����ǲ��鶯��");
			}
			if(dog.iscarnivorous())
			{
				System.out.println("������ʳ����");
			}
			else{
				System.out.println("��������ʳ����");
			}
			
			dog.sayHello();
			dog.sayHello(1);
			dog.sayHello(2);
			System.out.println("����"+dog.numberOfLegs+"����");
			System.out.println("===================================");
			
			Cat cat=new Cat();
			cat.mammal=true;
			cat.carnivorous=true;
			if(cat.isMammal()){
				System.out.println("è�ǲ��鶯��");
			}
			else{
				System.out.println("è���ǲ��鶯��");
			}
			if(cat.iscarnivorous())
			{
				System.out.println("è����ʳ����");
			}
			else{
				System.out.println("è������ʳ����");
			}
			cat.sayHello();
			cat.sayHello(1);
			cat.sayHello(2);
			System.out.println("è��"+cat.numberOfLegs+"����");
			System.out.println("=====================================");
			
			Frog frog=new Frog();
			frog.mammal=false;
			frog.carnivorous=false;
			if(frog.isMammal()){
				System.out.println("�����ǲ��鶯��");
			}
			else
			{
				System.out.println("���ܲ��ǲ��鶯��");
			}
			if(frog.iscarnivorous())
			{
				System.out.println("��������ʳ����");
			}
			else
			{
				System.out.println("���ܲ�����ʳ����");
			}
			frog.sayHello();
			frog.sayHello(1);
			frog.sayHello(2);
			System.out.println("������"+frog.numberOflegs+"����");
			frog.getLaysEggs();
			frog.getGillflag();
		}
	}
