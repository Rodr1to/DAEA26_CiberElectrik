package pe.com.ciberelectrik.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.service.CategoriaService;

@Controller
public class CategoriaController {
    //inyeccion de dependencia con anotacion
    //@Autowired
    //private CategoriaService servicio;

    //cramos un objeto de el repositorio
    private final CategoriaService servicio;

    //inyeccion de dependencia
    public CategoriaController(CategoriaService servicio) {
        this.servicio=servicio;
    }

    //rutas
    //listar categoria
    @GetMapping("/categoria/listar")
    //el objeto Model -> sirve para pasar datos hacia la vista (Thymeleaf)
    public String MostrarListarCategoria(Model modelo) {
        modelo.addAttribute("listarcategoria",servicio.findAllCustom());
        return "categoria/listarcategoria";
    }

    //registrar categoria
    @GetMapping("/categoria/registro")
    public String MostrarRegistrarCategoria() {
        return "categoria/registrarcategoria";
    }

    //actualizar categoria
    @GetMapping("/categoria/actualiza/{id}")
    public String MostrarActualizarCategoria(Model modelo, @PathVariable Long id) {
        modelo.addAttribute("listarcategoria",servicio.findById(id));
        return "categoria/actualizarcategoria";
    }

    //habilitar categoria
    @GetMapping("/categoria/habilita")
    public String MostrarHabilitarCategoria(Model modelo) {
        modelo.addAttribute("listarcategoria",servicio.findAll());
        return "categoria/habilitarcategoria";
    }

    //acciones de rutas
    //eliminar categoria
    @GetMapping("/categoria/eliminar/{id}")
    public String EliminarCategoria(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/categoria/listar";
    }

    //habilitar
    @GetMapping("/categoria/habilitar/{id}")
    public String HabilitarCategoria(@PathVariable Long id) {
        servicio.enable(id);
        return "redirect:/categoria/habilita";
    }

    //deshabilitar
    @GetMapping("/categoria/deshabilitar/{id}")
    public String DeshabilitarCategoria(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/categoria/habilita";
    }

    //creamos un modelo para pasar datos entre el controlador y la vista y tambien
    //recibi datos enviados desde el formulario
    @ModelAttribute("categoria")
    public CategoriaEntity ModeloCategoria() {
        return new CategoriaEntity();
    }

    //acciones
    @PostMapping("/categoria/registrar")
    public String RegistrarCategoria(@ModelAttribute("categoria") CategoriaEntity obj) {
        servicio.add(obj);
        return "redirect:/categoria/listar";
    }

    @PostMapping("/categoria/actualizar/{id}")
    public String ActualizarCategoria(@ModelAttribute("categoria") CategoriaEntity obj,
                                      @PathVariable Long id) {
        servicio.update(obj,id);
        return "redirect:/categoria/listar";
    }

}