package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.DistritoEntity;
import java.util.List;

@Repository
public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {
    @Query("SELECT d FROM DistritoEntity d WHERE d.estdis = true")
    List<DistritoEntity> findAllCustom();
}
