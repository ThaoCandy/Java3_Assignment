/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.connect.ConnectDB;

/**
 *
 * @author user
 */
abstract public class DaoEntity<Entity> extends ConnectDB{

    public DaoEntity() {
       getList();
    }
    protected ArrayList<Entity> list = new ArrayList<>();
    
    abstract ArrayList<Entity> getList();
    
    abstract boolean insert(Entity ent);
    abstract boolean update(Entity ent);
    abstract boolean delete(Entity ent);
    
    abstract boolean find(Serializable id);
    
}
