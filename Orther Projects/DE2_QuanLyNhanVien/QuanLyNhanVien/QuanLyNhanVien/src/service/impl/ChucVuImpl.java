
package service.impl;

import entity.ChucVu;
import java.util.List;
import service.ChucVuService;
import repository.ChucVuRepository;

/**
 *
 * @author cuongnguyenba
 */
public class ChucVuImpl implements ChucVuService<ChucVu>{

    private ChucVuRepository chucVuRepository = new ChucVuRepository();
    
    @Override
    public List<ChucVu> getAllChucVu() {
        return chucVuRepository.getAllChucVu();
    }
    
}
