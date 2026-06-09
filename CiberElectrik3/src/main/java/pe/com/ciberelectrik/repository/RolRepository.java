package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.RolEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface RolRepository extends GenericoRepository<RolEntity, Long> {
    @Query("SELECT r FROM RolEntity r WHERE r.estado = true")
    List<RolEntity> findAllCustom();
}
