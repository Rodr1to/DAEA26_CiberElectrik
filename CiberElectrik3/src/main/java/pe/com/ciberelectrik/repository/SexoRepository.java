package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.SexoEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface SexoRepository extends GenericoRepository<SexoEntity, Long> {
    @Query("SELECT s FROM SexoEntity s WHERE s.estado = true")
    List<SexoEntity> findAllCustom();
}