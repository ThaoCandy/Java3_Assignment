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
 * @param <Entity>
 */
public interface EntityService<Entity> {

    public ArrayList<Entity> getAllEntity();

    public Entity getEntityById(Serializable id);

    public String addEntity(Entity e);

    public String updateEntityById(Entity e, Serializable id);

    public String deleteEntityById(Serializable id);
}
