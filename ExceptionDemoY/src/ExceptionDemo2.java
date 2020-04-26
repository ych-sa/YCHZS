import java.util.*;
class ILLegalYearException extends Exception{
	ILLegalYearException(){
		//构造方法
	}
	
	ILLegalYearException(String message){
		super(message);//调用Exception的带参数的构造方法
	}
}
class ILLegalSalaryException extends Exception{
	ILLegalSalaryException(){
		//构造方法
	}
	
	ILLegalSalaryException(String message){
		super(message);//调用Exception的带参数的构造方法
	}
}

public class ExceptionDemo2 {

 public static void main(String[] args) {
  double year,salary,bonus=0;
  Scanner sc=new Scanner (System.in);
  System.out.print("请输入入职年数");
  year = sc.nextInt();
  System.out.print("请输入工资");
  salary = sc.nextInt();
  try {
   if(year<0||year>2019) {
    throw new ILLegalYearException();
   }
   if(salary<500) {
    throw new ILLegalSalaryException();
   }
   
   //工龄不足一年：奖金=工资
   if(2019-year==0) {
	   bonus=salary;
   }
   //工龄不足3年：奖金=工资*1.3
   else if(2019-year>0 && 2019-year<3) {
	   bonus=1.3*salary;
   }
   //工龄3年以上、5年以下：奖金=工资*1.5
   else if(2019-year>=3 && 2019-year<5) {
	   bonus=1.5*salary;
   }
   //工龄5年以上：奖金=工资*2
   else if(2019-year>=5) {
	   bonus=2*salary;
   }
   System.out.println("奖金为："+bonus);
  }catch(ILLegalSalaryException ex) {
   System.out.println("无效月工资");
  }catch(ILLegalYearException ex) {
   System.out.println("无效入职年份");
  }
 }
 }
