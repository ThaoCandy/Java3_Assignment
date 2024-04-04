/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ThinkPad
 */
public class Authors {

    private String authorID;
    private String authorName;
    private String authorAddress;

    public Authors() {
    }

    public Authors(String authorID, String authorName, String authorAddress) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
    }
    
    

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    @Override
    public String toString() {
        return "Authors{" + "authorID=" + authorID + ", authorName=" + authorName + ", authorAddress=" + authorAddress + '}';
    }

}
