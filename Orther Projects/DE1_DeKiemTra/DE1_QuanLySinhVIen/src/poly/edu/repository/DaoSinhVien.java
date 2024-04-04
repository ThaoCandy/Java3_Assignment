/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import poly.edu.model.SinhVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DaoSinhVien extends DaoEntity<SinhVien> {

    
    @Override
    public ArrayList<SinhVien> getList() {
        try {
            list.clear();
            ResultSet re = conn.createStatement().executeQuery("select * from SinhVien");
            while (re.next()) {
                int t = -1;
                if(re.getString("tuoi") != null){
                    t = Integer.valueOf(re.getString("tuoi"));
                }
                list.add(new SinhVien(re.getString("id"), re.getString("ten_sinh_vien"), re.getString("dia_chi"),
                        t,
                        re.getString("ten_phong_hoc"),
                        Double.valueOf(re.getString("diem_toan")),
                        Double.valueOf(re.getString("diem_ly")),
                        Double.valueOf(re.getString("diem_hoa"))));
            }
            System.out.println("Lấy ds SV thành công.");
          
            list.forEach(e -> {
                System.out.println(e.toString());
            });

        } catch (SQLException ex) {
            list.clear();
            Logger.getLogger(DaoSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    
    @Override
    public boolean insert(SinhVien sv) {
        try {
            PreparedStatement pre = conn.prepareStatement("INSERT INTO SinhVien (ten_phong_hoc, ten_sinh_vien, diem_toan, diem_ly, diem_hoa) "
                    + "VALUES(?, ?, ?, ?, ?)");
            pre.setObject(1, sv.getPhongHoc());
            pre.setObject(2, sv.getHoTen());
            pre.setObject(3, Double.valueOf(sv.getToan()));
            pre.setObject(4, Double.valueOf(sv.getLy()));
            pre.setObject(5, Double.valueOf(sv.getHoa()));

            pre.executeUpdate();
            System.out.println("Thêm vào bảng trên DB thành công");
            return true;
        } catch (SQLException ex) {
            System.out.println("Thêm vào bảng trên DB thất bại");
            Logger.getLogger(DaoSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(SinhVien sv) {
        try {
            PreparedStatement pre = conn.prepareStatement("delete from SinhVien where id = ?");
            pre.setObject(1, sv.getMaSV());
            
            pre.executeUpdate();
            System.out.println("Xóa thành công");
            return true;
        } catch (SQLException ex) {
            System.out.println("Xóa thất bại");
            Logger.getLogger(DaoSinhVien.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    boolean update(SinhVien ent) {
        return true;
    }

    @Override
    boolean find(Serializable id) {
        return true;
    }
    

}
