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
	int average; 
}Student;
typedef struct{
	int code;
	char name[8];
}Sex;
typedef struct{
	int code;
	char name[12];
}College;


void averagedescend()//ƽ���ֽ������� 
{		
	int i,j,c;
	int p=0; 
	FILE *fp; 
	if((fp=fopen("Stu_Info3.txt","r"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�");
		exit(3); 
	}//��ȡѧ����Ϣ 
	Student students[100]; 
	Student S[100],ss;
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//��ȡѧ����Ϣ����ֵ��ѧ���ṹ���Ա
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	} 
	fclose(fp);	
	for(j=0;j<100;j++){
		S[j]=students[j];}//��ָ�������Ϣ����ṹ�� 
	for(i=0;j<100;i++){
		for(j=0;j<10;j++){
			p+=S[i].score[j];
		}
		S[i].sum=p;
		S[i].average=(float)p/10;}//����10���ܷ�    ��������10��һ��	
	for(i=0;i<100-1;i++){
		for(j=i+1;j<100;j++){
			if(S[i].average<S[j].average){
				ss=S[i];
				S[i]=S[j];
				S[j]=ss;}//ð������ 
		}}
	printf("\nѧ��\t����\t�Ա�\tѧԺ\tʮ�ųɼ�"); 
	for(i=0;i<100;i++){
		printf("\n%d\t%s\t",S[i].sno,S[i].name);
		switch(S[i].sex){
			case 0:printf("Ů\t");break;
			case 1:printf("��\t");break;
			case 2:printf("δ��\t");break;
		}//���ö��ļ� 
		switch(S[i].college){
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
			printf("%d ",S[i].score[j]);
		}
		printf("\n");
	} 
}
