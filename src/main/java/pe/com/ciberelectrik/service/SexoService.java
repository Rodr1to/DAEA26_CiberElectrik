package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.SexoEntity;
import java.util.List;

public interface SexoService {
    List<SexoEntity> findAll();
    List<SexoEntity> findAllCustom();
    SexoEntity findById(Integer id);
    SexoEntity add(SexoEntity obj);
    SexoEntity update(SexoEntity obj, Integer id);
    SexoEntity delete(Integer id);
    SexoEntity enable(Integer id);
}
