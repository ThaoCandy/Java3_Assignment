/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.util.ArrayList;
import poly.edu.model.KhachHang;
import poly.edu.util.JdbcUtil;
import java.sql.*;

/**
 *
 * @author user
 */
public class KhachHangRepository extends JdbcUtil {

    public ArrayList<KhachHang> list = new ArrayList<>();

    public KhachHangRepository() {
        list = getList(); // lấy danh sách ban đầu;
    }

    private ArrayList<KhachHang> getList() {
        list.clear();

        try {
            ResultSet re = conn.createStatement().executeQuery("Select * from khach_hang");
            while (re.next()) {
                list.add(new KhachHang(re.getString("id"),
                        re.getString("ten"),
                        re.getString("dia_chi"),
                        re.getString("email"),
                        Integer.valueOf(re.getString("tuoi")),
                        re.getString("gioi_tinh").equals("0") ? true : false));
            }
            System.out.println("lấy danh sách khách hàng thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi: lấy danh sách khách hàng từ database thất bại");
            list.clear();
            e.printStackTrace(System.out);
        }
        return list;
    }

    protected boolean reInsert(KhachHang kh) {
        try {
            PreparedStatement pre = conn.prepareStatement("INSERT INTO khach_hang (ten, dia_chi, email, tuoi, gioi_tinh) VALUES (?, ?, ?, ?, ?)");
            pre.setObject(1, kh.getTen());
            pre.setObject(2, kh.getDiaChi());
            pre.setObject(3, kh.getEmail());
            pre.setObject(4, kh.getTuoi());
            pre.setObject(5, kh.isGioiTinh() ? Integer.valueOf(0) : Integer.valueOf(1));
            
            pre.executeUpdate();
            list = getList();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }
    
     protected boolean reUpdate(KhachHang kh) {
         // xóa tại theo mã ví dụ
        try {
            PreparedStatement pre = conn.prepareStatement("UPDATE khach_hang SET ten = ?, dia_chi = ?, email = ?, tuoi = ?, gioi_tinh = ? WHERE id = ?");
            pre.setObject(1, kh.getTen());
            pre.setObject(2, kh.getDiaChi());
            pre.setObject(3, kh.getEmail());
            pre.setObject(4, kh.getTuoi());
            pre.setObject(5, kh.isGioiTinh() ? Integer.valueOf(0) : Integer.valueOf(1));
            
             pre.setObject(6, kh.getId());
             
            pre.executeUpdate();
            list = getList();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    protected boolean reDelete(String ma) {
        try {
            PreparedStatement pre = conn.prepareStatement("DELETE FROM khach_hang WHERE id = ?");
            pre.setObject(1, ma);
           
            pre.executeUpdate();
            list = getList();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }
}
