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
public class Grade implements Serializable{
    private Integer id;
    private String maSV;
    private Double tiengAnh;
    private Double tinHoc;
    private Double GDTC;

    public Grade() {
    }

    public Grade(Integer id, String maSV, Double tiengAnh, Double tinHoc, Double GDTC) {
        this.id = id;
        this.maSV = maSV;
        this.tiengAnh = tiengAnh;
        this.tinHoc = tinHoc;
        this.GDTC = GDTC;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Double getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(Double tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public Double getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(Double tinHoc) {
        this.tinHoc = tinHoc;
    }

    public Double getGDTC() {
        return GDTC;
    }

    public void setGDTC(Double GDTC) {
        this.GDTC = GDTC;
    }

    
    

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", maSV=" + maSV + ", tiengAnh=" + tiengAnh + ", tinHoc=" + tinHoc + ", GDTC=" + GDTC + '}';
    }
    
    public Double getDiemTB(){
        return (tiengAnh+tinHoc+GDTC)/3;
    }
    
}
