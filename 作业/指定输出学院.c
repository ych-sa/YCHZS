#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct {
	int sno;
	char name[8];
	int sex;
	int college;
	int score[10];
	int sum;
	float average; 
}Student;
typedef struct{
	int code;
	char name[8];
}Sex;
typedef struct{
	int code;
	char name[12];
}College;

void seekcollege(){
	int i,j,k;
	FILE *fp; 
	if((fp=fopen("Stu_Info3.txt","r+"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�");
		exit(3); 
	}//��ȡѧ����Ϣ 
	Student students[100];//����ѧ����Ϣ
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//��ȡѧ����Ϣ����ֵ��ѧ���ṹ���Ա
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	}//��ȡѧ����Ϣ 
	fclose(fp);
	printf("ѡ��ѧԺ��");
	printf("\n1.��ϢѧԺ\n2.�����ѧԺ\n3.�ķ�ѧԺ\n4.�����ѧԺ\n5.����ѧԺ\n");
	printf("6.���ѧԺ\n7.����ѧԺ\n8.��ѧԺ\n9.����ѧԺ\n10.����ѧԺ\n");
	printf("��ѡ��");
	scanf("%d",&k);//ѡ��ѧԺ 
	printf("\nѧ��\t����\t�Ա�\tѧԺ\tʮ�ųɼ�"); 
	for(i=0;i<100;i++){
		if((students[i].college)==k){
			printf("\n%d\t%s\t",students[i].sno,students[i].name);
		switch(students[i].sex){
			case 0:printf("Ů\t");break;
			case 1:printf("��\t");break;
			case 2:printf("δ��\t");break;
		}//���ö��ļ� 
		switch(students[i].college){
			case 1:printf("��ϢѧԺ  \t");break;
			case 2:printf("�����ѧԺ\t");break;
			case 3:printf("�ķ�ѧԺ  \t");break;
			case 4:printf("�����ѧԺ\t");break;
			case 5:printf("����ѧԺ  \t");break;
			case 6:printf("���ѧԺ  \t");break;
			case 7:printf("����ѧԺ  \t");break;
			case 8:printf("��ѧԺ    \t");break;
			case 9:printf("����ѧԺ  \t");break;
			case 10:printf("����ѧԺ  \t");break;
		}//���ö��ļ� 
		for(j=0;j<10;j++){
			printf("%d ",students[i].score[j]);
		}
		printf("\n");
		}
	}//ѡ��ѧԺѧ����Ϣ 	 
} 
