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
char sex(int n);

void seekname(){
	int i,j,tem;
	char name[20];
	FILE *fp; 
	if((fp=fopen("Stu_Info3.txt","r+"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�");
		exit(3); 
	}//��ȡѧ����Ϣ 
	Student students[100];//����ѧ����Ϣָ�벢����ռ�
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//��ȡѧ����Ϣ����ֵ��ѧ���ṹ���Ա
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	}//��ȡѧ����Ϣ 
	fclose(fp);
	printf("\n����������");
	scanf("%s",name);
	for(i=0;i<100;i++){
		if(strcmp(students[i].name,name)==0){
			printf("\nѧ��\t����\t�Ա�\tѧԺ\tʮ�ųɼ�\n");
			printf("%d\t%s\t%d\t%d\t",students[i].sno, students[i].name,students[i].sex, students[i].college);
			for(j=0;j<9;j++){
				printf("%d ",students[i].score[j]);
			}
			tem=i;
			break;//���ҵ�ָ��ѧ��λ�ú��˳�ѭ�� 
		}
	}
	if(i<100){
		printf("\n�Ա����:1=�У�0=Ů��3=ȡ����д\n");
		printf("ѧԺ���룺\n1 ��ϢѧԺ\n2 �����ѧԺ\n3 �ķ�ѧԺ\n4 �����ѧԺ\n");
		printf("5 ����ѧԺ\n6 ���ѧԺ\n7 ����ѧԺ\n8 ��ѧԺ\n9 ����ѧԺ\n10 ����ѧԺ\n");
		printf("��������ѧ��  �Ա� ѧԺ(�ÿո����)\n");
		printf("�����룺"); 
		scanf("%d %d %d",&students[tem].sno,&students[tem].sex,&students[tem].college);
		printf("������ʮ�ųɼ���");
		for(j=0;j<10;j++){
			printf("\n�����%d�ųɼ���",j+1);
			scanf("%d",&students[tem].score[j]);
		}
	}//�޸�ѧ����Ϣ 
	else{
		printf("δ���ҵ���ѧ����"); 
	} 
	if((fp=fopen("Stu_Info3.txt","w+"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�\nд��ʧ��");
		exit(3); 
	}//��ȡѧ����Ϣ 
	for(i=0;i<=99;i++)
	{
		fprintf(fp,"%d %s %d %d ",students[i].sno,students[i].name,students[i].sex,students[i].college);
		for(j=0;j<10;j++)
		{
			fprintf(fp,"%d ",students[i].score[j]);
		}
		fprintf(fp,"\n");
	}//д���ļ� 
	fclose(fp);
	printf("�������\n");
}
