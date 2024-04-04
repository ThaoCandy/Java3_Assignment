/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.SinhVien;
import poly.edu.repository.DaoSinhVien;

/**
 *
 * @author user
 */
public class SinhVienService extends ServiceEntity<SinhVien> {

    private DaoSinhVien dao = new DaoSinhVien();

    @Override
    public ArrayList<SinhVien> getList() {
        return dao.getList();
    }

    @Override
    public String them(SinhVien sv) {
        if(sv.getHoTen().isEmpty() || sv.getHoTen().isBlank()){
            return "Hãy điền họ tên sinh viên trước khi thêm";
        }
        if(sv.getToan() < 0 || sv.getLy()< 0 || sv.getHoa() < 0 ){
            return "Điểm toán, lý, hóa phải là số dương";
        }
        if(!dao.insert(sv)){
            return "Thêm thất bại";
        }
        return "";
    }

    @Override
    protected String sua(SinhVien sv) {
        return "";
    }

    @Override
    public String xoa(SinhVien sv) {
        if(!dao.delete(sv)){
            return "Xóa thất bại";
        }
        return "";
    }

    @Override
    protected SinhVien find(Serializable id) {
        return null;
    }
    
    public ArrayList<SinhVien> minToMax(double min, double max){
       ArrayList<SinhVien> list = new ArrayList<>();
        dao.getList().forEach(e -> {
            if((e.getDiemTB() > min && e.getDiemTB() < max)){
                list.add(e);
            }
        });
        return list;
    }

}
