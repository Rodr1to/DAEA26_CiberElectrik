package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DistritoController {

    @GetMapping("/distrito/listar") public String listarDistrito() {
        return "distrito/listardistrito";
    }

    @GetMapping("/distrito/registro") public String registrarDistrito() {
        return "distrito/registrardistrito";
    }

    @GetMapping("/distrito/actualiza") public String actualizarDistrito() {
        return "distrito/actualizardistrito";
    }

    @GetMapping("/distrito/habilita") public String habilitarDistrito() {
        return "distrito/habilitardistrito";
    }
}
