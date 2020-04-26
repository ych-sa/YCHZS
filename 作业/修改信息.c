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
		puts("读取文件Stu_Info3.txt失败。");
		exit(3); 
	}//读取学生信息 
	Student students[100];//定义学生信息指针并申请空间
	for(i=0;i<100;i++){
		fscanf(fp,"%d %s %d %d", &students[i].sno, students[i].name,&students[i].sex, &students[i].college);//读取学生信息并赋值给学生结构体成员
		for(j=0;j<10;j++){
			fscanf(fp,"%d",&students[i].score[j]);
		}
	}//读取学生信息 
	fclose(fp);
	printf("\n输入姓名：");
	scanf("%s",name);
	for(i=0;i<100;i++){
		if(strcmp(students[i].name,name)==0){
			printf("\n学号\t姓名\t性别\t学院\t十门成绩\n");
			printf("%d\t%s\t%d\t%d\t",students[i].sno, students[i].name,students[i].sex, students[i].college);
			for(j=0;j<9;j++){
				printf("%d ",students[i].score[j]);
			}
			tem=i;
			break;//查找到指定学生位置后退出循环 
		}
	}
	if(i<100){
		printf("\n性别代码:1=男，0=女，3=取消填写\n");
		printf("学院代码：\n1 信息学院\n2 计算机学院\n3 文法学院\n4 外国语学院\n");
		printf("5 数理学院\n6 会金学院\n7 化工学院\n8 商学院\n9 航空学院\n10 艺术学院\n");
		printf("依次输入学号  性别 学院(用空格隔开)\n");
		printf("请输入："); 
		scanf("%d %d %d",&students[tem].sno,&students[tem].sex,&students[tem].college);
		printf("请输入十门成绩：");
		for(j=0;j<10;j++){
			printf("\n输入第%d门成绩：",j+1);
			scanf("%d",&students[tem].score[j]);
		}
	}//修改学生信息 
	else{
		printf("未查找到该学生！"); 
	} 
	if((fp=fopen("Stu_Info3.txt","w+"))==NULL){
		puts("读取文件Stu_Info3.txt失败。\n写入失败");
		exit(3); 
	}//读取学生信息 
	for(i=0;i<=99;i++)
	{
		fprintf(fp,"%d %s %d %d ",students[i].sno,students[i].name,students[i].sex,students[i].college);
		for(j=0;j<10;j++)
		{
			fprintf(fp,"%d ",students[i].score[j]);
		}
		fprintf(fp,"\n");
	}//写回文件 
	fclose(fp);
	printf("处理完成\n");
}
