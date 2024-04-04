/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Publishers;
import java.util.List;

/**
 *
 * @author ThinkPad
 */
public interface PublishersService {

    List<Publishers> getAllPublishers();

    String getIdPublisherByName(String name);
}
