#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct {
	int sno;//学号 
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

void name(){
	int i,j,c;
	int p=0; 
	FILE *fp; 
	if((fp=fopen("Stu_Info3.txt","r"))==NULL){
		puts("读取文件Stu_Info3.txt失败。");
		exit(3); 
	}//读取学生信息 
	Student students[100], S[100],ss;
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//读取学生信息并赋值给学生结构体成员
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	} 
	fclose(fp);	
	for(j=0;j<100;j++){
		S[j]=students[j];}
	for(i=0;i<100-1;i++)
		for(j=i+1;j<100;j++) 
		if(strcmp(S[i].name,S[j].name)>0)
		{
			ss=S[i];
			S[i]=S[j];
			S[j]=ss;
		}
	printf("\n学号\t姓名\t性别\t学院\t十门成绩"); 
	for(i=0;i<100;i++){
		printf("\n%d\t%s\t",S[i].sno,S[i].name);
		switch(S[i].sex){
			case 0:printf("女\t");break;
			case 1:printf("男\t");break;
			case 2:printf("未填\t");break;
		}//懒得读文件 
		switch(S[i].college){
			case 1:printf("信息学院  \t");break;
			case 2:printf("计算机学院\t");break;
			case 3:printf("文法学院  \t");break;
			case 4:printf("外国语学院\t");break;
			case 5:printf("数理学院  \t");break;
			case 6:printf("会金学院  \t");break;
			case 7:printf("化工学院  \t");break;
			case 8:printf("商学院    \t");break;
			case 9:printf("航空学院  \t");break;
			case 10:printf("艺术学院  \t");break;
		}//懒得读文件 
		for(j=0;j<10;j++){
			printf("%d ",S[i].score[j]);
		}
		printf("\n");
	} 	
} 
