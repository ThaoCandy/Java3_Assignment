CREATE DATABASE IT18106_LAB5_6_HangNT169;
GO


USE IT18106_LAB5_6_HangNT169;
GO


CREATE TABLE SinhVien (
	id uniqueidentifier DEFAULT newId() NOT NULL,
	ten_phong_hoc varchar(100) NULL,
	ten_sinh_vien nvarchar(100) NULL,
	diem_toan float NULL,
	diem_ly float NULL,
	diem_hoa float NULL,
	tuoi int NULL,
	dia_chi nvarchar(100) NULL,
	CONSTRAINT LopHoc_PK PRIMARY KEY (id)
);



CREATE TABLE  DongVat (
	id uniqueidentifier DEFAULT newID() NOT NULL,
	ten_dong_vat nvarchar(100) NULL,
	gioi_tinh bit NULL,
	can_nang int NULL,
	nam_sinh int NULL,
	loai_dong_vat nvarchar(100) NULL,
	CONSTRAINT DongVat_PK PRIMARY KEY (id)
);

GO

select * from SinhVien

INSERT INTO SinhVien
(ten_phong_hoc, ten_sinh_vien, diem_toan, diem_ly, diem_hoa, tuoi, dia_chi)
VALUES(N'P303', N'Bùi Thu B', 8.0, 8.0, 7.0, 18, N'Hà Nội');
INSERT INTO SinhVien
(ten_phong_hoc, ten_sinh_vien, diem_toan, diem_ly, diem_hoa, tuoi, dia_chi)
VALUES(N'P303', N'Nguyễn Văn A', 10.0, 9.0, 8.0, 25, N'Hà Nội');
GO

-- "update SinhVien set ten_phong_hoc = ?, ten_sinh_vien = ?, diem_toan = ?, diem_ly = ?, diem_hoa =?, tuoi=?, dia_chi=? where id = ?"

-- "delete from SinhVien where id = ?"



INSERT INTO DongVat
(ten_dong_vat, gioi_tinh, can_nang, nam_sinh, loai_dong_vat)
VALUES( N'Chó', 0, 4, 2005, N'Động Vật Trong Nhà');
INSERT INTO DongVat
( ten_dong_vat, gioi_tinh, can_nang, nam_sinh, loai_dong_vat)
VALUES( N'Cá cảnh', 1, 1, 2004, N'Động Vật Sống Dưới Nưóc');

SELECT * FROM SinhVien WHERE ( (diem_hoa + diem_ly + diem_toan) / 3 ) BETWEEN 5 AND 8