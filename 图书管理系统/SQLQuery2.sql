USE [BookDB]
GO

/****** Object:  Table [dbo].[Book]    Script Date: 2018/11/08 22:19:18 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Book](
	[BookID] [varchar](20) NOT NULL,
	[BookName] [varchar](50) NULL,
	[Author] [varchar](30) NULL,
	[Press] [varchar](40) NULL,
	[PressDate] [varchar](10) NULL,
	[status] [varchar](10) NULL,
 CONSTRAINT [PK_Book] PRIMARY KEY CLUSTERED 
(
	[BookID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO


insert into book values('123456','java','测试人员','北大出版社','2010-10-10','在库');