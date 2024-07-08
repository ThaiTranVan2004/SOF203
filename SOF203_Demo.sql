/*
 Navicat Premium Dump SQL

 Source Server         : SQL Server
 Source Server Type    : SQL Server
 Source Server Version : 15002000 (15.00.2000)
 Source Catalog        : SOF203
 Source Schema         : dbo

 Target Server Type    : SQL Server
 Target Server Version : 15002000 (15.00.2000)
 File Encoding         : 65001

 Date: 08/07/2024 17:08:02
*/
USE master
GO
CREATE DATABASE SOF203
GO
USE SOF203
GO

-- ----------------------------
-- Table structure for MauSac
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[MauSac]') AND type IN ('U'))
	DROP TABLE [dbo].[MauSac]
GO

CREATE TABLE [dbo].[MauSac] (
  [Id] int  IDENTITY(1,1) NOT NULL,
  [Ma] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [Ten] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [TrangThai] int  NULL
)
GO

ALTER TABLE [dbo].[MauSac] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of MauSac
-- ----------------------------
SET IDENTITY_INSERT [dbo].[MauSac] ON
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'1', N'Ma001', N'Ten001', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'2', N'Ma002', N'Ten002', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'4', N'Ma004', N'Ten004', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'5', N'Color005', N'ColorName005', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'6', N'Ma006', N'Ten006', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'7', N'Ma007', N'Ten007', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'8', N'Ma008', N'Ten008', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'9', N'Ma009', N'Ten009', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'10', N'Ma010', N'Ten010', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'11', N'Ma011', N'Ten011', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'12', N'Ma012', N'Ten012', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'13', N'Ma013', N'Ten013', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'14', N'Ma014', N'Ten014', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'15', N'Ma015', N'Ten015', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'16', N'Ma016', N'Ten016', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'17', N'Ma017', N'Ten017', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'18', N'Ma018', N'Ten018', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'19', N'Ma019', N'Ten019', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'20', N'Ma020', N'Ten020', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'21', N'Ma021', N'Ten021', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'22', N'Ma022', N'Ten022', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'23', N'Ma023', N'Ten023', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'24', N'Ma024', N'Ten024', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'25', N'Ma025', N'Ten025', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'26', N'Ma026', N'Ten026', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'27', N'Ma027', N'Ten027', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'28', N'Ma028', N'Ten028', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'29', N'Ma029', N'Ten029', N'1')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'30', N'Ma030', N'Ten030', N'0')
GO

INSERT INTO [dbo].[MauSac] ([Id], [Ma], [Ten], [TrangThai]) VALUES (N'31', N'Ma003', N'Ten003', N'1')
GO

SET IDENTITY_INSERT [dbo].[MauSac] OFF
GO


-- ----------------------------
-- Table structure for SanPham
-- ----------------------------
IF EXISTS (SELECT * FROM sys.all_objects WHERE object_id = OBJECT_ID(N'[dbo].[SanPham]') AND type IN ('U'))
	DROP TABLE [dbo].[SanPham]
GO

CREATE TABLE [dbo].[SanPham] (
  [Id] int  IDENTITY(1,1) NOT NULL,
  [TenSP] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [SoLuongTon] int  NULL,
  [DanhMuc] nvarchar(50) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
  [TrangThai] int  NULL
)
GO

ALTER TABLE [dbo].[SanPham] SET (LOCK_ESCALATION = TABLE)
GO


-- ----------------------------
-- Records of SanPham
-- ----------------------------
SET IDENTITY_INSERT [dbo].[SanPham] ON
GO

INSERT INTO [dbo].[SanPham] ([Id], [TenSP], [SoLuongTon], [DanhMuc], [TrangThai]) VALUES (N'1', N'Sản phẩm 001', N'12', N'Tiểu học', N'1')
GO

INSERT INTO [dbo].[SanPham] ([Id], [TenSP], [SoLuongTon], [DanhMuc], [TrangThai]) VALUES (N'3', N'Sản phẩm 003', N'80', N'Trung học', N'0')
GO

INSERT INTO [dbo].[SanPham] ([Id], [TenSP], [SoLuongTon], [DanhMuc], [TrangThai]) VALUES (N'4', N'Sản phẩm 002', N'100', N'Mẫu giáo', N'1')
GO

SET IDENTITY_INSERT [dbo].[SanPham] OFF
GO


-- ----------------------------
-- Auto increment value for MauSac
-- ----------------------------
DBCC CHECKIDENT ('[dbo].[MauSac]', RESEED, 31)
GO


-- ----------------------------
-- Primary Key structure for table MauSac
-- ----------------------------
ALTER TABLE [dbo].[MauSac] ADD CONSTRAINT [PK__MauSac__3214EC075742C648] PRIMARY KEY CLUSTERED ([Id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)  
ON [PRIMARY]
GO


-- ----------------------------
-- Auto increment value for SanPham
-- ----------------------------
DBCC CHECKIDENT ('[dbo].[SanPham]', RESEED, 1000)
GO


-- ----------------------------
-- Primary Key structure for table SanPham
-- ----------------------------
ALTER TABLE [dbo].[SanPham] ADD CONSTRAINT [PK__SanPham__3214EC077BD075B1] PRIMARY KEY CLUSTERED ([Id])
WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)  
ON [PRIMARY]
GO

