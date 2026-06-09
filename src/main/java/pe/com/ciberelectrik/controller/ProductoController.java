package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.service.CategoriaService;
import pe.com.ciberelectrik.service.MarcaService;
import pe.com.ciberelectrik.service.ProductoService;

@Controller
public class ProductoController {

    private final ProductoService servicio;
    private final MarcaService serviciomar;
    private final CategoriaService serviciocat;


    public ProductoController(ProductoService servicio, MarcaService serviciomar,
                              CategoriaService serviciocat) {
        this.servicio=servicio;
        this.serviciomar=serviciomar;
        this.serviciocat=serviciocat;
    }

    //rutas
    @GetMapping("/producto/listar")
    public String MostrarListarProducto(Model modelo) {
        modelo.addAttribute("listarproducto",servicio.findAllCustom());
        return "producto/listarproducto";
    }

    //registrar
    @GetMapping("/producto/registro")
    public String MostrarRegistrarProducto(Model modelo) {
        modelo.addAttribute("listarmarca",serviciomar.findAllCustom());
        modelo.addAttribute("listarcategoria",serviciocat.findAllCustom());
        return "producto/registrarproducto";
    }

    //actualizar
    @GetMapping("/producto/actualiza/{id}")
    public String MostrarActualizarProducto(Model modelo, @PathVariable Long id) {
        modelo.addAttribute("listarmarca",serviciomar.findAllCustom());
        modelo.addAttribute("listarcategoria",serviciocat.findAllCustom());
        modelo.addAttribute("listarproducto",servicio.findById(id));
        return "producto/actualizarproducto";
    }

    //habilitar
    @GetMapping("/producto/habilita")
    public String MostrarHabilitarProducto(Model modelo) {
        modelo.addAttribute("listarproducto",servicio.findAll());
        return "producto/habilitarproducto";
    }

    //acciones de rutas
    //eliminar
    @GetMapping("/producto/eliminar/{id}")
    public String EliminarProducto(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/producto/listar";
    }

    //habilitar
    @GetMapping("/producto/habilitar/{id}")
    public String HabilitarProducto(@PathVariable Long id) {
        servicio.enable(id);
        return "redirect:/producto/habilita";
    }

    //deshabilitar
    @GetMapping("/producto/deshabilitar/{id}")
    public String DeshabilitarProducto(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/producto/habilita";
    }

    //creamos un modelo
    @ModelAttribute("producto")
    public ProductoEntity ModeloCategoria() {
        return new ProductoEntity();
    }

    //acciones
    @PostMapping("/producto/registrar")
    public String RegistrarProducto(@ModelAttribute("producto") ProductoEntity obj) {
        servicio.add(obj);
        return "redirect:/producto/listar";
    }

    @PostMapping("/producto/actualizar/{id}")
    public String ActualizarProducto(@ModelAttribute("producto") ProductoEntity obj,
                                     @PathVariable Long id) {
        servicio.update(obj,id);
        return "redirect:/producto/listar";
    }
}

