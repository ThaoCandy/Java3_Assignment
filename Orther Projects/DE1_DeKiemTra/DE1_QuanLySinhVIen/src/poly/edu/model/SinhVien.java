/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.model;

/**
 *
 * @author user
 */
public class SinhVien {

    private String maSV;
    private String hoTen;
    private String diaChi;
    private int tuoi;

    private String phongHoc;
    private double toan;
    private double ly;
    private double hoa;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String diaChi, int tuoi, String phongHoc, double toan, double ly, double hoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.phongHoc = phongHoc;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public SinhVien(String hoTen, String phongHoc, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.phongHoc = phongHoc;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        
        this.maSV = null;
        this.diaChi = null;
        this.tuoi = -1;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getDiemTB() {
        return (toan + ly + hoa) / 3;
    }

    @Override
    public String toString() {
        return maSV + ": " + hoTen + ", diaChi=" + diaChi + ", tuoi=" + tuoi + ", phongHoc=" + phongHoc + ", toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }

}
