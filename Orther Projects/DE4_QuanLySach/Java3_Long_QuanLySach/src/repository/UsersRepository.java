/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.DBConnect;

/**
 *
 * @author ThinkPad
 */
public class UsersRepository {

    Connection cn;

    public UsersRepository() {
        this.cn = DBConnect.getConnection();
    }

    public Users findUser(String id, String pass) {
        Users user = null;
        try {
            if (cn != null) {
                String query = "SELECT * FROM Users WHERE UserName = ? AND Password = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, id);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    return new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return user;
    }
}
