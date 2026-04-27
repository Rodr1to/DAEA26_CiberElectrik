package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.EmpleadoEntity;
import pe.com.ciberelectrik.repository.EmpleadoRepository;
import pe.com.ciberelectrik.service.EmpleadoService;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository repositorio;

    @Override
    public List<EmpleadoEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<EmpleadoEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public EmpleadoEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public EmpleadoEntity add(EmpleadoEntity obj) { return repositorio.save(obj); }

    @Override
    public EmpleadoEntity update(EmpleadoEntity obj, Integer id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objemp, "codemp");
        return repositorio.save(objemp);
    }

    @Override
    public EmpleadoEntity delete(Integer id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        objemp.setEstemp(false);
        return repositorio.save(objemp);
    }

    @Override
    public EmpleadoEntity enable(Integer id) {
        EmpleadoEntity objemp = repositorio.findById(id).get();
        objemp.setEstemp(true);
        return repositorio.save(objemp);
    }
}
