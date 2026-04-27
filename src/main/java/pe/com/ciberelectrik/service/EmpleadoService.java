package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.EmpleadoEntity;
import java.util.List;

public interface EmpleadoService {
    List<EmpleadoEntity> findAll();
    List<EmpleadoEntity> findAllCustom();
    EmpleadoEntity findById(Integer id);
    EmpleadoEntity add(EmpleadoEntity obj);
    EmpleadoEntity update(EmpleadoEntity obj, Integer id);
    EmpleadoEntity delete(Integer id);
    EmpleadoEntity enable(Integer id);
}