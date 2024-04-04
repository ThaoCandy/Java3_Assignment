/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ThinkPad
 */
public class Publishers {

    private String publisherID;
    private String publisherName;
    private String publisherAddress;

    public Publishers() {
    }

    public Publishers(String publisherID, String publisherName, String publisherAddress) {
        this.publisherID = publisherID;
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }
    
    

    public String getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(String publisherID) {
        this.publisherID = publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    @Override
    public String toString() {
        return "Publishers{" + "publisherID=" + publisherID + ", publisherName=" + publisherName + ", publisherAddress=" + publisherAddress + '}';
    }

}
