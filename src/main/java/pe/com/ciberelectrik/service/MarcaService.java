package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.MarcaEntity;
import java.util.List;

public interface MarcaService {
    List<MarcaEntity> findAll();
    List<MarcaEntity> findAllCustom();
    MarcaEntity findById(Integer id);
    MarcaEntity add(MarcaEntity obj);
    MarcaEntity update(MarcaEntity obj, Integer id);
    MarcaEntity delete(Integer id);
    MarcaEntity enable(Integer id);
}
