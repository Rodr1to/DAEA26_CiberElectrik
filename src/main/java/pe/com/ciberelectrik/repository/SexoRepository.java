package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.SexoEntity;
import java.util.List;

@Repository
public interface SexoRepository extends JpaRepository<SexoEntity, Integer> {
    @Query("SELECT s FROM SexoEntity s WHERE s.estsex = true")
    List<SexoEntity> findAllCustom();
}