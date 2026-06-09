package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.ProductoEntity;
import java.util.List;

public interface ProductoService {
    List<ProductoEntity> findAll();
    List<ProductoEntity> findAllCustom();
    ProductoEntity findById(Long id);
    ProductoEntity add(ProductoEntity obj);
    ProductoEntity update(ProductoEntity obj, Long id);
    ProductoEntity delete(Long id);
    ProductoEntity enable(Long id);
}
