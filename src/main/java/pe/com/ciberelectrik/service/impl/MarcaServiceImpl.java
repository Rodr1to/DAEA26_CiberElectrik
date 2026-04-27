package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.repository.MarcaRepository;
import pe.com.ciberelectrik.service.MarcaService;
import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepository repositorio;

    @Override
    public List<MarcaEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<MarcaEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public MarcaEntity findById(Integer id) { return repositorio.findById(id).get(); }

    @Override
    public MarcaEntity add(MarcaEntity obj) { return repositorio.save(obj); }

    @Override
    public MarcaEntity update(MarcaEntity obj, Integer id) {
        MarcaEntity objmar = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objmar, "codmar");
        return repositorio.save(objmar);
    }

    @Override
    public MarcaEntity delete(Integer id) {
        MarcaEntity objmar = repositorio.findById(id).get();
        objmar.setEstmar(false);
        return repositorio.save(objmar);
    }

    @Override
    public MarcaEntity enable(Integer id) {
        MarcaEntity objmar = repositorio.findById(id).get();
        objmar.setEstmar(true);
        return repositorio.save(objmar);
    }
}
