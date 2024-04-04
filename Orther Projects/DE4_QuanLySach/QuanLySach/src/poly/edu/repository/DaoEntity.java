/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import poly.edu.jdbc.Connect;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
abstract public class DaoEntity<Entity> extends Connect{

    public DaoEntity() {
    }
    protected ArrayList<Entity> list = new ArrayList<>();
    
    abstract ArrayList<Entity> getList();
    
    abstract boolean insert(Entity ent);
    abstract boolean update(Entity ent, Serializable id);
    abstract boolean delete(Entity ent);
    
    abstract Entity find(Serializable id);
    
}
