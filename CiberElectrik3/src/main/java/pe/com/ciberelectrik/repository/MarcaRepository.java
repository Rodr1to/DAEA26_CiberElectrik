package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.MarcaEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface MarcaRepository extends GenericoRepository<MarcaEntity, Long> {
    @Query("SELECT m FROM MarcaEntity m WHERE m.estado = true")
    List<MarcaEntity> findAllCustom();
}
