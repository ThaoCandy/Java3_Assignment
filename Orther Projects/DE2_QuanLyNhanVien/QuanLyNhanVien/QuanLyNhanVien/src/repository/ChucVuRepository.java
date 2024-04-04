package repository;

import entity.ChucVu;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cuongnguyenba
 */
public class ChucVuRepository {

    public List<ChucVu> getAllChucVu() {
        String query = "SELECT * FROM ChucVu";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query)) {
            List<ChucVu> listChucVu = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listChucVu.add(new ChucVu(rs.getString(1),
                        rs.getString(2), rs.getString(3)));
            }
            return listChucVu;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
