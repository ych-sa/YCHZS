import java.util.*;
public class random {

	public static void main(String[] args) {
		int[] count=new int[13];
		Random r=new Random();
		for(int i=0;i<5000;i++) {
			int sum = r.nextInt(6) + 1 + r.nextInt(6) + 1;
			count[sum]++;
		}
		System.out.println("数值和各点数出现总次数如下：");
		for(int i=2;i<=12;i++) {
			System.out.print(i+"：");
			System.out.println(count[i]+"次");
		}
	}

}