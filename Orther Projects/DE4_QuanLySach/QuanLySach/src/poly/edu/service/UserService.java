/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Users;
import poly.edu.repository.DaoUsers;

/**
 *
 * @author user
 */
public class UserService extends ServiceEntity<Users> {

    private DaoUsers dao = new DaoUsers();

    public Users find(Serializable id, Serializable pass) {
        for (Users u : dao.getList()) {
            if(u.getUserName().equals(id) && u.getPassword().equals(pass)){
                return u;
            }
        }
        return null;
    }
    @Override
    protected ArrayList<Users> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String them(Users ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    @Override
    protected String xoa(Users ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected Users find(Serializable id) {
        return null;
    }

    @Override
    protected String sua(Users ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}
