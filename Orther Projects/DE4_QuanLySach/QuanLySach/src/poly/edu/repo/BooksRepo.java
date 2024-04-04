/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.repo;

/**
 *
 * @author user
 */
public class BooksRepo {
    private String bookID;
    private String title;
    private String pub_name;
    private String au_name;
    private String notes;
    
    private String username;

    public BooksRepo() {
    }

    public BooksRepo(String bookID, String title, String pub_name, String au_name, String notes, String username) {
        this.bookID = bookID;
        this.title = title;
        this.pub_name = pub_name;
        this.au_name = au_name;
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

    public String getPub_name() {
        return pub_name;
    }

    public void setPub_name(String pub_name) {
        this.pub_name = pub_name;
    }

    public String getAu_name() {
        return au_name;
    }

    public void setAu_name(String au_name) {
        this.au_name = au_name;
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
        return "BooksRepo{" + "bookID=" + bookID + ", title=" + title + ", pub_name=" + pub_name + ", au_name=" + au_name + ", notes=" + notes + ", username=" + username + '}';
    }
    
    
}
