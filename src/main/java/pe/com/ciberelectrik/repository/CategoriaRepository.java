package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    @Query("SELECT c FROM CategoriaEntity c WHERE c.estado = true")
    List<CategoriaEntity> findAllCustom();
}
