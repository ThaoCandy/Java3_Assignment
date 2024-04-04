/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Student implements Serializable{
    private String maSV;
    private String hoTen;
    private String email;
    private String sdt;
    private Boolean goiTinh;
    private String diaChi;
    private String hinh;

    public Student() {
    }

    public Student(String maSV, String hoTen, String email, String sdt, Boolean goiTinh, String diaChi, String hinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.goiTinh = goiTinh;
        this.diaChi = diaChi;
        this.hinh = hinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Boolean getGoiTinh() {
        return goiTinh;
    }

    public void setGoiTinh(Boolean goiTinh) {
        this.goiTinh = goiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", goiTinh=" + goiTinh + ", diaChi=" + diaChi + ", hinh=" + hinh + '}';
    }
  
    
}
