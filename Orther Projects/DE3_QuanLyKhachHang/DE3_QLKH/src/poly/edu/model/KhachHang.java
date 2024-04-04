/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author user
 */
public class KhachHang {
    private String id;
    private String ten;
    private String diaChi;
    private String email;
    private int tuoi;
    private boolean gioiTinh;

    public KhachHang() {
    }

    public KhachHang(String id, String ten, String diaChi, String email, int tuoi, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.email = email;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return id + ". " + ten + "\t diaChi=" + diaChi + ", email=" + email + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh;
    }
    
    
}
