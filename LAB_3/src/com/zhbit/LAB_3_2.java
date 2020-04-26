package com.zhbit;
import java.util.Scanner;
class ILLegalYearException extends Exception{
	ILLegalYearException(){
		
	}
	
	ILLegalYearException(String message){
		super(message);
	}
}

class ILLegalSalaryException extends Exception{
	ILLegalSalaryException(){
		
	}
	
	ILLegalSalaryException(String message){
		super(message);
	}
}
class worktime{
    void year(int w)throws ILLegalYearException{

    	if(w<=2019&&w>=0){
    		
    	}else{
    		throw new ILLegalYearException("输入的入职年份为无效入职年份");
    	}
    }
}
class salary{
	void money(int s)throws ILLegalSalaryException{
		if(s>=500){
			
		}else{
			throw new ILLegalSalaryException("输入的工资为无效月工资");
		}
	}
}
public class LAB_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner input =new Scanner(System.in);
    	System.out.println("请输入入职年份：");
       int w=input.nextInt();
try{
	worktime x=new worktime();
	x.year(w);
}catch(ILLegalYearException ex){
	System.out.println("输入了一个无效入职年份");	
	return;//输入了无效入职年份,停止操作,自定义异常
}
Scanner input2 =new Scanner(System.in);
System.out.println("请输入月工资：");
int s=input2.nextInt();
try{
	salary y=new salary();
	y.money(s);
}catch(ILLegalSalaryException ex){
	System.out.println("输入了一个无效月工资");
	return;//输入了无效月工资,停止操作,自定义异常
}
int t;
t=2019-w;
if(t<1){
	System.out.println("工作时间小于一年所得奖金为："+s);
}else if(t>=1&&t<3){
	System.out.println("工作时间在1-3年所得奖金为："+s*1.3);
}else if(t>=3&&t<5){
	System.out.println("工作时间在3-5年所得奖金为："+s*1.5);
}else{
	System.out.println("工作时间五年以上所得奖金为："+s*2);
}	
	}
}

	




