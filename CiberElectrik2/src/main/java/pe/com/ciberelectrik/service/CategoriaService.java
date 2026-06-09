package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.CategoriaEntity;
import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> findAll();
    List<CategoriaEntity> findAllCustom();
    CategoriaEntity findById(Long id);
    CategoriaEntity add(CategoriaEntity obj);
    CategoriaEntity update(CategoriaEntity obj, Long id);
    CategoriaEntity delete(Long id);
    CategoriaEntity enable(Long id);
}
