/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Grade;

/**
 *
 * @author user
 */
public interface GradeService extends EntityService<Grade>{
    public ArrayList<Grade> getListByStudentId(Serializable MaSV);
    public ArrayList<Grade> getTop3();
     public ArrayList<Grade> findInGradeTable(Serializable MaSV);
    public String saveGrade(Grade grade);
}
