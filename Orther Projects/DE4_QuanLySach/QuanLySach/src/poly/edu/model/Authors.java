/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author user
 */
public class Authors {
    private String auID;
    private String auName;
    private String auAddress;

    public Authors() {
    }

    public Authors(String auID, String auName, String auAddress) {
        this.auID = auID;
        this.auName = auName;
        this.auAddress = auAddress;
    }

    public String getAuID() {
        return auID;
    }

    public void setAuID(String auID) {
        this.auID = auID;
    }

    public String getAuName() {
        return auName;
    }

    public void setAuName(String auName) {
        this.auName = auName;
    }

    public String getAuAddress() {
        return auAddress;
    }

    public void setAuAddress(String auAddress) {
        this.auAddress = auAddress;
    }

    @Override
    public String toString() {
        return "Authors{" + "auID=" + auID + ", auName=" + auName + ", auAddress=" + auAddress + '}';
    }
    
    
}
