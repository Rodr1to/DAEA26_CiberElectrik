package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.ciberelectrik.entity.ClienteEntity;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    @Query("SELECT c FROM ClienteEntity c WHERE c.estcli = true")
    List<ClienteEntity> findAllCustom();
}
