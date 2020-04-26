import java.util.*;
public class DiceGame {

	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		
		int x,y;
		int[] sum= new int[5000];
		for (int i1 = 0; i1 < 5000; i1++) {
			x = r1.nextInt(6)+1;
			y = r2.nextInt(6)+1;
			sum[i1] = x + y;
			}
		int[] a = new int[11];
		for (int l = 0; l < 2500; l++) {
			if(sum[l] == 2) 
				a[0]++;
			else if(sum[l] == 3)
				a[1]++;
			else if(sum[l] == 4)
				a[2]++;
			else if(sum[l] == 5)
				a[3]++;
			else if(sum[l] == 6)
				a[4]++;
			else if(sum[l] == 7)
				a[5]++;
			else if(sum[l] == 8)
				a[6]++;
			else if(sum[l] == 9)
				a[7]++;
			else if(sum[l] == 10)
				a[8]++;
			else if(sum[l] == 11)
				a[9]++;
			else if(sum[l] == 12)
				a[10]++;
			
			}
		System.out.println("2:"+a[0]+"次\t"+"3:"+a[1]+"次\t"+"4:"+a[2]+"次\t"+"5:"+a[3]+"次\t"+"6:"+a[4]+"次\t"+"7:"+a[5]+"次");
		System.out.println("8:"+a[6]+"次\t"+"9:"+a[7]+"次\t"+"10:"+a[8]+"次\t"+"11:"+a[9]+"次\t"+"12:"+a[10]+"次\t");
		System.out.println("Process complete");
		
		}	
}

	

