package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import java.util.List;

public interface TipoDocumentoService {
    List<TipoDocumentoEntity> findAll();
    List<TipoDocumentoEntity> findAllCustom();
    TipoDocumentoEntity findById(Long id);
    TipoDocumentoEntity add(TipoDocumentoEntity obj);
    TipoDocumentoEntity update(TipoDocumentoEntity obj, Long id);
    TipoDocumentoEntity delete(Long id);
    TipoDocumentoEntity enable(Long id);
}