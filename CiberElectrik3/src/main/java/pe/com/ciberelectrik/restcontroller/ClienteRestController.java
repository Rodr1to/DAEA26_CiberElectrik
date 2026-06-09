package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.ClienteEntity;
import pe.com.ciberelectrik.service.ClienteService;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService servicio;

    @GetMapping
    public List<ClienteEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public ClienteEntity findById(@PathVariable Long id) { return servicio.findById(id); }

    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public ClienteEntity update(@RequestBody ClienteEntity obj, @PathVariable Long id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable Long id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public ClienteEntity enable(@PathVariable Long id) { return servicio.enable(id); }
}