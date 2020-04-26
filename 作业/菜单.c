#include <stdio.h>
extern int sel;
void menu(){
	printf("**********学生成绩系统***********\n");
	printf("1.查看原始文件\n");  
	printf("2.按姓名排序，输出\n");
	printf("3.按平均成绩排序，输出\n");  
	printf("4.输出指定学院学生信息\n");    
	printf("5.按姓名查找指定学生信息并修改\n");  
	printf("*******************************\n");
	printf("请选择：");
	scanf("%d",&sel);
	switch(sel){
		case 1:
			printf("\n选择 查看原始文件\n");  
			break;
		case 2:
			printf("\n选择 按姓名排序，输出\n");  
			break;
		case 3:
			printf("\n选择 按平均成绩排序，输出\n");  
			break;
		case 4:
			printf("\n选择 输出指定学院学生信息\n");  
			break;
		case 5:
			printf("\n选择 按姓名查找指定学生信息并修改\n");  
			break;
		default:
			printf("选择错误\n");
	}
}

