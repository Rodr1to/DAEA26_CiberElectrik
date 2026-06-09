package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.EmpleadoEntity;
import java.util.List;

public interface EmpleadoService {
    List<EmpleadoEntity> findAll();
    List<EmpleadoEntity> findAllCustom();
    EmpleadoEntity findById(Long id);
    EmpleadoEntity add(EmpleadoEntity obj);
    EmpleadoEntity update(EmpleadoEntity obj, Long id);
    EmpleadoEntity delete(Long id);
    EmpleadoEntity enable(Long id);
}