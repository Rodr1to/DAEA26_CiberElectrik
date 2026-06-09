package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.EmpleadoEntity;
import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
    @Query("SELECT e FROM EmpleadoEntity e WHERE e.estemp = true")
    List<EmpleadoEntity> findAllCustom();
}
