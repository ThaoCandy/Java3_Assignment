/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.Authors;

/**
 *
 * @author user
 */
public class DaoAuthors extends DaoEntity<Authors>{

    @Override
    public ArrayList<Authors> getList() {
         try {
            list.clear();
            ResultSet re = conn.createStatement().executeQuery("select * from Authors");
            while (re.next()) {
                list.add(new Authors(re.getString("au_id"), re.getString("au_name"), re.getString("au_address")));
            }
            System.out.println("lấy list Authors thành công");
            list.forEach(e -> {
                System.out.println(e.toString());
            });
        } catch (SQLException ex) {
            list.clear();
            System.out.println("lấy list Authors thất bại");
            Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    boolean insert(Authors ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean update(Authors ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean delete(Authors ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    Authors find(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
