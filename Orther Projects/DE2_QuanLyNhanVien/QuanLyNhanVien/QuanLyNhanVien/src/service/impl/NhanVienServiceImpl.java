package service.impl;

//import entity.NhanVien;
import java.util.List;
import service.NhanVienService;
import repository.NhanVienRepository;
import response.NhanVienResponse;

/**
 *
 * @author cuongnguyenba
 */
public class NhanVienServiceImpl implements NhanVienService<NhanVienResponse> {

    private final NhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVienResponse> getAllNhanVien() {
        return nhanVienRepository.getAllNhanVien();
    }

    @Override
    public String updateNhanVien(NhanVienResponse nhanVienResponse) {
        boolean check = nhanVienRepository.updateNhanVien(nhanVienResponse);
        if (check) {
            return "Update thành công!";
        } else {
            return "Update thất bại!";
        }
    }
    
    @Override
    public String deleteNhanVien(String ma) {
        boolean check = nhanVienRepository.deleteGiangVien(ma);
        if (check) {
            return "Delete thành công!";
        } else {
            return "Delete thất bại!";
        }
    }

}
