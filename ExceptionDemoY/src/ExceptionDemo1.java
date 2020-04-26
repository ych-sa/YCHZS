public class ExceptionDemo1 {
	public static void main (String[] args) {
		try{
			float[] a=new float[5];
			float sum=0;
			for(int i=0;i<a.length;i++){
			a[i]=Float.parseFloat(args[i]);
			System.out.println ("第"+(i+1)+"门课程的成绩是:"+a[i]);
			sum=sum+a[i];
			}
			System.out.println("总成绩是："+sum);
			float avg=sum/a.length;
			System.out.println ("平均成绩是:"+avg);
			}
		catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
			System.out.println("数组下标越界异常");}
		catch(NumberFormatException ex){
			ex.printStackTrace();
			System.out.println("数字格式转换异常");}
		catch(ArithmeticException ex){
			ex.printStackTrace();
			System.out.println("算术异常：除数为零");}
		catch(Exception ex){
			ex.printStackTrace();}
    }
}
