/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Authors;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBConnect;

/**
 *
 * @author ThinkPad
 */
public class AuthorsRepository {

    private Connection cn;

    public AuthorsRepository() {
        cn = DBConnect.getConnection();
    }

    public List<Authors> getAllAuthors() {
        List<Authors> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT * FROM Authors";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new Authors(rs.getString(1), rs.getString(2), rs.getString(3)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String getIdAuthorByName(String name){
        String id = "";
        try {
            if (cn != null) {
                String query = "SELECT au_id FROM Authors WHERE au_name = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, name);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    id = rs.getString(1);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

}
