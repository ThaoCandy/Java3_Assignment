/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.Publishers;

/**
 *
 * @author user
 */
public class DaoPublishers extends DaoEntity<Publishers>{

    
    @Override
    public ArrayList<Publishers> getList() {
        try {
            list.clear();
            ResultSet re = conn.createStatement().executeQuery("select * from Publishers");
            while (re.next()) {
                list.add(new Publishers(re.getString("pub_id"), re.getString("pub_name"), re.getString("pub_address")));
            }
            System.out.println("lấy list Publisher thành công");
            list.forEach(e -> {
                System.out.println(e.toString());
            });
        } catch (SQLException ex) {
            list.clear();
            System.out.println("lấy list Publisher thất bại");
            Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    boolean insert(Publishers ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean update(Publishers ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    boolean delete(Publishers ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    Publishers find(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
