/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.sql.*;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.connectDB.DaoEntity;
import poly.edu.model.NhanVien;

/**
 *
 * @author user
 */
public class DaoNhanVien extends DaoEntity<NhanVien> {

    public DaoNhanVien() {
        this.getList();
    }

    @Override
    public void getList() {
        list.clear();
        try {
            ResultSet q1 = conn.createStatement().executeQuery("Select * from NhanVien");
            while (q1.next()) {
                list.add(new NhanVien(q1.getString("maNV"), q1.getString("hoTen"),
                        q1.getString("ngaySinh"), q1.getString("gioiTinh"), q1.getString("chucVu")));
            }
            System.out.println("Lấy danh sách Nhân Viên thành công!");
            for (NhanVien nhanVien : list) {
                System.out.println(nhanVien.toString());
            }
        } catch (Exception e) {
            System.out.println("Lấy danh sách Nhân Viên thất bại!");
            list.clear();
            e.printStackTrace(System.out);
        }
    }

    @Override
    public boolean insert(NhanVien nv) {
        try {

            PreparedStatement pre = conn.prepareStatement("insert into NhanVien (hoTen, ngaySinh, gioiTinh, chucVu) values (?, ?, ?, ?)");
            pre.setObject(1, nv.getHoTen());
            pre.setObject(2, nv.getNgaySinh());
            pre.setObject(3, nv.isGioiTinh() ? "0" : "1");
            pre.setObject(4, nv.getMaCV());

            pre.executeUpdate();
            System.out.println("Thêm thành công 1 nhân viên");
            getList();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    @Override
    public boolean update(NhanVien nv) {
        try {
            PreparedStatement pre = conn.prepareStatement("Update NhanVien set hoTen = ?, ngaySinh = ?, gioiTinh = ?, chucVu = ? where maNV = ?");
            pre.setObject(1, nv.getHoTen());
            pre.setObject(2, nv.getNgaySinh());
            pre.setObject(3, nv.isGioiTinh() ? "0" : "1");
            pre.setObject(4, nv.getMaCV());

            pre.setObject(5, nv.getMaNV());

            pre.executeUpdate();
            System.out.println("Update thành công 1 nhân viên");
            getList();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
    }

    @Override
    public boolean delete(NhanVien nv) {
        try {
            PreparedStatement pre = conn.prepareStatement("Delete from NhanVien where maNV = ?");
            pre.setObject(1, nv.getMaNV());
            pre.executeUpdate();
            System.out.println("Xóa thành công");
            getList();
            return true;
        } catch (SQLException ex) {
            System.out.println("Xóa thất bại");
            ex.printStackTrace(System.out);
            return false;
        }
    }

    @Override
    public NhanVien find(Serializable id) {
        try {
            for (NhanVien nv : list) {
                if (nv.getMaNV().equals(id)) {
                    return nv;
                }
            }
            return null;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            return null;
        }
    }

}
