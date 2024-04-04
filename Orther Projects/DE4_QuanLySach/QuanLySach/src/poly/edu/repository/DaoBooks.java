/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repository;

import java.io.Serializable;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.Book;
import poly.edu.model.Users;
import poly.edu.repo.BooksRepo;

/**
 *
 * @author user
 */
public class DaoBooks extends DaoEntity<Book> {

    @Override
    public ArrayList<Book> getList() {
        try {
            list.clear();
            ResultSet re = conn.createStatement().executeQuery("select * from Books");
            while (re.next()) {
                list.add(new Book(re.getString(1), re.getString(2), re.getString(3),
                        re.getString(4), re.getString(5), re.getString(6)));
            }
            System.out.println("lấy list Books thành công");
//            list.forEach(e -> {
//                System.out.println(e.toString());
//            });
        } catch (SQLException ex) {
            list.clear();
            System.out.println("lấy list Books thất bại");
            Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<BooksRepo> getListRepo(Users u) {
        ArrayList<BooksRepo> listRepo = new ArrayList<>();
        try {
            ResultSet re = conn.createStatement().executeQuery("select * from V_Books_Info where username = '" + u.getUserName() + "'");
            while (re.next()) {
                listRepo.add(new BooksRepo(re.getString(1), re.getString(2), re.getString(3),
                        re.getString(4), re.getString(5), re.getString(6)));
            }
            System.out.println("lấy list Books Repo thành công");
//            listRepo.forEach(e -> {
//                System.out.println(e.toString());
//            });
        } catch (SQLException ex) {
            System.out.println("lấy list Books  Repo thất bại");
            Logger.getLogger(DaoUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listRepo;
    }

    @Override
    public boolean insert(Book b) {
        try {
            PreparedStatement pre = conn.prepareStatement("INSERT [dbo].[Books] ([book_id], [title],  [pub_id], [au_id],[notes],[username]) VALUES "
                    + "(?, ?, ?, ?, ?, ?)");
            pre.setObject(1, b.getBookID());
            pre.setObject(2, b.getTitle());
            pre.setObject(3, b.getPub_id());
            pre.setObject(4, b.getAu_id());
            pre.setObject(5, b.getNotes());
            pre.setObject(6, b.getUsername());

            pre.executeUpdate();
            System.out.println("Thêm thành công 1 đầu sách.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Thêm đầu sách thất bại.");
            Logger.getLogger(DaoBooks.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean update(Book b, Serializable id) {
         try {
            PreparedStatement pre = conn.prepareStatement("UPDATE [dbo].[Books] SET [book_id]=?, [title]=?,[pub_id]=?,[au_id]=?,[notes]=? WHERE  [book_id]= '" + id +"'");
            pre.setObject(1, b.getBookID());
            pre.setObject(2, b.getTitle());
            pre.setObject(3, b.getPub_id());
            pre.setObject(4, b.getAu_id());
            pre.setObject(5, b.getNotes());

            pre.executeUpdate();
            System.out.println("Update thành công 1 đầu sách.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Update đầu sách thất bại.");
            Logger.getLogger(DaoBooks.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Book b) {
        try {
            PreparedStatement pre = conn.prepareStatement("delete from Books where book_id = ?");
            pre.setObject(1, b.getBookID());
            
            pre.executeUpdate();
            System.out.println("Xóa thành công.");
            return true;
        } catch (SQLException ex) {
            System.out.println("Xóa thất bại.");
            Logger.getLogger(DaoBooks.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

    @Override
    protected Book find(Serializable id) {
        return null;
    }

    public ArrayList<BooksRepo> findArray(Serializable id, Serializable NameCl) {
        ArrayList<BooksRepo> listRepo = new ArrayList<>();
        try {
            ResultSet re = conn.createStatement().executeQuery("Select * from V_Books_Info where " + NameCl + " like '%" + id + "%'");
            while (re.next()) {
                listRepo.add(new BooksRepo(re.getString(1), re.getString(2), re.getString(3),
                        re.getString(4), re.getString(5), re.getString(6)));
            }
            System.out.println("Find list Books Repo thành công");
//            listRepo.forEach(e -> {
//                System.out.println(e.toString());
//            });
        } catch (SQLException ex) {
            Logger.getLogger(DaoBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listRepo;
    }

}
