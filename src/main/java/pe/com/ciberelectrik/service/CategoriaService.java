package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.CategoriaEntity;
import java.util.List;

public interface CategoriaService {
    List<CategoriaEntity> findAll();
    List<CategoriaEntity> findAllCustom();
    CategoriaEntity findById(Integer id);
    CategoriaEntity add(CategoriaEntity obj);
    CategoriaEntity update(CategoriaEntity obj, Integer id);
    CategoriaEntity delete(Integer id);
    CategoriaEntity enable(Integer id);
}
