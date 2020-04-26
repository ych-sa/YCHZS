#include<stdio.h>
#include <string.h>
#include<stdlib.h>

#define SIZE 100
#define SEX_SIZE 2
#define ACADEMY_SIZE 10

//���������ѧ���Ա�ṹ�� 
struct student_sex{
	int no;					//�Ա���� 
	char sex_name[10];		//�Ա����� 
}sex[SEX_SIZE];

//���������ѧԺ�ṹ��
struct student_academy{
	int no;				    //ѧԺ���� 
	char academy_name[50];  //ѧԺ���� 
}academy[ACADEMY_SIZE];

//���������ѧ����Ϣ�ṹ��
struct student_type{
	int num;         //ѧ�� 
	char name[20];   //���� 
	int sex;	     //�Ա� 
	int grade;		 //ѧԺ 
	int score1;      //10���ɼ� 
	int score2;
	int score3;
	int score4;
	int score5;
	int score6;
	int score7;
	int score8;
	int score9;
	int score10;
}stud[SIZE];

//��ȡ�����ļ���������Ϣ 
void loadInfo(){
	int i;
	FILE * fp;//�����ļ�ָ�� 
	//��ȡѧ����Ϣ 
	fp=fopen("Student_Info.txt","rb");	//��ѧ�������ļ� 
	for(i=0;i<SIZE;i++){
		fscanf(fp, "%d %s %d %d %d %d %d %d %d %d %d %d %d %d", 
			&stud[i].num,
			&stud[i].name,
			&stud[i].sex,
			&stud[i].grade,
			&stud[i].score1,
			&stud[i].score2,
			&stud[i].score3,
			&stud[i].score4,
			&stud[i].score5,
			&stud[i].score6,
			&stud[i].score7,
			&stud[i].score8,
			&stud[i].score9,
			&stud[i].score10
		);//�����������ݷŵ��ṹ������ 

	}
	
	//��ȡѧԺ��Ϣ 
	fp=fopen("C_Info.txt","rb");
	for(i=0;i<ACADEMY_SIZE;i++){
		fscanf(fp,"%d %s",&academy[i].no,&academy[i].academy_name);
	
	}
	//��ȡ�Ա���Ϣ 
	fp=fopen("S_Info.txt","rb");
	for(i=0;i<SEX_SIZE;i++){
		fscanf(fp,"%d %s",&sex[i].no,&sex[i].sex_name);
	
	}
	fclose(fp);
}

//�������ѧ����Ϣ 
void outPutStuInfo(){
int i,j;
    //ת���Ա���ѧԺ 
	for(i=0;i<SIZE;i++){
		char student_sex[10];
		char acadamy_name[200];
		for(j=0;j<SEX_SIZE;j++){
			if(stud[i].sex == sex[j].no){
				strcpy(student_sex,sex[j].sex_name);
				
			}
		}
		
		for(j=0;j<ACADEMY_SIZE;j++){
			if(stud[i].grade == academy[j].no){
				strcpy(acadamy_name,academy[j].academy_name);
			}
		}
		 
		printf("%d %s %s %-10s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d\n", 
			stud[i].num,
			stud[i].name,
			student_sex,
			acadamy_name,
			stud[i].score1,
			stud[i].score2,
			stud[i].score3,
			stud[i].score4,
			stud[i].score5,
			stud[i].score6,
			stud[i].score7,
			stud[i].score8,
			stud[i].score9,
			stud[i].score10
		);
	}
}

//��������ļ���Ϣ 
void showAllInfo(){
int i;	
	printf("\n\n***************ѧ�������Ϣ*********************\n");
	outPutStuInfo();
	
	printf("\n\n***************ѧԺ�����Ϣ*********************\n");	
	for(i=0;i<ACADEMY_SIZE;i++){
	
		printf("%d %s\n",academy[i].no,academy[i].academy_name);
	}
	
	printf("\n\n***************�Ա������Ϣ*********************\n");
	for(i=0;i<SEX_SIZE;i++){
	
		printf("%d %s\n",sex[i].no,sex[i].sex_name);
	}
}

//չʾ�����˵� 
int menu(){
	system("CLS");   //ÿ�ε�����ָ��ʱ��ִ������ 
	printf("\n");
    printf("                ~��ӭʹ��ѧ����Ϣ����ϵͳ~              \n"); 
	printf("|---------------------ѧ����Ϣ����---------------------|\n"); 
	printf("| 1.ԭʼ�ļ���ȡ                                       |\n"); 
	printf("| 2.������������                                       |\n"); 
	printf("| 3.����ƽ���ɼ�����                                   |\n"); 
	printf("| 4.�������ѧԺѧ��                                   |\n"); 
	printf("| 5.�޸ĸ���ѧ���ɼ���Ϣ                               |\n"); 
	printf("| 6.��������ѯѧ��                                     |\n");
	printf("| 7.�޸�ϵͳ����*                                      |\n"); 
	printf("| 8.�˳�ϵͳ                                           |\n");
	printf("|------------------------------------------------------|\n");
	printf("��ѡ��1-8����"); 
	//��ȡһ����������return��ȥ 
	fflush(stdin);//��ջ���������ֹ�����ַ���ʱ���� 
	int opration;//�������ָ�� 
	scanf("%d", &opration);
	return opration; 
}
 

//���������ṹ�� 
void swapStudent(struct student_type *student1 ,struct student_type *student2){ 
	//��ð������������ 
	struct student_type  temp;//����һ���м�����ṹ�� 
	temp = *student1;
	*student1 = *student2;
	*student2 = temp;//��ַ���� 
	
}

//�������ƽ������� 
void sortByName(){
	int i; int j;
	 //ð�ݷ����� 
    for (i = 0; i < SIZE; i++)  //ÿ���˶�ѭ��һ�� 
    {  
        for (j = i + 1; j < SIZE; j++)  //��֤��������֮��ѭ�� 
        {  
            if (strcmp(stud[i].name,stud[j].name)>0)//�Ƚ�ǰ���������ֵĴ�С����������Ϊ�棬��i���ֱ�j���ִ�ִ�н������Դ����� 
            {
				swapStudent(&stud[i], &stud[j]);    //ִ�н��� 
                      
            }  
        }  
    }	
	printf("--------------�ֵ�������ѧ�����----------------\n");
	outPutStuInfo();  	 
}

//����ƽ���ֽ������� 
void sortByAvg(){
	int i; int j;
	float avg1;
	float avg2;
	 //���򣬴�С����   ð������ 
    for (i = 0; i < SIZE; i++)  //ÿ���˶�ѭ��һ�� 
    {  
        for (j = i + 1; j < SIZE; j++)  //ÿ���˱Ƚ�һ�� 
        {  
            //����ƽ���� 
        	avg1 = (stud[i].score1 + stud[i].score2 + stud[i].score3 + stud[i].score4 + stud[i].score5 + stud[i].score6 + stud[i].score7 + stud[i].score8 + stud[i].score9 + stud[i].score10)/10; 
        	avg2 = (stud[j].score1 + stud[j].score2 + stud[j].score3 + stud[j].score4 + stud[j].score5 + stud[j].score6 + stud[j].score7 + stud[j].score8 + stud[j].score9 + stud[j].score10)/10; 
		 	if (avg1>avg2)
            {
				swapStudent(&stud[i], &stud[j]);    //ִ�н��� 
                      
            }  
        }  
    }	
	printf("-------------------ƽ���ɼ�������-------------------\n");
	float perAvg;//����һ��ƽ�����ַ� 
	for(i=0;i<SIZE;i++){
		//ת���Ա��ѧԺ 
		char student_sex[10];
		char acadamy_name[20];
		int j;
		for(j=0;j<SEX_SIZE;j++){
			if(stud[i].sex == sex[j].no){
				strcpy(student_sex,sex[j].sex_name);
				
			}
		}
		
		for(j=0;j<ACADEMY_SIZE;j++){
			if(stud[i].grade == academy[j].no){
				
				strcpy(acadamy_name,academy[j].academy_name);
			}
		}
		perAvg = (stud[i].score1 + stud[i].score2 + stud[i].score3 + stud[i].score4 + stud[i].score5 + stud[i].score6 + stud[i].score7 + stud[i].score8 + stud[i].score9 + stud[i].score10)/10 ;
		printf("%d %s %s %-10s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d %3.2f\n", 
			stud[i].num,
			stud[i].name,
			student_sex,
			acadamy_name,
			stud[i].score1,
			stud[i].score2,
			stud[i].score3,
			stud[i].score4,
			stud[i].score5,
			stud[i].score6,
			stud[i].score7,
			stud[i].score8,
			stud[i].score9,
			stud[i].score10,
			perAvg  //ƽ���ɼ� 
		);
	} 
}

//����ѧԺ����չʾѧ����Ϣ 
void showStuByAcademy(){
	printf("\n\n������ѧԺ���ƣ�");
	char name[20];//����һ������ 
	scanf("%s", &name);
	int flag = 0;    //��ʼ��һ��������ʾ�Ƿ������ѧԱ���ƴ��� 0������ 1���� 
	int no ;         //����ѧԺ��������Ӧ��ѧԱ���� 
	int i;
	//��֤ѧԺ�Ƿ���� 
	for(i=0;i<ACADEMY_SIZE;i++){
		if(strcmp(academy[i].academy_name,name)==0)//������ַ���ṹ��Ƚ� 
		 {
			flag=1;
			no = academy[i].no;
			break;
		}
	}
	if(flag==0){
		printf("ѧԺ���Ʋ����ڣ�����������\n");
	} else{
		printf("\n\n----------------ѧԺ�����ѧ��-----------------\n");
		for(i=0;i<SIZE;i++){
		    //ת���Ա���ѧԺ 
			char student_sex[10];
		    char acadamy_name[20];
		    int j;
		       for(j=0;j<SEX_SIZE;j++){
			     if(stud[i].sex == sex[j].no){
				    strcpy(student_sex,sex[j].sex_name);
				
			}
		}
		
		       for(j=0;j<ACADEMY_SIZE;j++){
			     if(stud[i].grade == academy[j].no){
				    strcpy(acadamy_name,academy[j].academy_name);
			}
		}
			if(no==stud[i].grade){   //�ж�Ϊ��ǰ�����ѧԺ����Ӧ��ѧԺ���� ���� ѧ����ѧԺ���Ų���� 
				printf("%d %s %s %-10s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d\n", 
					stud[i].num,
					stud[i].name,
					student_sex,
					acadamy_name,
					stud[i].score1,
					stud[i].score2,
					stud[i].score3,
					stud[i].score4,
					stud[i].score5,
					stud[i].score6,
					stud[i].score7,
					stud[i].score8,
					stud[i].score9,
					stud[i].score10
					
				);
				
				
			}
		}
	} 
	
}

//�༭ѧ����Ϣ 
void editStuScore(){
	loadInfo();//��ȡ��Ϣ 
	printf("\n------------------����ѧ����Ϣ---------------\n");
	outPutStuInfo();//���һ�� 
	printf("\n\n��������Ҫ�޸ĳɼ���ѧ��:\n");
	int no;
	scanf("%d", &no);
	int flag = 0;    //��ʼ��һ��������ʾ�Ƿ������ѧ�Ŵ���  0������ 1���� 
	int i;
	for(i=0;i<SIZE;i++){
		if(stud[i].num==no) {//�������ѧ�� 
			//printf("ѧԺ���ƴ���");
			flag=1;
			i=i;
			break;
		}
	}
	if(flag==0){
		printf("ѧ�Ų����ڣ�����������\n");
	}else{
		printf("\n\n������ѧ��10����Ŀ�ĳɼ�:\n");
		int score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
		scanf("%d %d %d %d %d %d %d %d %d %d", &score1,&score2,&score3,&score4,&score5,&score6,&score7,&score8,&score9,&score10);
		
		stud[i].score1  =  score1;
		stud[i].score2  =  score2;
		stud[i].score3  =  score3;
		stud[i].score4  =  score4;
		stud[i].score5  =  score5;
		stud[i].score6  =  score6;
		stud[i].score7  =  score7;
		stud[i].score8  =  score8;
		stud[i].score9  =  score9;
		stud[i].score10 =  score10;
		
		//ת���Ա���ѧԺ 
		char student_sex[10];
		char acadamy_name[200];
		int j;
		for(j=0;j<SEX_SIZE;j++){
			if(stud[i].sex == sex[j].no){
				strcpy(student_sex,sex[j].sex_name);
				
			}
		}
		
		for(j=0;j<ACADEMY_SIZE;j++){
			if(stud[i].grade == academy[j].no){
				strcpy(acadamy_name,academy[j].academy_name);
			}
		}
		printf("�޸ĺ��ѧ���ɼ�Ϊ\n");
		printf("%d %s %s %s %d %d %d %d %d %d %d %d %d %d\n", 
					stud[i].num,
					stud[i].name,
					student_sex,
					acadamy_name,
					stud[i].score1,
					stud[i].score2,
					stud[i].score3,
					stud[i].score4,
					stud[i].score5,
					stud[i].score6,
					stud[i].score7,
					stud[i].score8,
					stud[i].score9,
					stud[i].score10
					
		);
	
		//ִ�б������ 
		FILE * fp2;//���¶���һ���ļ� 
		unlink("Student_Info.txt");      //��ɾ���ļ� �ٴ���һ���ļ�ȫ������д�� 
		fp2=fopen("Student_Info.txt","w+"); 
		//ȫ������д�� 
		int i;
		for(i=0;i<SIZE;i++){
			fprintf(fp2, "%d %s %d %d %d %d %d %d %d %d %d %d %d %d",
					stud[i].num,
					stud[i].name,
					stud[i].sex,
					stud[i].grade,
					stud[i].score1,
					stud[i].score2,
					stud[i].score3,
					stud[i].score4,
					stud[i].score5,
					stud[i].score6,
					stud[i].score7,
					stud[i].score8,
					stud[i].score9,
					stud[i].score10
			);
			fputs("\n",fp2);  //ÿһ��ĩβ���һ���س� 
		}  
        fclose(fp2);  
	}
} 

//�������ƻ�ȡѧ����Ϣ
void getOneByName(){
	printf("\n\n��������Ҫ��ѯ��Ϣ��ѧ������:");
	char name[20];
	scanf("%s", &name);
	//printf("%s",name);
	int flag=0;
	int i;
	for(i=0;i<SIZE;i++){
		if(strcmp(stud[i].name,name)==0) {
			//printf("ѧԺ���ƴ���");
			printf("\n�ҵ���ѧ����Ϣ:\n");
			flag=1;
			//ת���Ա��ѧԺ 
			char student_sex[10];
		    char acadamy_name[20];
		    int j;     
				 for(j=0;j<SEX_SIZE;j++){
			         if(stud[i].sex == sex[j].no){
				         strcpy(student_sex,sex[j].sex_name);
				
			}
		}
		
		         for(j=0;j<ACADEMY_SIZE;j++){
			        if(stud[i].grade == academy[j].no){ 
				        strcpy(acadamy_name,academy[j].academy_name);
			}
		}
			printf("%d %s %s %-10s %3d %3d %3d %3d %3d %3d %3d %3d %3d %3d\n", 
					stud[i].num,
					stud[i].name,
					student_sex,
					acadamy_name,
					stud[i].score1,
					stud[i].score2,
					stud[i].score3,
					stud[i].score4,
					stud[i].score5,
					stud[i].score6,
					stud[i].score7,
					stud[i].score8,
					stud[i].score9,
					stud[i].score10
					
			);
				
			break;
		} 
	}
	if(flag==0){
		printf("û���ҵ���ѧ����Ϣ-_-\n");
	}
}

//������֤ 
password(){
	char m[20],n[20];
	int i;
	FILE *fp;
	if((fp=fopen("password.txt","rb"))==NULL)
	{
		printf("can not open file\n");
		exit(0);
	} 
	for(i=0;i<20;i++)
	{
		fscanf(fp,"%s",n); 
	}
	fclose(fp);
	printf("���������룺");
	while(1)     
	{
		scanf("%s",m);
		if(strcmp(n,m)==0)break;
		else 
		{
			system("cls");
			printf("����������������룺");
		}
	} 
}

//�����޸�
change(){
	password();
	system("cls");
	char new[20];
	FILE *fp;
	printf("�����������룺");
	scanf("%s",new);
	if((fp=fopen("password.txt","w"))==NULL)
	{
		printf("can not open file\n");
		exit(0);
	} 
	fprintf(fp,"%s",new);
	fclose(fp);
	system("cls");
	printf("�޸ĳɹ�!\n��������������˵���");
	
}
//��������� 
int main(){
	printf("��ã���ӭʹ��ѧ����Ϣ����ϵͳ��\n"); 
	password();
	loadInfo();               //���������ļ�����Ϣ 
	int  opration;            //����һ��������ŵ�ǰ�Ĳ���ָ�� 
	int loop=1;	
	while(loop){	
		opration = menu();   //���ݲ�ͬ�Ĳ���ִ�в�ͬ�ĺ������� 
		switch(opration){
			case 1:
				showAllInfo();	break;	
			case 2:
				sortByName();break;
			case 3:
				sortByAvg(); break;
			case 4:
				showStuByAcademy(); break;
			case 5:
				editStuScore();break;
			case 6:
				getOneByName();break;
			case 7:
				 change();break; 
			case 8:
				printf("\n\n�˳�ϵͳ......");loop=0;  break;
			default:  //���������������siwtch��䣬������һ��ѭ��     
			printf("������������������1~8��\n");break;   
		}
		system("pause");
	}

	return 0;
}
