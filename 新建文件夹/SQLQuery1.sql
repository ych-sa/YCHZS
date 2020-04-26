Create database exp8
go
use exp8
--�����������ֱ���ѧ�����γ̱��ѧ��ѡ�α�

CREATE TABLE  Student  (
  Sno     char ( 10 )    PRIMARY KEY,
  Sname char ( 10 ) NOT NULL,
  Ssex    char (2)  
             CHECK (Ssex = '��' OR Ssex = 'Ů'), 
  Sage    tinyint  
         CHECK (Sage >= 15 AND Sage <=45),
  Sdept   char (20 )  DEFAULT  '�����ϵ'
)
go

CREATE TABLE  Course  (
  Cno    char(4)  NOT NULL,
  Cname  char(20)  NOT NULL,
  Ccredit  tinyint  CHECK (Ccredit > 0),  
  Period  int  CHECK (Period > 0),
  PRIMARY  KEY(Cno) 
) 
go

CREATE TABLE  SC  (
  Sno    char(10)  NOT NULL,
  Cno   char(4)  NOT NULL,
  Grade  tinyint,
  CHECK (Grade >= 0 and Grade <= 100),
  PRIMARY KEY ( Sno, Cno ),
  FOREIGN KEY ( Sno )  
       REFERENCES  Student ( Sno ),
  FOREIGN KEY ( Cno )  
      REFERENCES  Course ( Cno )     
)
go

--�ֱ������������в������ݣ�
Insert into student values('2006010101','����','��',19,default)
Insert into student values('2006010102','����','��',21,default)
Insert into student values('2006010103','��С','��',20,'��ѧϵ')
Insert into student values('2006010104','���','Ů',18,'����ϵ')
Insert into student values('2006010105','����','Ů',19,'����ϵ')
go

Insert into Course values('J001','TC',2,32)
Insert into Course values('J002','VB',2,32)
Insert into Course values('J003','VC',2,32)
Insert into Course values('J004','������Ļ�����',2,32)
go

Insert into SC values('2006010101','J001',85)
Insert into SC values('2006010101','J002',80)
Insert into SC values('2006010101','J003',78)
Insert into SC values('2006010101','J004',90)

Insert into SC values('2006010102','J001',75)
Insert into SC values('2006010102','J002',60)
Insert into SC values('2006010102','J003',77)
Insert into SC values('2006010102','J004',92)

Insert into SC values('2006010103','J001',85)
Insert into SC values('2006010103','J003',90)

Insert into SC values('2006010104','J004',89)
Insert into SC values('2006010105','J004',76)
Go

CREATE Procedure sp_DispSC_Sdept
@sdept varchar(20) = '�����ϵ'
AS
SELECT S.Sno,Sname,Sdept,C.Cname,SC.Grade
FROM Student S
Left Join SC on S.sno = SC.Sno
Left Join Course C on SC.Cno = C.Cno
WHERE Sdept = @sdept
go
EXECUTE sp_DispSC_Sdept
EXECUTE sp_DispSC_Sdept '��Ϣϵ'
EXECUTE sp_DispSC_Sdept '��ѧϵ'
go

CREATE Procedure sp_2
@cname varchar(20) = TC
AS
SELECT avg(Grade) as ƽ����,Cname
FROM SC
Left Join Course C on SC.Cno = C.Cno
WHERE Cname = @cname
GROUP BY Cname
go
EXECUTE sp_2 TC
EXECUTE sp_2 VB
EXECUTE sp_2 VC
EXECUTE sp_2 '������Ļ�����'
go

CREATE Procedure sp_3
@level varchar(6),@sdept varchar(20) = '�����ϵ'
AS
Declare @SQLText varchar(200),@GradeStr varchar(30)
Set @SQLText='Select S.sno, S.sname, S.Sdept, C.Cname, SC.grade 
From Student S 
Left Join SC on S.sno=SC.sno Left Join Course C on SC.Cno=C.cno'
Set @GradeStr= Case 
WHEN @level = '��' then 'between 90 and 100'
WHEN @level = '��' then 'between 80 and 89'
WHEN @level = '��' then 'between 70 and 79'
WHEN @level = '����' then 'between 60 and 69'
WHEN @level = '������' then 'between 0 and 59'
Else  'LevelError' 
end
IF @GradeStr='LevelError' 
      print '��������ĳɼ��ȼ�������Ҫ��'
Else
      Execute(@SQLText+' where Sdept='''+@sdept +''' And Grade '+@GradeStr)
GO
EXECUTE sp_3 @level = '��'
Execute sp_3 @level = '��',@sdept = '��ѧϵ'
Execute sp_3 @level = '����'