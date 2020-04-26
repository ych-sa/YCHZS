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

int readHead(FILE *f);   //读取头文件 
void readCollege(FILE *f, College *c, int n);   //读取学院信息 
void readSex(FILE *f, Sex *c, int n);           //读取性别信息 
void readStudents(FILE *f, Student *c, int n);     //读取学生信息 
char *seekCollege(College *c, char *name, int code);   //转换学院代码为中文 
char *seekSex(Sex *c, char *name, int code);          //转换性别代码为中文 

void read(){
	FILE *fp;
	char s[100],sexname[10],collegename[20];
	int i,sex1,college1,stu,j,re;
	if((fp=fopen("S_Info2.txt","r"))==NULL){
		puts("读取文件S_Info2.txt失败。");
		exit(2); 
	}//读取性别文件 
	sex1=readHead(fp);//读取性别所需的空间
	Sex *sex = (Sex *)calloc(sizeof(Sex),sex1);//定义性别指针并申请空间 
	readSex(fp, sex, sex1);//读取性别 
	fclose(fp);
	if((fp=fopen("C_Info1.txt","r"))==NULL){
		puts("读取文件C_Info1.txt失败。");
		exit(1); 
	}//读取学院信息 
	college1=readHead(fp);   //读取学院所需空间 
	College *colleges = (College *)calloc(sizeof(College),college1);// 定义学院指针并申请空间 
	readCollege(fp, colleges, college1);//读取学院 
	fclose(fp);
	if((fp=fopen("Stu_Info3.txt","r"))==NULL){
		puts("读取文件Stu_Info3.txt失败。");
		exit(3); 
	}//读取学生信息 
	while(1){
		fgets(s,100,fp);
		if(s[0]=='#'){
			stu=readHead(fp);
			break;}
			else{
				stu=100;
				break;
			}
	}//读取学生信息所需的空间
	Student *students = (Student *)calloc(sizeof(Student),stu);//定义学生信息指针并申请空间
	readStudents(fp, students, stu);//读取学生信息 
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
		puts("读取文件Stu_Info3.txt失败。\n写入失败");
		exit(3); 
	}//读取学生信息 
	for(i=0;i<100;i++)
	{
		fprintf(fp,"%d %s %d %d ",students[i].sno,students[i].name,students[i].sex,students[i].college);
		for(j=0;j<10;j++)
		{
			fprintf(fp,"%d ",students[i].score[j]);
		}
		fprintf(fp,"\n");
	}//写回文件 
	fclose(fp);
	
} 
char *seekCollege(College *c, char *name, int code){
	College *p = c;
	for(;p->code!=code;p++);
	strcpy(name, p->name);//将代码转换为字符 
	return name;
}
char *seekSex(Sex *c, char *name, int code){
	Sex *p = c;
	for(;p->code!=code;p++);
	strcpy(name, p->name);//将代码转换为字符
	return name;
}
int readHead(FILE *f){
	int c;
	char s[100];
	while(1){
	    fgets(s,100,f);//一行一行读 
	    if(s[0]!='#')
	        break;
	}//读到不是#便退出   输出下一个读取到的内容 
	sscanf(s,"%d",&c);//讲字符数组类型的s的内容转换为整型 
	return c;
}
void readCollege(FILE *f, College *c, int n){
	int i;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s", &c[i].code, c[i].name);//读取学院信息并赋值给学院结构体成员 
	}
}
void readSex(FILE *f, Sex *c, int n){
	int i;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s", &c[i].code, c[i].name);//读取性别信息并赋值给性别结构体成员
	}
}
void readStudents(FILE *f, Student *c, int n){
	int i,j;
	for(i=0;i<n;i++){
		fscanf(f,"%d %s %d %d", &c[i].sno, c[i].name,&c[i].sex, &c[i].college);//读取学生信息并赋值给学生结构体成员
		for(j=0;j<10;j++){
			fscanf(f,"%d",&c[i].score[j]);
		}
	}
}
