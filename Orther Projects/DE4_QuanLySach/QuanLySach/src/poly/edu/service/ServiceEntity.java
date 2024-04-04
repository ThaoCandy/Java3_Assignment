/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author user
 */
abstract public class ServiceEntity<Enity> {
    
    abstract protected ArrayList<Enity> getList();
    
    abstract protected String them(Enity ent);
    abstract protected String sua(Enity ent, Serializable id);
    abstract protected String xoa(Enity ent);
    
    abstract protected Enity find(Serializable id);
    
}
