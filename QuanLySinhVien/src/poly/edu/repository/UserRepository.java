/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.sql.*;
import java.util.ArrayList;
import poly.edu.comnectDB.Connect;
import poly.edu.model.User;

/**
 *
 * @author user
 */
public class UserRepository {
    private Connect connect;

    public UserRepository() {
        this.connect = new Connect();
    }
    
    public ArrayList<User> findAll(){
        ArrayList<User> list = new ArrayList<>();
        try {
            Connection conn = connect.connectDB();
            ResultSet re = conn.createStatement().executeQuery("Select * from Users");
            while (re.next()) {                
                User u = new User(re.getString(1), re.getString(2), re.getString(3));
                list.add(u);
            }
        } catch (Exception e) {
            list.removeAll(list);
            System.out.println(e.getMessage());
        }
        
        
        return list;
    }
    
    public User findUserByUsername(String username){
        ArrayList<User> list = findAll();
        for (User e : list) {
           if(username.equals(e.getUsername())){
               return e;
           }
        }
        return null;
    }
    
    public User findUserByUsernameAndPass(String username, String pass){
         ArrayList<User> list = findAll();
        for (User e : list) {
           if(username.equals(e.getUsername()) && pass.equals(e.getPassword())){
               return e;
           }
        }
        return null;
    }
//    
//    public static void main(String[] args) {
//        new UserRepository().findAll();
//    }
    
}
