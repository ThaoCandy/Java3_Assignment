/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.util;

import java.util.ArrayList;
import poly.edu.model.Book;

/**
 *
 * @author user
 */
public class Helper{

    public String validateAddBook(String ma, String title, String note, ArrayList<Book> list) {
        String tb = "";
        if (ma.isBlank() || title.isBlank() || note.isBlank()) {
            tb = " Không trường nào được bỏ trống. \n";
        }
        if (!ma.matches("^(BU|MC|PC|PS|TC)\\d{4}$")) {
            tb += "Mã không hợp lệ. \nMã phải bắt đầu một trong các chữ [BU/MC/PC/PS/TC] và theo sau đằng sau là 4 số. \n";
        } else {
           
            for (Book b : list) {
                if (b.getBookID().equals(ma)) {
                    tb += "Mã sách này đã tồn tại trong danh sách, mời nhập một mã khác.";
                    break;
                }
            }
        }
        return tb;
    }
    
    

}
