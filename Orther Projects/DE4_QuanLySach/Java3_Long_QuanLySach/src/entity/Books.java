/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ThinkPad
 */
public class Books {

    private String bookID;
    private String title;
    private String publisherID;
    private String authorID;
    private String note;
    private String userName;

    public Books() {
    }

    public Books(String bookID, String title, String publisherID, String authorID, String note, String userName) {
        this.bookID = bookID;
        this.title = title;
        this.publisherID = publisherID;
        this.authorID = authorID;
        this.note = note;
        this.userName = userName;
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

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Books{" + "bookID=" + bookID + ", title=" + title + ", publisherID=" + publisherID + ", authorID=" + authorID + ", note=" + note + ", userName=" + userName + '}';
    }

}
