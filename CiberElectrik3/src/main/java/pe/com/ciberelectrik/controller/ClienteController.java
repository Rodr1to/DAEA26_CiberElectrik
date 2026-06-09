package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/cliente/listar") public String listarCliente() {
        return "cliente/listarcliente";
    }

    @GetMapping("/cliente/registro") public String registrarCliente() {
        return "cliente/registrarcliente";
    }

    @GetMapping("/cliente/actualiza") public String actualizarCliente() {
        return "cliente/actualizarcliente";
    }

    @GetMapping("/cliente/habilita") public String habilitarCliente() {
        return "cliente/habilitarcliente";
    }
}
