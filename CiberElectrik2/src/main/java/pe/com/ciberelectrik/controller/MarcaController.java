package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MarcaController {
    @GetMapping("/marca/listar") public String listarMarca() {
        return "marca/listarmarca";
    }

    @GetMapping("/marca/registro") public String registrarMarca() {
        return "marca/registrarmarca";
    }

    @GetMapping("/marca/actualiza") public String actualizarMarca() {
        return "marca/actualizarmarca";
    }

    @GetMapping("/marca/habilita") public String habilitarMarca() {
        return "marca/habilitarmarca";
    }
}
