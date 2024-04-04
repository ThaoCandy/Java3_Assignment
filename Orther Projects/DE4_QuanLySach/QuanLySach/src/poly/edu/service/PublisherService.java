/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Publishers;
import poly.edu.repository.DaoPublishers;

/**
 *
 * @author user
 */
public class PublisherService extends ServiceEntity<Publishers>{
    private DaoPublishers dao =  new DaoPublishers();

    @Override
    public ArrayList<Publishers> getList() {
        return dao.getList();
    }

    @Override
    protected String them(Publishers ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String sua(Publishers ent, Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String xoa(Publishers ent) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Publishers find(Serializable id) {
        for (Publishers p : dao.getList()) {
            if(p.getPubName().equalsIgnoreCase(id.toString())){
                return p;
            }
        }
        return null;
    }
    
}
