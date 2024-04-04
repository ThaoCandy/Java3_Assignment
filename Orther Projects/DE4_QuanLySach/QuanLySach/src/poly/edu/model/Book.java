/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author user
 */
public class Book {
//    [book_id] varchar(6) NOT NULL primary key,
//	[title] [varchar](80) NOT NULL,
//	[pub_id] [char](4) NULL references publishers(pub_id),
//	[au_id] varchar(15) NOT NULL references Authors(au_id),
//	[notes] [varchar](200) NULL,
//	[username]
    
    private String bookID;
    private String title;
    private String pub_id;
    private String au_id;
    private String notes;
    
    private String username; // chủ nhân sách, sau khi login chỉ hiện ra những cuốn của user đó

    public Book() {
    }

    public Book(String bookID, String title, String pub_id, String au_id, String notes, String username) {
        this.bookID = bookID;
        this.title = title;
        this.pub_id = pub_id;
        this.au_id = au_id;
        this.notes = notes;
        this.username = username;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPub_id() {
        return pub_id;
    }

    public void setPub_id(String pub_id) {
        this.pub_id = pub_id;
    }

    public String getAu_id() {
        return au_id;
    }

    public void setAu_id(String au_id) {
        this.au_id = au_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", title=" + title + ", pub_id=" + pub_id + ", au_id=" + au_id + ", notes=" + notes + ", username=" + username + '}';
    }
    
    
}
