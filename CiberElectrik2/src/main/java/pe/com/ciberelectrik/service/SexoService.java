package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.SexoEntity;
import java.util.List;

public interface SexoService {
    List<SexoEntity> findAll();
    List<SexoEntity> findAllCustom();
    SexoEntity findById(Long id);
    SexoEntity add(SexoEntity obj);
    SexoEntity update(SexoEntity obj, Long id);
    SexoEntity delete(Long id);
    SexoEntity enable(Long id);
}
