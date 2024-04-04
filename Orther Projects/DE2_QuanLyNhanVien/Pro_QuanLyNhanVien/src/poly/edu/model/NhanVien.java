/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class NhanVien {

    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;
    private String maCV;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String ngaySinh, boolean gioiTinh, String maCV) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.maCV = maCV;
    }

    public NhanVien(String maNV, String hoTen, String ngaySinh, String gioiTinh, String maCV) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh.equals("0") ? true : false;
        this.maCV = maCV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", maCV=" + maCV + '}';
    }

    public ChucVu getCV(ArrayList<ChucVu> list, String maCV, String tenCV) {

        for (ChucVu cv : list) {
            if (tenCV == "") {
                if (cv.getMaCV().equals(maCV)) {
                    return cv;
                }
            }else{
                if (cv.getTenCV().equalsIgnoreCase(tenCV)) {
                    return cv;
                }
            }

        }
        return null;
    }

}
