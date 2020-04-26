import java.util.*;
class ILLegalYearException extends Exception{
	ILLegalYearException(){
		//���췽��
	}
	
	ILLegalYearException(String message){
		super(message);//����Exception�Ĵ������Ĺ��췽��
	}
}
class ILLegalSalaryException extends Exception{
	ILLegalSalaryException(){
		//���췽��
	}
	
	ILLegalSalaryException(String message){
		super(message);//����Exception�Ĵ������Ĺ��췽��
	}
}

public class ExceptionDemo2 {

 public static void main(String[] args) {
  double year,salary,bonus=0;
  Scanner sc=new Scanner (System.in);
  System.out.print("��������ְ����");
  year = sc.nextInt();
  System.out.print("�����빤��");
  salary = sc.nextInt();
  try {
   if(year<0||year>2019) {
    throw new ILLegalYearException();
   }
   if(salary<500) {
    throw new ILLegalSalaryException();
   }
   
   //���䲻��һ�꣺����=����
   if(2019-year==0) {
	   bonus=salary;
   }
   //���䲻��3�꣺����=����*1.3
   else if(2019-year>0 && 2019-year<3) {
	   bonus=1.3*salary;
   }
   //����3�����ϡ�5�����£�����=����*1.5
   else if(2019-year>=3 && 2019-year<5) {
	   bonus=1.5*salary;
   }
   //����5�����ϣ�����=����*2
   else if(2019-year>=5) {
	   bonus=2*salary;
   }
   System.out.println("����Ϊ��"+bonus);
  }catch(ILLegalSalaryException ex) {
   System.out.println("��Ч�¹���");
  }catch(ILLegalYearException ex) {
   System.out.println("��Ч��ְ���");
  }
 }
 }
