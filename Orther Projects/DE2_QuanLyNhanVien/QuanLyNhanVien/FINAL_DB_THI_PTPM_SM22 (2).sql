create database DE2_QuanLyNhanVien
go

use DE2_QuanLyNhanVien
go

create table ChucVu
	(
		maCV int identity primary key not null,
		tenCV nvarchar(100) not null
	)
go

create table NhanVien
	(
		maNV int identity primary key not null,
		hoTen nvarchar(50) not null,
		ngaySinh date null,
		gioiTinh bit default 0 not null,
		chucVu int not null foreign key references ChucVu(maCV)
	)
go

insert into ChucVu(tenCV) values 
	(N'Giám đốc'), (N'Trưởng phòng'), (N'Phó phòng'),(N'Nhân Viên'),(N'Bảo vệ') ;

insert into NhanVien (hoTen, ngaySinh, gioiTinh, chucVu) values
	('thu thao', '1999-11-14', 1, 2),
	('hao nam', '1995-10-04', 0, 1)

	select * from NhanVien

