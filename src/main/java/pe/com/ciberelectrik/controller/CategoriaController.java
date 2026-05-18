package pe.com.ciberelectrik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CategoriaController {
    // rutas
    @GetMapping("/categoria/listar")
    public String MostrarListarCategoria(){
        return "categoria/listarcategoria";
    }

    @GetMapping("/categoria/registro")
    public String MostrarRegistrarCategoria(){
        return "categoria/registrarcategoria";
    }

    @GetMapping("/categoria/actualizar")
    public String MostrarActualizarCategoria(){
        return "categoria/actualizarcategoria";
    }

    @GetMapping("/categoria/habilita")
    public String MostrarHabilitarCategoria(){
        return "categoria/habilitarcategoria";
    }
}