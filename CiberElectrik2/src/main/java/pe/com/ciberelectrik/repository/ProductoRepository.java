package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.ProductoEntity;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
    @Query("SELECT p FROM ProductoEntity p WHERE p.estado = true")
    List<ProductoEntity> findAllCustom();
}
