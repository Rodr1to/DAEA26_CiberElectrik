package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.EmpleadoEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends GenericoRepository<EmpleadoEntity, Long> {
    @Query("SELECT e FROM EmpleadoEntity e WHERE e.estado = true")
    List<EmpleadoEntity> findAllCustom();
}
