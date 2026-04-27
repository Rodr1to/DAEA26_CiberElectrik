package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.RolEntity;
import java.util.List;

public interface RolService {
    List<RolEntity> findAll();
    List<RolEntity> findAllCustom();
    RolEntity findById(Integer id);
    RolEntity add(RolEntity obj);
    RolEntity update(RolEntity obj, Integer id);
    RolEntity delete(Integer id);
    RolEntity enable(Integer id);
}
