/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import entity.Publishers;
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
public class PublishersRepository {
    private Connection cn;

    public PublishersRepository() {
        cn = DBConnect.getConnection();
    }
    
    public List<Publishers> getAllPublishers(){
        List<Publishers> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT * FROM Publishers";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new Publishers(rs.getString(1), rs.getString(2), rs.getString(3)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String getIdPublisherByName(String name){
        String id = "";
        try {
            if (cn != null) {
                String query = "SELECT pub_id FROM Publishers where pub_name = ?";
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
