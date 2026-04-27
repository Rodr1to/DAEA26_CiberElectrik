package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.RolEntity;
import pe.com.ciberelectrik.repository.RolRepository;
import pe.com.ciberelectrik.service.RolService;
import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository repositorio;

    @Override
    public List<RolEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<RolEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public RolEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public RolEntity add(RolEntity obj) { return repositorio.save(obj); }

    @Override
    public RolEntity update(RolEntity obj, Integer id) {
        RolEntity objrol = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objrol, "codrol");
        return repositorio.save(objrol);
    }

    @Override
    public RolEntity delete(Integer id) {
        RolEntity objrol = repositorio.findById(id).get();
        objrol.setEstrol(false);
        return repositorio.save(objrol);
    }

    @Override
    public RolEntity enable(Integer id) {
        RolEntity objrol = repositorio.findById(id).get();
        objrol.setEstrol(true);
        return repositorio.save(objrol);
    }
}
