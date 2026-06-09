package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.RolEntity;
import java.util.List;

public interface RolService {
    List<RolEntity> findAll();
    List<RolEntity> findAllCustom();
    RolEntity findById(Long id);
    RolEntity add(RolEntity obj);
    RolEntity update(RolEntity obj, Long id);
    RolEntity delete(Long id);
    RolEntity enable(Long id);
}
