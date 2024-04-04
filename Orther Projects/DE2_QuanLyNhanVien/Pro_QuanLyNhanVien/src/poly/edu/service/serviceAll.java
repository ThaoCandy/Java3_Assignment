/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import poly.edu.connectDB.DaoEntity;

/**
 *
 * @author user
 */
abstract public class serviceAll<Entity>{
    abstract String them(Entity ent);
    abstract String sua(Entity ent);
    abstract String xoa(Entity ent);
    
    abstract Entity tim(Serializable id);
    
}
