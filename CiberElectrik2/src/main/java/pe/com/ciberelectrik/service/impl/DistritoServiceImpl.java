package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.DistritoEntity;
import pe.com.ciberelectrik.repository.DistritoRepository;
import pe.com.ciberelectrik.service.DistritoService;
import java.util.List;

@Service
public class DistritoServiceImpl implements DistritoService {

    @Autowired
    private DistritoRepository repositorio;

    @Override
    public List<DistritoEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<DistritoEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public DistritoEntity findById(Long id) { return repositorio.findById(id).get(); }

    @Override
    public DistritoEntity add(DistritoEntity obj) { return repositorio.save(obj); }

    @Override
    public DistritoEntity update(DistritoEntity obj, Long id) {
        DistritoEntity objdis = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objdis, "coddis");
        return repositorio.save(objdis);
    }

    @Override
    public DistritoEntity delete(Long id) {
        DistritoEntity objdis = repositorio.findById(id).get();
        objdis.setEstdis(false);
        return repositorio.save(objdis);
    }

    @Override
    public DistritoEntity enable(Long id) {
        DistritoEntity objdis = repositorio.findById(id).get();
        objdis.setEstdis(true);
        return repositorio.save(objdis);
    }
}
