import java.util.*;

public class CardsDemo {

	public static void main(String[] args) {
		//定义扑克牌花色
		 String[] colors={"黑桃","红桃","梅花","方块"};
		 //定义数字
		 String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		 
		 //制作一副扑克牌
		 Vector cards=new Vector();
		 for(int i=0;i<colors.length;i++){
			 for(int j=0;j<nums.length;j++){
				 //添加元素
				 cards.add(colors[i]+nums[j]);
			 }
		 }
		 
		 //打印新的扑克牌
		 for(int i=0;i<cards.size();i++){
			 System.out.print(cards.get(i));
			 if((i+1)%13==0){
				 System.out.println();
			 }
		 }
		 
		 //洗牌
		 System.out.println("******************************");
		 Collections.shuffle(cards);//随机混合  shuffle混合 
		 //再次打印
		 for(int i=0;i<cards.size();i++){
			 System.out.print(cards.get(i));
			 if((i+1)%13==0){
				 System.out.println();
			 }
		 }
	}

}
