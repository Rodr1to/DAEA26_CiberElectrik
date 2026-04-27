package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.SexoEntity;
import pe.com.ciberelectrik.repository.SexoRepository;
import pe.com.ciberelectrik.service.SexoService;
import java.util.List;

@Service
public class SexoServiceImpl implements SexoService {

    @Autowired
    private SexoRepository repositorio;

    @Override
    public List<SexoEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<SexoEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public SexoEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public SexoEntity add(SexoEntity obj) { return repositorio.save(obj); }

    @Override
    public SexoEntity update(SexoEntity obj, Integer id) {
        SexoEntity objsex = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objsex, "codsex");
        return repositorio.save(objsex);
    }

    @Override
    public SexoEntity delete(Integer id) {
        SexoEntity objsex = repositorio.findById(id).get();
        objsex.setEstsex(false);
        return repositorio.save(objsex);
    }

    @Override
    public SexoEntity enable(Integer id) {
        SexoEntity objsex = repositorio.findById(id).get();
        objsex.setEstsex(true);
        return repositorio.save(objsex);
    }
}
