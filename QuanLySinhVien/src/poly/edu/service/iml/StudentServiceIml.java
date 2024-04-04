/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service.iml;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Student;
import poly.edu.repository.StudentRepository;
import poly.edu.service.StudentService;

/**
 *
 * @author user
 */
public class StudentServiceIml implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceIml() {
       this.studentRepository = new StudentRepository();
    }
    
    
    
    @Override
    public ArrayList<Student> getAllEntity() {
        return studentRepository.findAll();
    }

    @Override
    public Student getEntityById(Serializable id) {
        return studentRepository.findStudentById((String) id);
    }

    @Override
    public String deleteEntityById(Serializable id) {
        return studentRepository.deleteStudentById(id)? "Xóa thành công sinh viên":"Xóa thất bại";
    }

    @Override
    public String addEntity(Student e) {
        return studentRepository.addStudent(e) ? "Thêm thành công" : "Xóa thất bại";
    }

    @Override
    public String updateEntityById(Student e, Serializable id) {
        return studentRepository.updateStudent(e, id) ? "Cập nhật thành công" : "Cập nhật thất bại";
    }

    @Override
    public boolean existStudentNewId(Serializable newId, Serializable oldId) {
        ArrayList<Student> list = getAllEntity();
        if(oldId != null){
             list.removeIf((e) -> e.getMaSV().equals(oldId));
        }
        for (Student e : list) {
             if(e.getMaSV().equals(newId)){
                return true;
            }
        }
           
        return false;
    }

    
}
