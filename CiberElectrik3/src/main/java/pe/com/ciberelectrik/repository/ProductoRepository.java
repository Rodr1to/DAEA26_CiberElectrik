package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.repository.generic.GenericoRepository;

import java.util.List;

@Repository
public interface ProductoRepository extends GenericoRepository<ProductoEntity, Long> {
    @Query("SELECT p FROM ProductoEntity p WHERE p.estado = true")
    List<ProductoEntity> findAllCustom();
}
