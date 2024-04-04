/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Student;
import java.sql.*;
import poly.edu.comnectDB.Connect;

/**
 *
 * @author user
 */
public class StudentRepository {

    private Connect connect;

    public StudentRepository() {
        connect = new Connect();
    }

    public ArrayList<Student> findAll() {
        ArrayList<Student> list = new ArrayList<>();
        try {
            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("Select * from Students");
            while (re.next()) {
                Student e = new Student(re.getString(1), re.getString(2), re.getString(3),
                        re.getString(4), (Integer.parseInt(re.getString(5)) == 0), re.getString(6), re.getString(7));
                list.add(e);
            }
            // true = 0= nam; false = 1 = nu
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
            list.removeAll(list);
        }

        return list;
    }

    public Student findStudentById(String ma) {
        ArrayList<Student> list = findAll();
        for (Student e : list) {
            if (e.getMaSV().equals(ma)) {
                return e;
            }
        }
        return null;
    }

    public boolean addStudent(Student st) {
        try {
            Connection conn = connect.connectDB();
            PreparedStatement pre = conn.prepareStatement("""
                                                          insert into Students (MaSV, HoTen, Email, Sdt, GioiTinh, DiaChi, Hinh)
                                                          values (?,?,?,?,?,?,?)""");
            pre.setObject(1, st.getMaSV());
            pre.setObject(2, st.getHoTen());
            pre.setObject(3, st.getEmail());
            pre.setObject(4, st.getSdt());
            pre.setObject(5, st.getGoiTinh());
            pre.setObject(6, st.getDiaChi());
            pre.setObject(7, st.getHinh());
            
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
            return false;
        }
    }

    public boolean updateStudent(Student st, Serializable id) {
        try {
            Connection conn = connect.connectDB();
            PreparedStatement pre = conn.prepareStatement("update Students set MaSV=?, HoTen=?, Email=?, Sdt=?, GioiTinh=?, DiaChi=?, Hinh=? where MaSV=?");
            pre.setObject(1, st.getMaSV());
            pre.setObject(2, st.getHoTen());
            pre.setObject(3, st.getEmail());
            pre.setObject(4, st.getSdt());
            pre.setObject(5, st.getGoiTinh());
            pre.setObject(6, st.getDiaChi());
            pre.setObject(7, st.getHinh());
            pre.setObject(8, id);
            
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
            return false;
        }
    }

    public boolean deleteStudentById(Serializable id) {
        try {
            Connection conn = connect.connectDB();
            PreparedStatement pre = conn.prepareStatement("EXEC TP_delete_student_byId ?");
            pre.setObject(1, id);
            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
            return false;
        }
    }

    private void showListStudent(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
    

//    
//    public static void main(String[] args) {
//        StudentRepository rp = new StudentRepository();
//        rp.showListStudent(rp.findAll());
//        
//    }
//    
}
