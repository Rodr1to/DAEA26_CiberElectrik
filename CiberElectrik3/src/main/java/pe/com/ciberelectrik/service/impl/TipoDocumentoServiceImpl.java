package pe.com.ciberelectrik.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import pe.com.ciberelectrik.repository.TipoDocumentoRepository;
import pe.com.ciberelectrik.service.TipoDocumentoService;
import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository repositorio;

    @Override
    public List<TipoDocumentoEntity> findAll() { return repositorio.findAll(); }

    @Override
    public List<TipoDocumentoEntity> findAllCustom() { return repositorio.findAllCustom(); }

    @Override
    public TipoDocumentoEntity findById(Long id) { return repositorio.findById(id).get(); }

    @Override
    public TipoDocumentoEntity add(TipoDocumentoEntity obj) { return repositorio.save(obj); }

    @Override
    public TipoDocumentoEntity update(TipoDocumentoEntity obj, Long id) {
        TipoDocumentoEntity objtipd = repositorio.findById(id).get();
        BeanUtils.copyProperties(obj, objtipd, "codtipd");
        return repositorio.save(objtipd);
    }

    @Override
    public TipoDocumentoEntity delete(Long id) {
        TipoDocumentoEntity objtipd = repositorio.findById(id).get();
        objtipd.setEstado(false);
        return repositorio.save(objtipd);
    }

    @Override
    public TipoDocumentoEntity enable(Long id) {
        TipoDocumentoEntity objtipd = repositorio.findById(id).get();
        objtipd.setEstado(true);
        return repositorio.save(objtipd);
    }
}
