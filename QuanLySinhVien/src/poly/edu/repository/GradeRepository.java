/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.comnectDB.Connect;
import poly.edu.model.Grade;
import java.sql.*;

/**
 *
 * @author user
 */
public class GradeRepository {

    private Connect connect;

    public GradeRepository() {
        connect = new Connect();
    }
    
    public ArrayList<Grade> findInGradeTable(Serializable MaSV) {
        ArrayList<Grade> list = new ArrayList<>();
        try {
            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("select * from Grade where MaSV = '" + MaSV + "'");
            while (re.next()) {
                Integer id = re.getString(1) == null ? null : Integer.valueOf(re.getString(1));

                Grade e = new Grade(id, re.getString(2), re.getDouble(3), re.getDouble(4), re.getDouble(5));
                list.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            list.removeAll(list);
        }

        return list;

    }

    public ArrayList<Grade> findAll() {
        ArrayList<Grade> list = new ArrayList<>();
        try {
            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("select * from V_Grade_Student");
            while (re.next()) {
                Integer id = re.getString(1) == null ? null : Integer.valueOf(re.getString(1));

                Grade e = new Grade(id, re.getString(2), re.getDouble(3), re.getDouble(4), re.getDouble(5));
                list.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            list.removeAll(list);
        }

        return list;

    }

    public ArrayList<Grade> findTop3() {
        ArrayList<Grade> list = new ArrayList<>();
        try {
            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("SELECT Top 3 * FROM V_Grade_Student ORDER BY (TiengAnh+TinHoc+GDTC)/3 DESC");
            while (re.next()) {
                Integer id = re.getString(1) == null ? null : Integer.valueOf(re.getString(1));
                Grade e = new Grade(id, re.getString(2), re.getDouble(3), re.getDouble(4), re.getDouble(5));
                list.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            list.removeAll(list);
        }

        return list;

    }

    public ArrayList<Grade> findAllByStudentId(Serializable MaSV) {
        ArrayList<Grade> list = new ArrayList<>();

        try {

            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("select * from V_Grade_Student where MaSV = '" + MaSV + "'");
            while (re.next()) {
                Integer id = re.getString(1) == null ? null : Integer.valueOf(re.getString(1));
                Grade e = new Grade(id, re.getString(2), re.getDouble(3), re.getDouble(4), re.getDouble(5));
                list.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            list.removeAll(list);
        }

        return list;

    }
    

    public boolean deleteById(Serializable maSV) {
        try {
            Connection conn = connect.connectDB();
            PreparedStatement pre = conn.prepareStatement("Delete from Grade where MaSV = ?");
            pre.setObject(1, maSV);

            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addGrade(Grade g) {
        try {
            Connection conn = connect.connectDB();
            PreparedStatement pre = conn.prepareStatement("insert into Grade(MaSV, TiengAnh, TinHoc, GDTC) values (?,?,?,?)");

            pre.setObject(1, g.getMaSV());
            pre.setObject(2, g.getTiengAnh());
            pre.setObject(3, g.getTinHoc());
            pre.setObject(4, g.getGDTC());

            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateById(Grade g) {
        try {
            Connection conn = connect.connectDB();

            PreparedStatement pre = conn.prepareStatement("update Grade TiengAnh=?, TinHoc=?, GDTC=? where ID=?");
            pre.setObject(1, g.getTiengAnh());
            pre.setObject(2, g.getTinHoc());
            pre.setObject(3, g.getGDTC());
            pre.setObject(4, g.getId());

            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean saveGrade(Grade g) {
        try {
            Connection conn = connect.connectDB();

            PreparedStatement pre = conn.prepareStatement("EXEC TP_SaveNewGrade ?, ?, ?, ?, ?");
            pre.setObject(1, g.getId());
            pre.setObject(2, g.getMaSV());
            pre.setObject(3, g.getTiengAnh());
            pre.setObject(4, g.getTinHoc());
            pre.setObject(5, g.getGDTC());

            pre.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Grade> list = new GradeRepository().findAll();
        for (Grade grade : list) {
            System.out.println(grade);
        }
    }
}
