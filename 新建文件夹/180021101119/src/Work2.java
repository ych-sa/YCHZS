import java.util.*;

public class Work2 {
	public static void bing() {
		HashSet<Integer> a1 = new HashSet<Integer>(Arrays.asList(1,2,3,4));
		HashSet<Integer> a2 = new HashSet<Integer>(Arrays.asList(1,3,7,9,11));
		
		a1.addAll(a2);
		System.out.println(a1);
	}
	public static void jiao() {
		HashSet<Integer> a1 = new HashSet<Integer>(Arrays.asList(1,2,3,4));
		HashSet<Integer> a2 = new HashSet<Integer>(Arrays.asList(1,3,7,9,11));
		
		a1.retainAll(a2);
		System.out.println(a1);
	}
	public static void cha() {
		HashSet<Integer> a1 = new HashSet<Integer>(Arrays.asList(1,2,3,4));
		HashSet<Integer> a2 = new HashSet<Integer>(Arrays.asList(1,3,7,9,11));
		
		a1.removeAll(a2);
		System.out.println(a1);
	}
	public static void main(String[] args) {
		System.out.print("A和B的并集：");
		bing();
		System.out.println();
		System.out.print("A和B的交集：");
		jiao();
		System.out.println();
		System.out.print("A和B的差集：");
		cha();
		System.out.println();
	}
}
