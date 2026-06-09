package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface TipoDocumentoRepository extends GenericoRepository<TipoDocumentoEntity, Long> {
    @Query("SELECT t FROM TipoDocumentoEntity t WHERE t.estado = true")
    List<TipoDocumentoEntity> findAllCustom();
}
