package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface CategoriaRepository extends GenericoRepository<CategoriaEntity, Long> {
    @Query("SELECT c FROM CategoriaEntity c WHERE c.estado = true")
    List<CategoriaEntity> findAllCustom();
}
