package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.RolEntity;
import pe.com.ciberelectrik.service.RolService;
import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolRestController {

    @Autowired
    private RolService servicio;

    @GetMapping
    public List<RolEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<RolEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public RolEntity findById(@PathVariable Long id) { return servicio.findById(id); }

    @PostMapping
    public RolEntity add(@RequestBody RolEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public RolEntity update(@RequestBody RolEntity obj, @PathVariable Long id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable Long id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public RolEntity enable(@PathVariable Long id) { return servicio.enable(id); }
}
