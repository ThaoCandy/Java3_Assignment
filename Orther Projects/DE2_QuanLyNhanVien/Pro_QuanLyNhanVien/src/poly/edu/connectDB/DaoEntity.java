/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.connectDB;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user
 */
abstract public class DaoEntity<Entity> extends Connect{

    public DaoEntity() {
       
    }
    public ArrayList<Entity> list = new ArrayList<>();
    
    abstract public void getList();
    
    abstract public boolean insert(Entity ent);
    abstract public boolean update(Entity ent);
    abstract public boolean delete(Entity ent);
    
    abstract public Entity find(Serializable id);
    
}
