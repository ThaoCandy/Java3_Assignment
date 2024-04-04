/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Authors;
import java.util.List;
import repository.AuthorsRepository;
import service.AuthorsService;

/**
 *
 * @author ThinkPad
 */
public class AuthorsServiceImpl implements AuthorsService {
    
    private AuthorsRepository repo;
    
    public AuthorsServiceImpl() {
        repo = new AuthorsRepository();
    }
    
    @Override
    public List<Authors> getAllAuthors() {
        return repo.getAllAuthors();
    }
    
    @Override
    public String getIdAuthorByName(String name) {
        return repo.getIdAuthorByName(name);
    }
    
}
