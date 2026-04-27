package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.ClienteEntity;
import java.util.List;

public interface ClienteService {
    List<ClienteEntity> findAll();
    List<ClienteEntity> findAllCustom();
    ClienteEntity findById(Integer id);
    ClienteEntity add(ClienteEntity obj);
    ClienteEntity update(ClienteEntity obj, Integer id);
    ClienteEntity delete(Integer id);
    ClienteEntity enable(Integer id);
}
