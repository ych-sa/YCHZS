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

void menu();//�˵� 
void read();//��ȡԭʼ�ļ� ��ȥ��ͷ�ļ� 
void averagedescend();//ƽ���ֽ������� 
void seekname();//�������Ҳ��޸���Ϣ 
void readnew();//�������ļ� 
void seekcollege();//ָ��ѧԺ���� 
void name(); 

int sel;//�˵���  

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
	printf("\n���ز˵�����1���˳�����0.\n�����룺");
	scanf("%d",&r) ;
	if(r==1){
		goto L1;//ǿ�з��ز˵� 
	}
	return 0;
}
