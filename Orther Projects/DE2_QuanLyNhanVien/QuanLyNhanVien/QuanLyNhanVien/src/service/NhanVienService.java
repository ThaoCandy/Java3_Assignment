package service;

import java.util.List;

public interface NhanVienService<T> {

    List<T> getAllNhanVien();

    String updateNhanVien(T nhanVien);
    
    String deleteNhanVien(String ma);
}
