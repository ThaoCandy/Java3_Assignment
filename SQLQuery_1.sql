
CREATE DATABASE QUANLY_SINHVIEN_JAVA3
GO


USE QUANLY_SINHVIEN_JAVA3
GO


CREATE TABLE Users(
    Username NVARCHAR(50) PRIMARY KEY,
    [Password] NVARCHAR(50) NULL,
    [role] NVARCHAR(50) NULL,
)
GO

CREATE TABLE Students(
    MaSV VARCHAR(50) PRIMARY KEY,
    HoTen NVARCHAR(50) NOT NULL,
    Email VARCHAR(150) NOT NULL,
    Sdt VARCHAR(15) NULL,
    GioiTinh BIT DEFAULT 0 NULL,
    DiaChi NVARCHAR(255) NOT NULL,
    Hinh VARCHAR(100) NULL
    
)

CREATE TABLE Grade(
    ID INT IDENTITY PRIMARY KEY,
    MaSV VARCHAR(50) FOREIGN KEY REFERENCES Students(MaSV) UNIQUE,
    TiengAnh float CHECK(TiengAnh >= 0 AND TiengAnh <= 10) NULL,
    TinHoc float CHECK(TinHoc >= 0 AND TinHoc <= 10) NULL,
    GDTC float CHECK(GDTC >= 0 AND GDTC <= 10) NULL,
    
)

-- drop table Grade

insert into Users(Username, [Password], [role]) values
	('thao', '123', 'Admin'),
('nam', 'nam123', 'PDT'),
('linh', 'linh123', 'teacher')

insert into Students(MaSV,HoTen, Email, Sdt, GioiTinh, DiaChi, Hinh)
values ('SV01', N'Liên', 'lien@gmail.com', '0937288424', 1, 'HN', ''),
		('SV02', N'trang', 'trang@gmail.com', '0943288424', 1, 'HD', ''),
		('SV03', N'thu', 'thu@gmail.com', '0945288424', 1, 'ND', ''),
		('SV04', N'quang', 'quang@gmail.com', '0946288424', 1, 'QN', ''),
		('SV05', N'chiến', 'chien@gmail.com', '0941288424', 1, 'HN', ''),
        ('SV06', N'Khang', 'khang@gmail.com', '0937288424', 0, 'HN', '')

insert into Grade(MaSV, TiengAnh, TinHoc, GDTC) values
	('SV01', 8, 8, 9),
('SV02', 5, 8, 7),
('SV03', 8, 5, 9),
('SV04', 6, 8, 8),
('SV05', 5, 6, 7)


go

create or alter proc TP_delete_student_byId @MaSV VARCHAR(50)
	AS BEGIN
		DELETE FROM Grade WHERE MaSV = @MaSV;
        DELETE FROM Students WHERE MaSV = @MaSV;
	END

GO

EXEC TP_delete_student_byId 'SV01';

SELECT * FROM Students
go

CREATE OR ALTER VIEW V_Grade_Student
    AS SELECT g.ID, s.MaSV, g.TiengAnh, g.TinHoc, g.GDTC FROM Students s
    LEFT JOIN Grade g on g.MaSV = s.MaSV
go

SELECT Top 3 * FROM V_Grade_Student ORDER BY (TiengAnh+TinHoc+GDTC)/3 DESC
GO

CREATE OR ALTER PROC TP_SaveNewGrade
    @Id INT,
    @MaSV VARCHAR(50),
    @TiengAnh float,
    @TinHoc float,
    @GDTC float

    AS BEGIN
        if( Select COUNT(*) FROM Grade WHERE MaSV = @MaSV) = 0
            BEGIN
                INSERT INTO Grade(MaSV, TiengAnh, TinHoc, GDTC) VALUES (@MaSV, @TiengAnh, @TinHoc, @GDTC);
            END
        ELSE
            BEGIN
                UPDATE Grade SET TiengAnh = @TiengAnh, TinHoc = @TinHoc, GDTC = @GDTC
                WHERE ID = @Id OR MaSV = @MaSV;
            END
    END

EXEC TP_SaveNewGrade id, masv, ta, th, gdtc

------- LAB3


create DATABASE QuanLyNhanVien
GO

USE QuanLyNhanVien
GO

CREATE TABLE NhanVien(
    MaNV VARCHAR(10) PRIMARY KEY,
    MatKhau VARCHAR(10) NOT NULL,
    DiaChi NVARCHAR(255) NULL,
    GioiTinh BIT DEFAULT 0
)
go

insert into NhanVien(MaNV, MatKhau, DiaChi, GioiTinh) VALUES
    ('NV01', '121', N'Hà Nội', 0),
    ('NV02', '122', N'Hà Nam', 1),
    ('NV03', '123', N'Hà Nội', 1),
    ('NV04', '124', N'Hải Phòng', 0),
    ('NV05', '125', N'Hải Dương', 0)
    
DELETE from NhanVien


----------------------------
create database QuanLyPhongHoc
go
use QuanLyPhongHoc
go
create table Nha
(
	manha uniqueidentifier not null,
	tenNha nvarchar(50) not null,
	tongSoPhong int,
	primary key (manha)

)

create table PhongHoc
(
	maPhong uniqueidentifier not null,
	TenPhong nvarchar(100) not null,
	tang int,
	dienTich float,	
	soSV int,
	maNha uniqueidentifier,
	TrangThai bit,  --1: bận, 0: rảnh
	Ghichu nvarchar(200),
	primary key(maPhong),
	foreign key (maNha) references Nha(maNha)
)
go

insert into Nha(manha, tenNha,tongSoPhong)
values ('1a241616-61d2-43f6-a21e-024d8b34ea74',N'Nhà P',40),
		('76898eeb-45a1-4181-b58d-0a2b9d00e2d6',N'Nhà E',30),
		('71c733c0-f241-454a-bcc9-a39bbe0fd18d',N'Nhà H',20),
		('e0cac81b-d4f0-42b7-b6cf-bc4d7adfaaca',N'Nhà D',40),
		('b2a99881-bd54-4037-8603-f3f162a5ecfd',N'Nhà L',35)

insert into PhongHoc(maPhong, TenPhong, tang,dienTich, soSV, TrangThai, maNha)
values(newid(),N'P201',2,50,40,1,'1a241616-61d2-43f6-a21e-024d8b34ea74'),
	  (newid(),N'E302',3,45,40,0,'76898eeb-45a1-4181-b58d-0a2b9d00e2d6'),
	  (newid(),N'P302',3,50,40,1,'1a241616-61d2-43f6-a21e-024d8b34ea74'),
	  (newid(),N'H401',4,40,40,0,'71c733c0-f241-454a-bcc9-a39bbe0fd18d'),
	  (newid(),N'L105',1,100,200,0,'b2a99881-bd54-4037-8603-f3f162a5ecfd')

alter table Nha 
ADD  DEFAULT (newid()) FOR manha
go
alter table PhongHoc 
ADD  DEFAULT (newid()) FOR maPhong
go


DELETE from PhongHoc WHERE maPhong = ?
Select * FROM Nha
Select * FROM PhongHoc
