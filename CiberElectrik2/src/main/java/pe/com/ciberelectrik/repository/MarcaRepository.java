package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.MarcaEntity;
import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaEntity, Long> {
    @Query("SELECT m FROM MarcaEntity m WHERE m.estado = true")
    List<MarcaEntity> findAllCustom();
}
