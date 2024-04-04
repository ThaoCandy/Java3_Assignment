/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Books;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBConnect;
import response.BooksResponse;

/**
 *
 * @author ThinkPad
 */
public class BooksRepository {

    private Connection cn;

    public BooksRepository() {
        cn = DBConnect.getConnection();
    }

    public List<BooksResponse> getAllBooks() {
        List<BooksResponse> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT b.book_id, b.title, p.pub_name, a.au_name, b.notes "
                        + "FROM Books b "
                        + "JOIN Publishers p ON b.pub_id=p.pub_id "
                        + "JOIN Authors a ON b.au_id=a.au_id";
                PreparedStatement ps = cn.prepareCall(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new BooksResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    public List<BooksResponse> searchBooks(int index, String key) {
        List<BooksResponse> listSearch = new ArrayList<>();

        try {
            if (cn != null) {
                String query = "SELECT b.book_id, b.title, p.pub_name, a.au_name, b.notes "
                        + "FROM Books b "
                        + "JOIN Publishers p ON b.pub_id=p.pub_id "
                        + "JOIN Authors a ON b.au_id=a.au_id ";

                switch (index) {
                    case 0:
                        query += " WHERE b.book_id like ? OR b.book_id like ? OR b.book_id like ?";
                        break;
                    case 1:
                        query = query + " WHERE b.title like ? OR b.title like ? OR b.title like ?";
                        break;
                    case 2:
                        query += " WHERE a.au_name like ? OR a.au_name like ? OR a.au_name like ?";
                        break;
                    default:
                        System.out.println("Hello");
                        break;
                }

                PreparedStatement ps = cn.prepareCall(query);
                ps.setString(1, key + "%");
                ps.setString(2, "%" + key);
                ps.setString(3, "%" + key + "%");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    listSearch.add(new BooksResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return listSearch;
    }

    public String insertBook(Books book) {
        try {
            if (cn != null) {
                String query = "INSERT INTO Books VALUES(?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, book.getBookID());
                ps.setString(2, book.getTitle());
                ps.setString(3, book.getPublisherID());
                ps.setString(4, book.getAuthorID());
                ps.setString(5, book.getNote());
                ps.setString(6, book.getUserName());
                ps.execute();
                return "Thêm thành công";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Thêm thất bại";
        }
        return "Thêm thất bại";
    }

}
