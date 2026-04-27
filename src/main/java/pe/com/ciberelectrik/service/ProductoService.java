package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.ProductoEntity;
import java.util.List;

public interface ProductoService {
    List<ProductoEntity> findAll();
    List<ProductoEntity> findAllCustom();
    ProductoEntity findById(Integer id);
    ProductoEntity add(ProductoEntity obj);
    ProductoEntity update(ProductoEntity obj, Integer id);
    ProductoEntity delete(Integer id);
    ProductoEntity enable(Integer id);
}
