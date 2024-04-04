/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.ChucVu;
import poly.edu.model.NhanVien;
import poly.edu.repository.DaoNhanVien;

/**
 *
 * @author user
 */
public class NhanVienService extends serviceAll<NhanVien>{

    private DaoNhanVien dao = new DaoNhanVien();
    
    public ArrayList<NhanVien> getList(){
        return dao.list;
    }
    @Override
    public String them(NhanVien nv) {
        if(nv.getHoTen().isEmpty() || nv.getNgaySinh().isEmpty()){
            return "Hãy điền đầy đủ thông tin trước khi thêm.";
        }
        
        if(!dao.insert(nv)){
            return "Thêm thất bại";
        }
        return "Thêm thành công";
    }

    @Override
    public String sua(NhanVien nv) {
        if(nv.getHoTen().isEmpty() || nv.getNgaySinh().isEmpty()){
            return "Hãy điền đầy đủ thông tin trước khi sửa.";
        }
        
        if(!dao.update(nv)){
            return "Sửa thất bại";
        }
        return "Sửa thành công";
    }

    @Override
    public String xoa(NhanVien ent) {
        if(!dao.delete(ent)){
            return "Xóa thất bại";
        }
        return "Xóa thành công";
    }

    @Override
    public NhanVien tim(Serializable id) {
        return dao.find(id);
    }
    
    
}
