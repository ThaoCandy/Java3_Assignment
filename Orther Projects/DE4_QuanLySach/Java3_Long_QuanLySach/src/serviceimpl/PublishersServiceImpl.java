/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Publishers;
import java.util.List;
import repository.PublishersRepository;
import service.PublishersService;

/**
 *
 * @author ThinkPad
 */
public class PublishersServiceImpl implements PublishersService {

    private PublishersRepository repo;
    
    public PublishersServiceImpl() {
        repo = new PublishersRepository();
    }
    
    @Override
    public List<Publishers> getAllPublishers() {
        return repo.getAllPublishers();
    }
    
    @Override
    public String getIdPublisherByName(String name) {
        return repo.getIdPublisherByName(name);
    }
    
}
