/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service.iml;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.User;
import poly.edu.repository.UserRepository;
import poly.edu.service.UserService;

/**
 *
 * @author user
 */
public class UserServiceIml implements UserService{

    private UserRepository userRepository;

    public UserServiceIml() {
        userRepository = new UserRepository();
    }
    
    
    @Override
    public ArrayList<User> getAllEntity() {
        return userRepository.findAll();
    }

    @Override
    public User getEntityById(Serializable username) {
        return userRepository.findUserByUsername(username.toString());
    }

    @Override
    public User getUserByUsernameAndPass(String username, String pass) {
        return userRepository.findUserByUsernameAndPass(username, pass);
    }

    @Deprecated
    @Override
    public String deleteEntityById(Serializable id) {
        return null;
    }

    @Deprecated
    @Override
    public String addEntity(User e) {
        return null;
    }

    @Deprecated
    @Override
    public String updateEntityById(User e, Serializable id) {
        return null;
    }

   
}
