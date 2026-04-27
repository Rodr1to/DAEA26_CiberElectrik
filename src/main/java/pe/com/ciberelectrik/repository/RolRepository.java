package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.RolEntity;
import java.util.List;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Integer> {
    @Query("SELECT r FROM RolEntity r WHERE r.estrol = true")
    List<RolEntity> findAllCustom();
}
