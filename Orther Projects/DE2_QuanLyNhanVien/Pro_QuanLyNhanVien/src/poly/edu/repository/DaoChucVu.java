/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.sql.ResultSet;
import poly.edu.connectDB.DaoEntity;
import poly.edu.model.ChucVu;
import poly.edu.model.NhanVien;

/**
 *
 * @author user
 */
public class DaoChucVu extends DaoEntity<ChucVu>{

    public DaoChucVu(){
        this.getList();
    }
    @Override
    public void getList() {
        list.clear();
        try {
            ResultSet q1 = conn.createStatement().executeQuery("Select * from ChucVu");
            while(q1.next()){
                list.add(new ChucVu(q1.getString("maCV"), q1.getString("tenCV")));
            }
            System.out.println("Lấy danh sách Chức vụ thành công!");
            for (ChucVu cv : list) {
                System.out.println(cv.toString());
            }
        } catch (Exception e) {
            System.out.println("Lấy danh sách Chức vụ thất bại!");
            list.clear();
            e.printStackTrace(System.out);
        }}
    
    
    @Override
    public boolean insert(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChucVu find(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        
    }
}
