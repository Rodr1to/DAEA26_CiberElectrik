package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import java.util.List;

public interface TipoDocumentoService {
    List<TipoDocumentoEntity> findAll();
    List<TipoDocumentoEntity> findAllCustom();
    TipoDocumentoEntity findById(Integer id);
    TipoDocumentoEntity add(TipoDocumentoEntity obj);
    TipoDocumentoEntity update(TipoDocumentoEntity obj, Integer id);
    TipoDocumentoEntity delete(Integer id);
    TipoDocumentoEntity enable(Integer id);
}