#include <stdio.h>
extern int sel;
void menu(){
	printf("**********ѧ���ɼ�ϵͳ***********\n");
	printf("1.�鿴ԭʼ�ļ�\n");  
	printf("2.�������������\n");
	printf("3.��ƽ���ɼ��������\n");  
	printf("4.���ָ��ѧԺѧ����Ϣ\n");    
	printf("5.����������ָ��ѧ����Ϣ���޸�\n");  
	printf("*******************************\n");
	printf("��ѡ��");
	scanf("%d",&sel);
	switch(sel){
		case 1:
			printf("\nѡ�� �鿴ԭʼ�ļ�\n");  
			break;
		case 2:
			printf("\nѡ�� �������������\n");  
			break;
		case 3:
			printf("\nѡ�� ��ƽ���ɼ��������\n");  
			break;
		case 4:
			printf("\nѡ�� ���ָ��ѧԺѧ����Ϣ\n");  
			break;
		case 5:
			printf("\nѡ�� ����������ָ��ѧ����Ϣ���޸�\n");  
			break;
		default:
			printf("ѡ�����\n");
	}
}

