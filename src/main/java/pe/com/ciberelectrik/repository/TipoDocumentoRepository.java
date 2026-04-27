package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import java.util.List;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Integer> {
    @Query("SELECT t FROM TipoDocumentoEntity t WHERE t.esttipd = true")
    List<TipoDocumentoEntity> findAllCustom();
}
