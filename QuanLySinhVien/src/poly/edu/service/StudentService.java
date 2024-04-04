/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Student;

/**
 *
 * @author user
 */
public interface StudentService extends EntityService<Student>{
    public boolean existStudentNewId(Serializable newId, Serializable oldId);
}
