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

void readnew(){
	FILE *fp;
	int i,j;
	if((fp=fopen("Stu_Info3.txt","r"))==NULL){
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
	printf("\nѧ��\t����\t�Ա�\tѧԺ\tʮ�ųɼ�"); 
	for(i=0;i<100;i++){
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
}
