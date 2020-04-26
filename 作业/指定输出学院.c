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
		puts("读取文件Stu_Info3.txt失败。");
		exit(3); 
	}//读取学生信息 
	Student students[100];//定义学生信息
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//读取学生信息并赋值给学生结构体成员
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	}//读取学生信息 
	fclose(fp);
	printf("选择学院：");
	printf("\n1.信息学院\n2.计算机学院\n3.文法学院\n4.外国语学院\n5.数理学院\n");
	printf("6.会金学院\n7.化工学院\n8.商学院\n9.航空学院\n10.艺术学院\n");
	printf("请选择：");
	scanf("%d",&k);//选择学院 
	printf("\n学号\t姓名\t性别\t学院\t十门成绩"); 
	for(i=0;i<100;i++){
		if((students[i].college)==k){
			printf("\n%d\t%s\t",students[i].sno,students[i].name);
		switch(students[i].sex){
			case 0:printf("女\t");break;
			case 1:printf("男\t");break;
			case 2:printf("未填\t");break;
		}//懒得读文件 
		switch(students[i].college){
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
			printf("%d ",students[i].score[j]);
		}
		printf("\n");
		}
	}//选择学院学生信息 	 
} 
