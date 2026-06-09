package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.ClienteEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface ClienteRepository extends GenericoRepository<ClienteEntity, Long> {
    @Query("SELECT c FROM ClienteEntity c WHERE c.estado = true")
    List<ClienteEntity> findAllCustom();
}
