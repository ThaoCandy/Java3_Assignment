/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Authors;
import java.util.List;

/**
 *
 * @author ThinkPad
 */
public interface AuthorsService {

    List<Authors> getAllAuthors();

    String getIdAuthorByName(String name);
}
