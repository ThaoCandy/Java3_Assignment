/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import poly.edu.model.User;

/**
 *
 * @author user
 */
public interface UserService extends EntityService<User>{
    User getUserByUsernameAndPass(String username, String pass);
}
