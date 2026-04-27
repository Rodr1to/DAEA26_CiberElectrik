package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.repository.ProductoRepository;
import pe.com.ciberelectrik.service.ProductoService;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<ProductoEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public ProductoEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public ProductoEntity add(ProductoEntity obj) { return repositorio.save(obj); }

    @Override
    public ProductoEntity update(ProductoEntity obj, Integer id) {
        ProductoEntity objpro = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objpro, "codpro");
        return repositorio.save(objpro);
    }

    @Override
    public ProductoEntity delete(Integer id) {
        ProductoEntity objpro = repositorio.findById(id).get();
        objpro.setEstpro(false);
        return repositorio.save(objpro);
    }

    @Override
    public ProductoEntity enable(Integer id) {
        ProductoEntity objpro = repositorio.findById(id).get();
        objpro.setEstpro(true);
        return repositorio.save(objpro);
    }
}
