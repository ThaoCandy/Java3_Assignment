/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Authors;
import poly.edu.repository.DaoAuthors;

/**
 *
 * @author user
 */
public class AuthorService extends ServiceEntity<Authors>{
    private DaoAuthors dao = new DaoAuthors();
    @Override
    public ArrayList<Authors> getList() {
        return dao.getList();
    }

    @Override
    protected String them(Authors ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String sua(Authors ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String xoa(Authors ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Authors find(Serializable id) {
         for (Authors p : dao.getList()) {
            if(p.getAuName().equalsIgnoreCase(id.toString())){
                return p;
            }
        }
        return null;
    }
    
}
