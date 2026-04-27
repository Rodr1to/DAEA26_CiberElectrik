package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.service.CategoriaService;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {

    @Autowired
    private CategoriaService servicio;

    @GetMapping
    public List<CategoriaEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<CategoriaEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public CategoriaEntity findById(@PathVariable Integer id) { return servicio.findById(id); }

    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public CategoriaEntity update(@RequestBody CategoriaEntity obj, @PathVariable Integer id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable Integer id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public CategoriaEntity enable(@PathVariable Integer id) { return servicio.enable(id); }
}