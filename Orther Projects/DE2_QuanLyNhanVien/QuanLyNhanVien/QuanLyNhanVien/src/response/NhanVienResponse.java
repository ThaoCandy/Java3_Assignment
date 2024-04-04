package response;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cuongnguyenba
 */
public class NhanVienResponse {

    private String ma;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String idCV;

    public NhanVienResponse() {
    }

    public NhanVienResponse(String ma, String ten, String gioiTinh, String ngaySinh, String idCV) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.idCV = idCV;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getIdCV() {
        return idCV;
    }

    public void setIdCV(String idCV) {
        this.idCV = idCV;
    }

    public Object[] toDataRow() {
        return new Object[]{ma, ten, gioiTinh, ngaySinh, idCV};
    }
}
