package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.SexoEntity;
import pe.com.ciberelectrik.service.SexoService;
import java.util.List;

@RestController
@RequestMapping("/sexo")
public class SexoRestController {

    @Autowired
    private SexoService servicio;

    @GetMapping
    public List<SexoEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<SexoEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public SexoEntity findById(@PathVariable Long id) { return servicio.findById(id); }

    @PostMapping
    public SexoEntity add(@RequestBody SexoEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public SexoEntity update(@RequestBody SexoEntity obj, @PathVariable Long id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public SexoEntity delete(@PathVariable Long id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public SexoEntity enable(@PathVariable Long id) { return servicio.enable(id); }
}
