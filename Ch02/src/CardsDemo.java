import java.util.*;

public class CardsDemo {

	public static void main(String[] args) {
		//�����˿��ƻ�ɫ
		 String[] colors={"����","����","÷��","����"};
		 //��������
		 String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		 
		 //����һ���˿���
		 Vector cards=new Vector();
		 for(int i=0;i<colors.length;i++){
			 for(int j=0;j<nums.length;j++){
				 //���Ԫ��
				 cards.add(colors[i]+nums[j]);
			 }
		 }
		 
		 //��ӡ�µ��˿���
		 for(int i=0;i<cards.size();i++){
			 System.out.print(cards.get(i));
			 if((i+1)%13==0){
				 System.out.println();
			 }
		 }
		 
		 //ϴ��
		 System.out.println("******************************");
		 Collections.shuffle(cards);//������  shuffle��� 
		 //�ٴδ�ӡ
		 for(int i=0;i<cards.size();i++){
			 System.out.print(cards.get(i));
			 if((i+1)%13==0){
				 System.out.println();
			 }
		 }
	}

}
