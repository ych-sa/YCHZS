#include<stdio.h>
#include <string.h>
#include<stdlib.h>

#define SIZE 100
#define SEX_SIZE 2
#define ACADEMY_SIZE 10

//定义和声明学生性别结构体 
struct student_sex{
	int no;					//性别代号 
	char sex_name[10];		//性别名称 
}sex[SEX_SIZE];

//定义和声明学院结构体
struct student_academy{
	int no;				    //学院代号 
	char academy_name[50];  //学院名称 
}academy[ACADEMY_SIZE];

//定义和声明学生信息结构体
struct student_type{
	int num;         //学号 
	char name[20];   //姓名 
	int sex;	     //性别 
	int grade;		 //学院 
	int score1;      //10个成绩 
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

//读取三个文件的所有信息 
void loadInfo(){
	int i;
	FILE * fp;//定义文件指针 
	//读取学生信息 
	fp=fopen("Student_Info.txt","rb");	//打开学生数据文件 
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
		);//将读到的数据放到结构体里面 

	}
	
	//读取学院信息 
	fp=fopen("C_Info.txt","rb");
	for(i=0;i<ACADEMY_SIZE;i++){
		fscanf(fp,"%d %s",&academy[i].no,&academy[i].academy_name);
	
	}
	//读取性别信息 
	fp=fopen("S_Info.txt","rb");
	for(i=0;i<SEX_SIZE;i++){
		fscanf(fp,"%d %s",&sex[i].no,&sex[i].sex_name);
	
	}
	fclose(fp);
}

//输出所有学生信息 
void outPutStuInfo(){
int i,j;
    //转换性别与学院 
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

//输出所有文件信息 
void showAllInfo(){
int i;	
	printf("\n\n***************学生相关信息*********************\n");
	outPutStuInfo();
	
	printf("\n\n***************学院相关信息*********************\n");	
	for(i=0;i<ACADEMY_SIZE;i++){
	
		printf("%d %s\n",academy[i].no,academy[i].academy_name);
	}
	
	printf("\n\n***************性别相关信息*********************\n");
	for(i=0;i<SEX_SIZE;i++){
	
		printf("%d %s\n",sex[i].no,sex[i].sex_name);
	}
}

//展示操作菜单 
int menu(){
	system("CLS");   //每次调用新指令时候执行清屏 
	printf("\n");
    printf("                ~欢迎使用学生信息管理系统~              \n"); 
	printf("|---------------------学生信息管理---------------------|\n"); 
	printf("| 1.原始文件读取                                       |\n"); 
	printf("| 2.按照姓名排序                                       |\n"); 
	printf("| 3.按照平均成绩排序                                   |\n"); 
	printf("| 4.输出给定学院学生                                   |\n"); 
	printf("| 5.修改给定学生成绩信息                               |\n"); 
	printf("| 6.按姓名查询学生                                     |\n");
	printf("| 7.修改系统密码*                                      |\n"); 
	printf("| 8.退出系统                                           |\n");
	printf("|------------------------------------------------------|\n");
	printf("请选择（1-8）："); 
	//获取一个整数并且return出去 
	fflush(stdin);//清空缓存区，防止输入字符串时出错 
	int opration;//定义操作指令 
	scanf("%d", &opration);
	return opration; 
}
 

//交换两个结构体 
void swapStudent(struct student_type *student1 ,struct student_type *student2){ 
	//在冒泡排序里运用 
	struct student_type  temp;//定义一个中间变量结构体 
	temp = *student1;
	*student1 = *student2;
	*student2 = temp;//地址交换 
	
}

//根据名称进行排序 
void sortByName(){
	int i; int j;
	 //冒泡法排序 
    for (i = 0; i < SIZE; i++)  //每个人都循环一次 
    {  
        for (j = i + 1; j < SIZE; j++)  //保证两个两个之间循环 
        {  
            if (strcmp(stud[i].name,stud[j].name)>0)//比较前后两个名字的大小，若括号中为真，则i名字比j名字大，执行交换，以此类推 
            {
				swapStudent(&stud[i], &stud[j]);    //执行交换 
                      
            }  
        }  
    }	
	printf("--------------字典序排序学生结果----------------\n");
	outPutStuInfo();  	 
}

//根据平均分进行排序 
void sortByAvg(){
	int i; int j;
	float avg1;
	float avg2;
	 //排序，从小到大   冒泡排序 
    for (i = 0; i < SIZE; i++)  //每个人都循环一次 
    {  
        for (j = i + 1; j < SIZE; j++)  //每两人比较一次 
        {  
            //计算平均数 
        	avg1 = (stud[i].score1 + stud[i].score2 + stud[i].score3 + stud[i].score4 + stud[i].score5 + stud[i].score6 + stud[i].score7 + stud[i].score8 + stud[i].score9 + stud[i].score10)/10; 
        	avg2 = (stud[j].score1 + stud[j].score2 + stud[j].score3 + stud[j].score4 + stud[j].score5 + stud[j].score6 + stud[j].score7 + stud[j].score8 + stud[j].score9 + stud[j].score10)/10; 
		 	if (avg1>avg2)
            {
				swapStudent(&stud[i], &stud[j]);    //执行交换 
                      
            }  
        }  
    }	
	printf("-------------------平均成绩排序结果-------------------\n");
	float perAvg;//定义一个平均数字符 
	for(i=0;i<SIZE;i++){
		//转换性别和学院 
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
			perAvg  //平均成绩 
		);
	} 
}

//根据学院名称展示学生信息 
void showStuByAcademy(){
	printf("\n\n请输入学院名称：");
	char name[20];//定义一个数组 
	scanf("%s", &name);
	int flag = 0;    //初始化一个变量表示是否输入的学员名称存在 0不存在 1存在 
	int no ;         //输入学院名称所对应的学员代号 
	int i;
	//验证学院是否存在 
	for(i=0;i<ACADEMY_SIZE;i++){
		if(strcmp(academy[i].academy_name,name)==0)//输入的字符与结构体比较 
		 {
			flag=1;
			no = academy[i].no;
			break;
		}
	}
	if(flag==0){
		printf("学院名称不存在，请重新输入\n");
	} else{
		printf("\n\n----------------学院的相关学生-----------------\n");
		for(i=0;i<SIZE;i++){
		    //转换性别与学院 
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
			if(no==stud[i].grade){   //判断为当前输入的学院所对应的学院代号 等于 学生的学院代号才输出 
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

//编辑学生信息 
void editStuScore(){
	loadInfo();//读取信息 
	printf("\n------------------现有学生信息---------------\n");
	outPutStuInfo();//输出一次 
	printf("\n\n请输入需要修改成绩的学号:\n");
	int no;
	scanf("%d", &no);
	int flag = 0;    //初始化一个变量表示是否输入的学号存在  0不存在 1存在 
	int i;
	for(i=0;i<SIZE;i++){
		if(stud[i].num==no) {//你输入的学号 
			//printf("学院名称存在");
			flag=1;
			i=i;
			break;
		}
	}
	if(flag==0){
		printf("学号不存在，请重新输入\n");
	}else{
		printf("\n\n请输入学生10个科目的成绩:\n");
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
		
		//转换性别与学院 
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
		printf("修改后的学生成绩为\n");
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
	
		//执行保存操作 
		FILE * fp2;//重新定义一个文件 
		unlink("Student_Info.txt");      //先删除文件 再创建一个文件全部重新写入 
		fp2=fopen("Student_Info.txt","w+"); 
		//全部重新写入 
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
			fputs("\n",fp2);  //每一行末尾添加一个回车 
		}  
        fclose(fp2);  
	}
} 

//根据名称获取学生信息
void getOneByName(){
	printf("\n\n请输入需要查询信息的学生姓名:");
	char name[20];
	scanf("%s", &name);
	//printf("%s",name);
	int flag=0;
	int i;
	for(i=0;i<SIZE;i++){
		if(strcmp(stud[i].name,name)==0) {
			//printf("学院名称存在");
			printf("\n找到该学生信息:\n");
			flag=1;
			//转换性别和学院 
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
		printf("没有找到该学生信息-_-\n");
	}
}

//密码验证 
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
	printf("请输入密码：");
	while(1)     
	{
		scanf("%s",m);
		if(strcmp(n,m)==0)break;
		else 
		{
			system("cls");
			printf("密码错误，请重新输入：");
		}
	} 
}

//密码修改
change(){
	password();
	system("cls");
	char new[20];
	FILE *fp;
	printf("请输入新密码：");
	scanf("%s",new);
	if((fp=fopen("password.txt","w"))==NULL)
	{
		printf("can not open file\n");
		exit(0);
	} 
	fprintf(fp,"%s",new);
	fclose(fp);
	system("cls");
	printf("修改成功!\n按任意键返回主菜单。");
	
}
//程序主入口 
int main(){
	printf("你好，欢迎使用学生信息管理系统！\n"); 
	password();
	loadInfo();               //加载三个文件的信息 
	int  opration;            //声明一个变量存放当前的操作指令 
	int loop=1;	
	while(loop){	
		opration = menu();   //根据不同的参数执行不同的函数方法 
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
				printf("\n\n退出系统......");loop=0;  break;
			default:  //数字输入错误，跳出siwtch语句，进入下一次循环     
			printf("输入有误，请输入数字1~8。\n");break;   
		}
		system("pause");
	}

	return 0;
}
