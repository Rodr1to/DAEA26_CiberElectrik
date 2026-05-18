package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SexoController {

    @GetMapping("/sexo/listar") public String listarSexo() {
        return "sexo/listarsexo";
    }

    @GetMapping("/sexo/registro") public String registrarSexo() {
        return "sexo/registrarsexo";
    }

    @GetMapping("/sexo/actualiza") public String actualizarSexo() {
        return "sexo/actualizarsexo";
    }

    @GetMapping("/sexo/habilita") public String habilitarSexo() {
        return "sexo/habilitarsexo";
    }
}
