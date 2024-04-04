/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author user
 */
public class Publishers {
    private String pubID;
    private String pubName;
    private String pubAddress;

    public Publishers() {
    }

    public Publishers(String pubID, String pubName, String pubAddress) {
        this.pubID = pubID;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
    }

    public String getPubID() {
        return pubID;
    }

    public void setPubID(String pubID) {
        this.pubID = pubID;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    @Override
    public String toString() {
        return "Publishers{" + "pubID=" + pubID + ", pubName=" + pubName + ", pubAddress=" + pubAddress + '}';
    }
    
    
}
