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

void menu();//菜单 
void read();//读取原始文件 并去掉头文件 
void averagedescend();//平均分降序排列 
void seekname();//姓名查找并修改信息 
void readnew();//读入新文件 
void seekcollege();//指定学院查找 
void name(); 

int sel;//菜单用  

int main(){
	int r;
	read();
L1:	menu();
	if(sel==1){
		readnew(); 
	}
	if(sel==2){
		name();
	}
	if(sel==3){
		averagedescend();
	}
	if(sel==4){
		seekcollege();
	}
	if(sel==5){
		seekname();
	}
	printf("\n返回菜单输入1，退出输入0.\n请输入：");
	scanf("%d",&r) ;
	if(r==1){
		goto L1;//强行返回菜单 
	}
	return 0;
}
