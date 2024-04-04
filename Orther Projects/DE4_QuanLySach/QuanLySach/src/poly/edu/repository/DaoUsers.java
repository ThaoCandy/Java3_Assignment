/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import poly.edu.model.Users;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DaoUsers extends DaoEntity<Users> {

    @Override
    public ArrayList<Users> getList() {
        try {
            list.clear();
            ResultSet re = conn.createStatement().executeQuery("select * from Users");
            while (re.next()) {
                list.add(new Users(re.getString(1), re.getString(2), re.getString(3), re.getString(4)));
            }
            System.out.println("lấy list Users thành công");
//            list.forEach(e -> {
//                System.out.println(e.toString());
//            });
        } catch (SQLException ex) {
            list.clear();
            System.out.println("lấy list Users thất bại");
            Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    @Override
    boolean insert(Users ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean update(Users ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean delete(Users ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    Users find(Serializable id) {
        
        return null;
    }

}
