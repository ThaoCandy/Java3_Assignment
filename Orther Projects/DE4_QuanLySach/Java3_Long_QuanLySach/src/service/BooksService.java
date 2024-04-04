/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Books;
import java.util.List;
import response.BooksResponse;

/**
 *
 * @author ThinkPad
 */
public interface BooksService {

    List<BooksResponse> getAllBooks();

    List<BooksResponse> searchBooks(int index, String key);
    
    String insertBook(Books book);
}
