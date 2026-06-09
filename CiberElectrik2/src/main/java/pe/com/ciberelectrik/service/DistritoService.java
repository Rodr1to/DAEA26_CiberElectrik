package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.DistritoEntity;
import java.util.List;

public interface DistritoService {

    List<DistritoEntity> findAll();
    List<DistritoEntity> findAllCustom();
    DistritoEntity findById(Long id);
    DistritoEntity add(DistritoEntity obj);
    DistritoEntity update(DistritoEntity obj, Long id);
    DistritoEntity delete(Long id);
    DistritoEntity enable(Long id);

}
