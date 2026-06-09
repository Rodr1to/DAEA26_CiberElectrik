package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RolController {

    @GetMapping("/rol/listar") public String listarRol() {
        return "rol/listarrol"; }

    @GetMapping("/rol/registro") public String registrarRol() {
        return "rol/registrarrol";
    }

    @GetMapping("/rol/actualiza") public String actualizarRol() {
        return "rol/actualizarrol";
    }

    @GetMapping("/rol/habilita") public String habilitarRol() {
        return "rol/habilitarrol";
    }
}
