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
    		throw new ILLegalYearException("�������ְ���Ϊ��Ч��ְ���");
    	}
    }
}
class salary{
	void money(int s)throws ILLegalSalaryException{
		if(s>=500){
			
		}else{
			throw new ILLegalSalaryException("����Ĺ���Ϊ��Ч�¹���");
		}
	}
}
public class LAB_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner input =new Scanner(System.in);
    	System.out.println("��������ְ��ݣ�");
       int w=input.nextInt();
try{
	worktime x=new worktime();
	x.year(w);
}catch(ILLegalYearException ex){
	System.out.println("������һ����Ч��ְ���");	
	return;//��������Ч��ְ���,ֹͣ����,�Զ����쳣
}
Scanner input2 =new Scanner(System.in);
System.out.println("�������¹��ʣ�");
int s=input2.nextInt();
try{
	salary y=new salary();
	y.money(s);
}catch(ILLegalSalaryException ex){
	System.out.println("������һ����Ч�¹���");
	return;//��������Ч�¹���,ֹͣ����,�Զ����쳣
}
int t;
t=2019-w;
if(t<1){
	System.out.println("����ʱ��С��һ�����ý���Ϊ��"+s);
}else if(t>=1&&t<3){
	System.out.println("����ʱ����1-3�����ý���Ϊ��"+s*1.3);
}else if(t>=3&&t<5){
	System.out.println("����ʱ����3-5�����ý���Ϊ��"+s*1.5);
}else{
	System.out.println("����ʱ�������������ý���Ϊ��"+s*2);
}	
	}
}

	




