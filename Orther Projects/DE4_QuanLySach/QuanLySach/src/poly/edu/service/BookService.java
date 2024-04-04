/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.io.Serializable;
import java.util.ArrayList;
import poly.edu.model.Book;
import poly.edu.model.Users;
import poly.edu.repo.BooksRepo;
import poly.edu.repository.DaoBooks;

/**
 *
 * @author user
 */
public class BookService extends ServiceEntity<Book> {

    private DaoBooks dao = new DaoBooks();

    @Override
    public ArrayList<Book> getList() {
        return dao.getList();
    }

    public ArrayList<BooksRepo> getListRepo(Users u) {
        return dao.getListRepo(u);
    }

    public ArrayList<BooksRepo> findArray(String value, Serializable NameCl, Users u) {
        ArrayList<BooksRepo> list = new ArrayList<>();
        for (BooksRepo b : dao.findArray(value, NameCl)) {
            if (b.getUsername().equals(u.getUserName())) {
                list.add(b);
            }
        }
        return list;
    }

    @Override
    public String them(Book b) {
        if (dao.insert(b)) {
            return "Thêm thành công.";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String sua(Book b, Serializable id) {
         if(dao.update(b, id)){
            return "Update thành công.";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public String xoa(Book b) {
        if(dao.delete(b)){
            return "Xóa thành công.";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public Book find(Serializable id) {
        for (Book b : dao.getList()) {
            if(b.getBookID().equals(id)){
                return b;
            }
        }
        return null;
    }

}
