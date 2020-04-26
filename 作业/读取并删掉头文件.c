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

extern int sel;

//void averagedescend(); 

int readHead(FILE *f);   //��ȡͷ�ļ� 
void readCollege(FILE *f, College *c, int n);   //��ȡѧԺ��Ϣ 
void readSex(FILE *f, Sex *c, int n);           //��ȡ�Ա���Ϣ 
void readStudents(FILE *f, Student *c, int n);     //��ȡѧ����Ϣ 
char *seekCollege(College *c, char *name, int code);   //ת��ѧԺ����Ϊ���� 
char *seekSex(Sex *c, char *name, int code);          //ת���Ա����Ϊ���� 

void read(){
	FILE *fp;
	char s[100],sexname[10],collegename[20];
	int i,sex1,college1,stu,j,re;
	if((fp=fopen("S_Info2.txt","r"))==NULL){
		puts("��ȡ�ļ�S_Info2.txtʧ�ܡ�");
		exit(2); 
	}//��ȡ�Ա��ļ� 
	sex1=readHead(fp);//��ȡ�Ա�����Ŀռ�
	Sex *sex = (Sex *)calloc(sizeof(Sex),sex1);//�����Ա�ָ�벢����ռ� 
	readSex(fp, sex, sex1);//��ȡ�Ա� 
	fclose(fp);
	if((fp=fopen("C_Info1.txt","r"))==NULL){
		puts("��ȡ�ļ�C_Info1.txtʧ�ܡ�");
		exit(1); 
	}//��ȡѧԺ��Ϣ 
	college1=readHead(fp);   //��ȡѧԺ����ռ� 
	College *colleges = (College *)calloc(sizeof(College),college1);// ����ѧԺָ�벢����ռ� 
	readCollege(fp, colleges, college1);//��ȡѧԺ 
	fclose(fp);
	if((fp=fopen("Stu_Info3.txt","r"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�");
		exit(3); 
	}//��ȡѧ����Ϣ 
	while(1){
		fgets(s,100,fp);
		if(s[0]=='#'){
			stu=readHead(fp);
			break;}
			else{
				stu=100;
				break;
			}
	}//��ȡѧ����Ϣ����Ŀռ�
	Student *students = (Student *)calloc(sizeof(Student),stu);//����ѧ����Ϣָ�벢����ռ�
	readStudents(fp, students, stu);//��ȡѧ����Ϣ 
	fclose(fp); 
	for(i=0;i<100;i++)
	{
		fprintf(fp,"%d %s %d %d ",students[i].sno,students[i].name,students[i].sex,students[i].college);
		for(j=0;j<10;j++)
		{
			fprintf(fp,"%d ",students[i].score[j]);
		}
		fprintf(fp,"\n");
	}
	fclose(fp); 
	if((fp=fopen("Stu_Info3.txt","w+"))==NULL){
		puts("��ȡ�ļ�Stu_Info3.txtʧ�ܡ�\nд��ʧ��");
		exit(3); 
	}//��ȡѧ����Ϣ 
	for(i=0;i<100;i++)
	{
		fprintf(fp,"%d %s %d %d ",students[i].sno,students[i].name,students[i].sex,students[i].college);
		for(j=0;j<10;j++)
		{
			fprintf(fp,"%d ",students[i].score[j]);
		}
		fprintf(fp,"\n");
	}//д���ļ� 
	fclose(fp);
	
} 
char *seekCollege(College *c, char *name, int code){
	College *p = c;
	for(;p->code!=code;p++);
	strcpy(name, p->name);//������ת��Ϊ�ַ� 
	return name;
}
char *seekSex(Sex *c, char *name, int code){
	Sex *p = c;
	for(;p->code!=code;p++);
	strcpy(name, p->name);//������ת��Ϊ�ַ�
	return name;
}
int readHead(FILE *f){
	int c;
	char s[100];
	while(1){
	    fgets(s,100,f);//һ��һ�ж� 
	    if(s[0]!='#')
	        break;
	}//��������#���˳�   �����һ����ȡ�������� 
	sscanf(s,"%d",&c);//���ַ��������͵�s������ת��Ϊ���� 
	return c;
}
void readCollege(FILE *f, College *c, int n){
	int i;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s", &c[i].code, c[i].name);//��ȡѧԺ��Ϣ����ֵ��ѧԺ�ṹ���Ա 
	}
}
void readSex(FILE *f, Sex *c, int n){
	int i;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s", &c[i].code, c[i].name);//��ȡ�Ա���Ϣ����ֵ���Ա�ṹ���Ա
	}
}
void readStudents(FILE *f, Student *c, int n){
	int i,j;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s %d %d", &c[i].sno, c[i].name,&c[i].sex, &c[i].college);//��ȡѧ����Ϣ����ֵ��ѧ���ṹ���Ա
		for(j=0;j<10;j++){
			fscanf(f,"%d",&c[i].score[j]);
		}
	}
}
