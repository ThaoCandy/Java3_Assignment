package repository;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import response.NhanVienResponse;

/**
 *
 * @author cuongnguyenba
 */
public class NhanVienRepository {

    public List<NhanVienResponse> getAllNhanVien() {
        String query = "SELECT nv.Ma, nv.Ten, nv.GioiTinh, nv.NgaySinh, cv.Ten "
                + "FROM NhanVien nv JOIN ChucVu cv ON nv.idCV = cv.id";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            List<NhanVienResponse> listNhanVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listNhanVien.add(new NhanVienResponse(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5)));
            }
            return listNhanVien;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public boolean updateNhanVien(NhanVienResponse nhanVienResponse) {
        int check = 0;
        String query = "UPDATE NhanVien SET Ten = ?, GioiTinh = ?, NgaySinh = ?, idCV = ? WHERE Ma = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, nhanVienResponse.getTen());
            ps.setObject(2, nhanVienResponse.getGioiTinh());
            ps.setObject(3, nhanVienResponse.getNgaySinh());
            ps.setObject(4, nhanVienResponse.getIdCV());
            ps.setObject(5, nhanVienResponse.getMa());
            check = ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean deleteGiangVien(String ma) {
        int check = 0;
        String query = "DELETE FROM NhanVien WHERE Ma = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
