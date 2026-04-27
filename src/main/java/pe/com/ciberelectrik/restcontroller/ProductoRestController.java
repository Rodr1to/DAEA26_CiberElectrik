package pe.com.ciberelectrik.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.service.ProductoService;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {

    @Autowired
    private ProductoService servicio;

    @GetMapping
    public List<ProductoEntity> findAll() { return servicio.findAll(); }

    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom() { return servicio.findAllCustom(); }

    @GetMapping("/{id}")
    public ProductoEntity findById(@PathVariable Integer id) { return servicio.findById(id); }

    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity obj) { return servicio.add(obj); }

    @PutMapping("/{id}")
    public ProductoEntity update(@RequestBody ProductoEntity obj, @PathVariable Integer id) { return servicio.update(obj, id); }

    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable Integer id) { return servicio.delete(id); }

    @PutMapping("/enable/{id}")
    public ProductoEntity enable(@PathVariable Integer id) { return servicio.enable(id); }
}
