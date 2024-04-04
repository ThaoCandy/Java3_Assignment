/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service.iml;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Grade;
import poly.edu.repository.GradeRepository;
import poly.edu.service.GradeService;

/**
 *
 * @author user
 */
public class GradeServiceIml implements GradeService {

    private GradeRepository gradeRepository;

    public GradeServiceIml() {
        gradeRepository = new GradeRepository();
    }

    @Override
    public ArrayList<Grade> getAllEntity() {
        return gradeRepository.findAll();
    }

    @Override
    public ArrayList<Grade> getListByStudentId(Serializable MaSV) {
        return gradeRepository.findAllByStudentId(MaSV);
    }

    @Deprecated
    @Override
    public Grade getEntityById(Serializable id) {

        return null;
    }

    @Override
    public String deleteEntityById(Serializable maSV) {
        return gradeRepository.deleteById(maSV) ? "Xóa bản ghi thành công" : "Xóa thất bại";
    }

    @Override
    public String addEntity(Grade e) {
        return gradeRepository.addGrade(e) ? "Thêm bản ghi thành công" : "Thêm thất bại";
    }

    @Override
    public String updateEntityById(Grade e, Serializable id) {
        return gradeRepository.updateById(e) ? "Cập nhật bản ghi thành công" : "Cập nhật thất bại";
    }

    @Override
    public ArrayList<Grade> getTop3() {
        return  gradeRepository.findTop3();
    }

    
//    public static void main(String[] args) {
//        ArrayList<Grade> list = new GradeServiceIml().getAllEntity();
//        list.forEach((t) -> {
//            System.out.println(t);
//        });
//    }

    @Override
    public String saveGrade(Grade grade) {
        return gradeRepository.saveGrade(grade) ? "Save successfully": "Save failed";
    }

    @Override
    public ArrayList<Grade> findInGradeTable(Serializable MaSV) {
        return gradeRepository.findInGradeTable(MaSV);
    }
}
