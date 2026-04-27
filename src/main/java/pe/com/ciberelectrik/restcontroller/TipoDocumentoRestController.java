package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.TipoDocumentoEntity;
import pe.com.ciberelectrik.service.TipoDocumentoService;
import java.util.List;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoRestController {

    @Autowired
    private TipoDocumentoService servicio;

    @GetMapping
    public List<TipoDocumentoEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<TipoDocumentoEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public TipoDocumentoEntity findById(@PathVariable Integer id) { return servicio.findById(id); }

    @PostMapping
    public TipoDocumentoEntity add(@RequestBody TipoDocumentoEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public TipoDocumentoEntity update(@RequestBody TipoDocumentoEntity obj, @PathVariable Integer id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public TipoDocumentoEntity delete(@PathVariable Integer id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public TipoDocumentoEntity enable(@PathVariable Integer id) { return servicio.enable(id); }
}
