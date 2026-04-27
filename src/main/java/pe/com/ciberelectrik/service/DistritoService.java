package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.DistritoEntity;
import java.util.List;

public interface DistritoService {

    List<DistritoEntity> findAll();
    List<DistritoEntity> findAllCustom();
    DistritoEntity findById(Integer id);
    DistritoEntity add(DistritoEntity obj);
    DistritoEntity update(DistritoEntity obj, Integer id);
    DistritoEntity delete(Integer id);
    DistritoEntity enable(Integer id);

}
