package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.repository.CategoriaRepository;
import pe.com.ciberelectrik.service.CategoriaService;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<CategoriaEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<CategoriaEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public CategoriaEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public CategoriaEntity add(CategoriaEntity obj) { return repositorio.save(obj); }

    @Override
    public CategoriaEntity update(CategoriaEntity obj, Integer id) {
        CategoriaEntity objcat = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objcat, "codcat");
        return repositorio.save(objcat);
    }

    @Override
    public CategoriaEntity delete(Integer id) {
        CategoriaEntity objcat = repositorio.findById(id).get();
        objcat.setEstcat(false);
        return repositorio.save(objcat);
    }

    @Override
    public CategoriaEntity enable(Integer id) {
        CategoriaEntity objcat = repositorio.findById(id).get();
        objcat.setEstcat(true);
        return repositorio.save(objcat);
    }
}
