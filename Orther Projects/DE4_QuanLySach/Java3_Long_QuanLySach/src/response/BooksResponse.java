/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package response;

/**
 *
 * @author ThinkPad
 */
public class BooksResponse {

    private String bookID;
    private String bookTitle;
    private String publisherName;
    private String authorName;
    private String note;

    public BooksResponse() {
    }

    public BooksResponse(String bookID, String bookTitle, String publisherName, String authorName, String note) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.publisherName = publisherName;
        this.authorName = authorName;
        this.note = note;
    }

    public Object[] toDataRow() {
        return new Object[]{bookID, bookTitle, publisherName, authorName, note};
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "BooksResponse{" + "bookID=" + bookID + ", bookTitle=" + bookTitle + ", publisherName=" + publisherName + ", authorName=" + authorName + ", note=" + note + '}';
    }

}
