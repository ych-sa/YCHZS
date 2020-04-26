package work3;
import java.util.*;
class Car implements Comparable<Car>{
	String carCode;
	String brand;
	String mode;
	String color;
	int price;
	
	Car(){
		
	}
	Car(String carCode,String brand,String mode,String color,int price){
		this.carCode=carCode;
		this.brand=brand;
		this.mode=mode;
		this.color=color;
		this.price=price;
	}
	public int compareTo(Car c) {
		return c.price-this.price;
	}
	public void printCarInfo(){
		System.out.println();
		System.out.print(carCode+"\t    ");
		System.out.print(brand+"\t         ");
		System.out.print(mode+"\t ");
		System.out.print(color+"\t   ");
		System.out.print(price+"\t");
		
	}
}
class CarDealer{
	String dealerName;
	ArrayList<Car>cars;
	
	CarDealer(){
		
	}
	CarDealer(String dealerName){
		this.dealerName=dealerName;
	}
	public void printCarDealerInfo() {
		System.out.println(dealerName);
		System.out.println("����            "+"Ʒ��             "+"����             "+"��ɫ             "+"�۸�            ");
		System.out.println("==========================================================================");
	}
}
class Customer{
	String name;
	HashMap<String,Car>Cars;
	Customer(){
		
	}
	Customer(String name){
		this.name=name;
	}
	public void printCustomerInfo() {
		System.out.println("�˿ͣ�"+name+"\t"+"���򳵣�");
		System.out.println("����            "+"Ʒ��             "+"����             "+"��ɫ             "+"�۸�               "+"����");
		System.out.println("==========================================================================");
	}
}

public class GenericesDemo {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.carCode="CS4634";
		c1.brand="����";
		c1.mode="�ʹ�";
		c1.color="��ɫ";
		c1.price=210000;
		Car c2=new Car();
		c2.carCode="CS1678";
		c2.brand="����";
		c2.mode="����";
		c2.color="��ɫ";
		c2.price=200000;
		Car c3=new Car();
		c3.carCode="CS7789";
		c3.brand="����";
		c3.mode="������";
		c3.color="��ɫ";
		c3.price=180000;
		ArrayList<Car> list1 = new ArrayList<Car>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		CarDealer cd1=new CarDealer("�������ﳵ����������");
		cd1.printCarDealerInfo();
		for(Car c:list1) {
			c.printCarInfo();
		}
		System.out.println();
		System.out.println("************************************************************************************");
		Car c4=new Car();
		c4.carCode="CS9234";
		c4.brand="����";
		c4.mode="�Ÿ�";
		c4.color="��ɫ";
		c4.price=220000;
		Car c5=new Car();
		c5.carCode="CS2344";
		c5.brand="����";
		c5.mode="�ɶ�";
		c5.color="��ɫ";
		c5.price=170000;
		Car c6=new Car();
		c6.carCode="CS6577";
		c6.brand="����";
		c6.mode="˼��";
		c6.color="��ɫ";
		c6.price=180000;
		ArrayList<Car> list2 = new ArrayList<Car>();
		list2.add(c4);
		list2.add(c5);
		list2.add(c6);
		CarDealer cd2=new CarDealer("�������ﳵ����������");
		cd2.printCarDealerInfo();
		for(Car c:list2) {
			c.printCarInfo();
		}
		System.out.println();
		System.out.println("************************************************************************************");
		Car c7=new Car();
		c7.carCode="CS7689";
		c7.brand="���";
		c7.mode="����";
		c7.color="��ɫ";
		c7.price=250000;
		Car c8=new Car();
		c8.carCode="CS4356";
		c8.brand="���";
		c8.mode="��Խ";
		c8.color="��ɫ";
		c8.price=240000;
		Car c9=new Car();
		c9.carCode="CS8122";
		c9.brand="���";
		c9.mode="����";
		c9.color="��ɫ";
		c9.price=230000;
		ArrayList<Car> list3 = new ArrayList<Car>();
		list3.add(c7);
		list3.add(c8);
		list3.add(c9);
		CarDealer cd3=new CarDealer("�Ϻ���˳�����������");
		cd3.printCarDealerInfo();
		for(Car c:list3) {
			c.printCarInfo();
		}
		System.out.println();
		System.out.println("************************************************************************************");
		System.out.println("************************************************************************************");
		HashMap<String,Car> map1=new HashMap<String,Car>();
		map1.put("2013-05-12",c1);
		map1.put("2019-08-22",c4);
		Customer ct1=new Customer("��ΰ��");
		ct1.printCustomerInfo();
		Iterator it=map1.keySet().iterator(); 
		while(it.hasNext()){ 
		     String key=(String)it.next();
		     Car value=(Car)map1.get(key);
		     value.printCarInfo();
		     System.out.println(key); 
		}
		System.out.println("**************************************************************************************");
		HashMap<String,Car> map2=new HashMap<String,Car>();
		map2.put("2013-05-12",c3);
		map2.put("2019-08-22",c9);
		Customer ct2=new Customer("���ǿ");
		ct2.printCustomerInfo();
		Iterator it1=map2.keySet().iterator(); 
		while(it1.hasNext()){ 
		     String key1=(String)it1.next();
		     Car value2=(Car)map2.get(key1);
		     value2.printCarInfo();
		     System.out.println(key1);
		}
		
	}   

}
