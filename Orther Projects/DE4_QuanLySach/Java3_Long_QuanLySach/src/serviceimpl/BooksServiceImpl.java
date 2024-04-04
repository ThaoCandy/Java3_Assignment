/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Books;
import java.util.ArrayList;
import java.util.List;
import repository.BooksRepository;
import response.BooksResponse;
import service.BooksService;

/**
 *
 * @author ThinkPad
 */
public class BooksServiceImpl implements BooksService {

    private BooksRepository repo;

    public BooksServiceImpl() {
        repo = new BooksRepository();
    }

    @Override
    public List<BooksResponse> getAllBooks() {
        return repo.getAllBooks();
    }

    @Override
    public List<BooksResponse> searchBooks(int index, String key) {
        return repo.searchBooks(index, key);
    }

    @Override
    public String insertBook(Books book) {
        return repo.insertBook(book);
    }

}
