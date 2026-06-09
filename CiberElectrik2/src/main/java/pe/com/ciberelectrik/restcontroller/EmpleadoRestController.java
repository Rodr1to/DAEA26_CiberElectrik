package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.EmpleadoEntity;
import pe.com.ciberelectrik.service.EmpleadoService;
import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService servicio;

    @GetMapping
    public List<EmpleadoEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public EmpleadoEntity findById(@PathVariable Long id) { return servicio.findById(id); }

    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public EmpleadoEntity update(@RequestBody EmpleadoEntity obj, @PathVariable Long id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable Long id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public EmpleadoEntity enable(@PathVariable Long id) { return servicio.enable(id); }
}