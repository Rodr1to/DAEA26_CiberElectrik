package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.ClienteEntity;
import java.util.List;

public interface ClienteService {
    List<ClienteEntity> findAll();
    List<ClienteEntity> findAllCustom();
    ClienteEntity findById(Long id);
    ClienteEntity add(ClienteEntity obj);
    ClienteEntity update(ClienteEntity obj, Long id);
    ClienteEntity delete(Long id);
    ClienteEntity enable(Long id);
}
