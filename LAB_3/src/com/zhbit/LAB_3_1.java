package com.zhbit;

public class LAB_3_1 {
	public static void main (String[] args) {
		float[] a=new float[5];
		float sum=0;
		try {
		for(int i=0;i<a.length;i++){
			a[i]=Float.parseFloat(args[i]);
			System.out.println ("第"+(i+1)+"门课程的成绩是:"+a[i]);
			sum=sum+a[i];
		}
		System.out.println("总成绩是："+sum);
		float avg=sum/a.length;
		System.out.println ("平均成绩是:"+avg);
		}catch(NumberFormatException ex) {
	    	System.out.println("数组格式异常");
	    }catch(ArrayIndexOutOfBoundsException ex) {
		    System.out.println("数组下标越界");
    }
	}
}


