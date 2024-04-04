/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.ChucVu;
import poly.edu.repository.DaoChucVu;

/**
 *
 * @author user
 */
public class ChucVuService extends serviceAll<ChucVu> {

    private DaoChucVu dao = new DaoChucVu();

    public ArrayList<ChucVu> getList() {
        return dao.list;
    }

    @Override
    String them(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String sua(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String xoa(ChucVu ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChucVu tim(Serializable id) {
        for (ChucVu cv : dao.list) {
            if (cv.getTenCV().equalsIgnoreCase(String.valueOf(id))) {
                return cv;
            }
        }
        return null;
    }
    
    public ChucVu tim2(Serializable id) {
        for (ChucVu cv : dao.list) {
            if (cv.getMaCV().equals(String.valueOf(id))) {
                return cv;
            }
        }
        return null;
    }
}
