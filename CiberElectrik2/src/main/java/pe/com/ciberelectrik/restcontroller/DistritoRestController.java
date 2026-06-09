package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.DistritoEntity;
import pe.com.ciberelectrik.service.DistritoService;
import java.util.List;

@RestController
@RequestMapping("/distrito")
public class DistritoRestController {

    @Autowired
    private DistritoService servicio;

    @GetMapping
    public List<DistritoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public DistritoEntity findById(@PathVariable Long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity obj) {
        return servicio.add(obj);
    }

    @PutMapping("/{id}")
    public DistritoEntity update(@RequestBody DistritoEntity obj, @PathVariable Long id) {
        return servicio.update(obj, id);
    }

    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable Long id) {
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public DistritoEntity enable(@PathVariable Long id) {
        return servicio.enable(id);
    }
}
